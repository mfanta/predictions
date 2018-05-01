package cz.mfanta.predictions.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;

@Getter @Builder
public class Fixture {

    private Instant dateAndTime;

    private Team homeTeam;

    private Team awayTeam;

    private Competition competition;

    private Season season;
}
