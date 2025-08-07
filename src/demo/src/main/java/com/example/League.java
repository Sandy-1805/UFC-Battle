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
    Fighters fighter2 = new Fighters("1", "Smith", "Jane", "The Warrior", 75, "No titles");
        League league = new League("Ultimate Fighting Championship", match, MatchType.Amical);

        if (MatchType.Amical == MatchType.Amical) {
            System.out.println("This is an Amical match in the " + league.getName() + " league.");
        } else {
            System.out.println("This is not an Amical match.");
            
        }
    }
}