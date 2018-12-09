package cz.mfanta.predictions.reader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

class JsonFixtureReaderTest {

    private JsonFixtureReader reader;

    @BeforeEach
    void setUp() {
        reader = new JsonFixtureReader();
    }

    @Test
    public void returnsEmptyFixtures() {
        assertThat(reader.readFixtures(mock(InputStream.class))).isEmpty();
    }
}