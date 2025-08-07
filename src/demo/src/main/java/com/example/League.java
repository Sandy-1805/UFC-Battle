package com.example;

import java.time.LocalDate;

public class League{
    private String name;
    private Match match;
    private MatchType matchType;

    public enum MatchType {
        Amical,
        Officiel,
        Championnat
    }

    public League(String name, Match match, MatchType amical) {
        this.name = name;
        this.match = match;
    }

    public String getName() {
        return name;
    }

    public Match getMatch() {
        return match;
    }


    public static void main(String[] args) {
        Fighters fighter = new Fighters("1", "Doe", "John", "The Beast", 85, "Champion");
        Fighters fighter2 = new Fighters("2", "Smith", "Jane", "The Warrior", 75, "No titles");
        League league = new League("Ultimate Fighting Championship", match, MatchType.Amical);

        if (MatchType.Amical == MatchType.Amical) {
            System.out.println("This is an Amical match in the " + league.getName() + " league.");
        } else {
            System.out.println("This is not an Amical match.");   
        }
        Match match = new Match(1, LocalDate.of(2025, 10, 1), "Las Vegas", fighter);
        System.out.println(fighter.getFightersName() + " vs " + fighter2.getFightersName() + " on " + match.getDate() + " at " + match.getLocation());

        System.out.println("League Name: " + league.getName());
        System.out.println("Match Date: " + league.getMatch().getDate());

        if (league.getMatch().getFight() != null) {
            System.out.println("Fighter in the match: " + league.getMatch().getFight().getFightersName());
        } else {
            System.out.println("No fighter in the match.");
        }

        if (MatchType.Championnat == MatchType.Championnat) {
            System.out.println("This is a Championship match in the " + league.getName() + " league.");
        } else {
            System.out.println("This is not a Championship match.");
        }

        if (MatchType.Officiel == MatchType.Officiel) {
            System.out.println("This is an Official match in the " + league.getName() + " league.");
        } else {
            System.out.println("This is not an Official match.");
        }


    }
}