package cz.mfanta.predictions.objectmapper;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class InstantDeserializer extends JsonDeserializer<Instant> {

    // 2017-02-22, 21:05 CET
    private static final String DATE_FORMAT_STRING = "yyyy-MM-dd, HH:mm z";
    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern(DATE_FORMAT_STRING);

    @Override
    public Instant deserialize(
            JsonParser jsonParser,
            DeserializationContext deserializationContext
    ) throws IOException {
        return Instant.from(FORMATTER.parse(jsonParser.getText()));
    }
}
