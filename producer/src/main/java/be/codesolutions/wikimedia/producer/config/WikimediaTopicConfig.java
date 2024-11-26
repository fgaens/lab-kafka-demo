package be.codesolutions.wikimedia.producer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class WikimediaTopicConfig {

    @Value("${application.kafka.topic}")
    private String topicName;

    @Bean
    public NewTopic wikimediaStreamTopic() {
        return TopicBuilder
                .name(topicName)
                .build();
    }
}
