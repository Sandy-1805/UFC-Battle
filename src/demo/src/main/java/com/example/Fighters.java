package com.example;

public class Fighters {
    private String id;
    private String nom;
    private String prenom;
    private String fightersName;
    private int weight;
    private String titles;

    public Fighters(String id, String nom, String prenom, String fightersName, int weight, String titles) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.fightersName = fightersName;
        this.weight = weight;
        this.titles = titles;
    }

    public String getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getFightersName() {
        return fightersName;
    }

    public int getWeight() {
        return weight;
    }

    public String getTitles() {
        return titles;
    }

    @Override
    public String toString() {
        return "Fighters{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", fightersName='" + fightersName + '\'' +
                ", weight=" + weight +
                ", titles='" + titles + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Fighters fighter1 = new Fighters("1", "Doe", "John", "The Beast", 85, "Champion");
        Fighters fighter2 = new Fighters("2", "Smith", "Jane", "The Warrior", 75, "No titltes");

        System.out.println(fighter1);
        System.out.println(fighter2);

    }
}


