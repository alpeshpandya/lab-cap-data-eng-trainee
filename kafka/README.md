```brew install gradle```

brew install kafka

```bin/kafka-console-producer.sh --broker-list localhost:9092 --topic ranbir_test```

```bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --offset 'earliest'  --topic ranbir_test ```

```bin/kafka-topics.sh --describe --zookeeper 10.2.48.100:2181,10.2.49.100:2181,10.2.50.100:2181 --topic ranbir_test```
