package cz.mfanta.predictions.fe.configuration;

import cz.mfanta.predictions.fe.controller.FrontendResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FrontendControllerConfiguration {

    @Bean
    public FrontendResource frontendResource() {
        return new FrontendResource();
    }
}
