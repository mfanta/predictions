package cz.mfanta.predictions.init;

import cz.mfanta.predictions.config.FixtureReaderConfig;
import cz.mfanta.predictions.fe.configuration.FrontendControllerConfiguration;
import cz.mfanta.predictions.config.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        FrontendControllerConfiguration.class,
        ResourceConfig.class,
        FixtureReaderConfig.class
})
@EnableAutoConfiguration
public class PredictionsInit {

    public static void main(String[] args) {
        SpringApplication.run(PredictionsInit.class, args);
    }
}
