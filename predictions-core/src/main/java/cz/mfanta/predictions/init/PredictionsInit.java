package cz.mfanta.predictions.init;

import cz.mfanta.predictions.fe.configuration.FrontendControllerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FrontendControllerConfiguration.class
})
@EnableAutoConfiguration
public class PredictionsInit {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PredictionsInit.class, args);
    }
}
