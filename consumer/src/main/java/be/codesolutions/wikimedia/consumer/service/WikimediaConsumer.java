package be.codesolutions.wikimedia.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class WikimediaConsumer {

    @Value("${application.kafka.topic}")
    private String topic;

    @KafkaListener(topics = "${application.kafka.topic}", groupId = "${application.kafka.group}")
    public void consume(String message) {
        log.info("Consuming message: {} from topic: {}", message, topic);
    }
}
