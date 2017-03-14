package cz.mfanta.predictions.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceConfiguration {

    @Bean
    public UserNameResource userNameResource() {
        return new UserNameResource();
    }
}
