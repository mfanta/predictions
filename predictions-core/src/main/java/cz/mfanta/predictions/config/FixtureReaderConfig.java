package cz.mfanta.predictions.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import cz.mfanta.predictions.reader.JsonFixtureReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ObjectMapperConfig.class)
public class FixtureReaderConfig {

    @Bean
    public JsonFixtureReader jsonFixtureReader(ObjectMapper objectMapper) {
        return new JsonFixtureReader(objectMapper);
    }
}
