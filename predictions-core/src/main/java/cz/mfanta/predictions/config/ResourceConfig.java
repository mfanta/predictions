package cz.mfanta.predictions.config;

import cz.mfanta.predictions.resource.UserNameResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceConfig {

    @Bean
    public UserNameResource userNameResource() {
        return new UserNameResource();
    }
}
