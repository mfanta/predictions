package cz.mfanta.predictions.reader;

import cz.mfanta.predictions.config.FixtureReaderConfig;
import cz.mfanta.predictions.dto.Competition;
import cz.mfanta.predictions.dto.Fixture;
import cz.mfanta.predictions.dto.Fixtures;
import cz.mfanta.predictions.dto.Team;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = FixtureReaderConfig.class)
class JsonFixtureReaderTest {

    @Autowired
    private JsonFixtureReader reader;

    @Test
    public void readsFixtures() throws IOException {
        try (InputStream fixturesInputStream = JsonFixtureReaderTest.class.getResourceAsStream("/sample-data/sample-fixtures.json")) {
            Fixtures fixtures = reader.readFixtures(fixturesInputStream);

            assertThat(fixtures).isNotNull();
            List<Fixture> fixtureList = fixtures.getFixtures();
            assertThat(fixtureList).hasSize(2);
            assertThat(fixtureList).containsExactly(
                    new Fixture(
                            // Note the timezone is converted to UTC
                            Instant.parse("2017-02-22T20:05:00.00Z"),
                            new Team("Arsenal"),
                            new Team("Östersunds"),
                            new Competition("UEFA Europa League"),
                            null // season not yet supported
                    ),
                    new Fixture(
                            // Note the timezone is converted to UTC
                            Instant.parse("2017-02-22T18:00:00.00Z"),
                            new Team("Plzeň"),
                            new Team("Partizan"),
                            new Competition("UEFA Europa League"),
                            null // season not yet supported
                    )
            );
        }
    }
}