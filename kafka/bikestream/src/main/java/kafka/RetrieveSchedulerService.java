package kafka;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kafka.model.Feed;
import kafka.model.Station;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class RetrieveSchedulerService {

    public static Logger logger = LoggerFactory.getLogger(KafkaProducer.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Autowired
    private KafkaProducer kafkaProducer;

    @Scheduled(initialDelay = 10000, fixedRate = 5000)
    public void ScheduledProducer() throws JsonProcessingException {
        String hardCodedUrl="https://gbfs.citibikenyc.com/gbfs/es/station_status.json";
        RestTemplate restTemplate = new RestTemplate();
        Feed feed = restTemplate
                .getForObject(hardCodedUrl, Feed.class);
        logger.info("BIKESHARE MESSAGE: "+feed.getLast_updated().toString());
        ObjectMapper mapper = new ObjectMapper();
        for(Station station: feed.getData().getStations()){
            kafkaProducer.sendMessage(feed.getLast_updated().toString(),mapper.writeValueAsString(station));
        }


    }
}
