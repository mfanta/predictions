package cz.mfanta.predictions.dto;

import lombok.Value;

import java.time.Instant;

@Value
public class Fixture {

    private Instant dateAndTime;

    private Team homeTeam;

    private Team awayTeam;

    private Competition competition;

    private Season season;
}
