package cz.mfanta.predictions.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import cz.mfanta.predictions.objectmapper.InstantDeserializer;
import lombok.Value;

import java.time.Instant;

@Value
public class Fixture {

    @JsonDeserialize(using = InstantDeserializer.class)
    private Instant dateAndTime;

    private Team homeTeam;

    private Team awayTeam;

    private Competition competition;

    private Season season;
}
