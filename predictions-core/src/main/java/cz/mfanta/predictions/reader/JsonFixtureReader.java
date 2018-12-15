package cz.mfanta.predictions.reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import cz.mfanta.predictions.dto.Fixtures;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.io.InputStream;

@RequiredArgsConstructor
public class JsonFixtureReader {

    private final ObjectMapper objectMapper;

    public Fixtures readFixtures(InputStream inputStream) throws IOException {
        return objectMapper.readValue(inputStream, Fixtures.class);
    }
}
