package com.example;

import java.time.LocalDate;

public class Match {
    private int id;
    private LocalDate date;
    private String location;
    private Fighters fight;


    public Match(int id, LocalDate date, String location, Fighters fight) {
        this.id = id;
        this.date = date;
        this.location = location;
        this.fight = fight;
    }

    public int getId() {
        return id;
    }
    public LocalDate getDate() {
        return date;
    }
    public String getLocation() {
        return location;
    }
    public Fighters getFight() {
        return fight;
    }
    

    public static void main(String[] args) {
        Fighters fighter = new Fighters("1", "Doe", "John", "The Beast", 85, "Champion");
        Fighters fighter2 = new Fighters("2", "Smith", "Jane", "The Warrior", 75, "No titles");
        Match match = new Match(1, LocalDate.of(2025, 10, 1), "Las Vegas", fighter);
        System.out.println(fighter.getFightersName() + " vs " + fighter2.getFightersName() + " on " + match.getDate() + " at " + match.getLocation());
    }

}