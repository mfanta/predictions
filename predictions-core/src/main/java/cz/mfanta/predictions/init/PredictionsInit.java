package cz.mfanta.predictions.init;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
// Makes Spring Boot guess which beans we going to need
@EnableAutoConfiguration
public class PredictionsInit {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PredictionsInit.class, args);
    }
}
