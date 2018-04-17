package kafka.model;

import java.util.List;

public class Feed {
    private Long last_updated;
    private Integer ttl;

    public void setLast_updated(Long last_updated) {
        this.last_updated = last_updated;
    }

    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Long getLast_updated() {

        return last_updated;
    }

    public Integer getTtl() {
        return ttl;
    }

    public Data getData() {
        return data;
    }

    private Data data;
}
