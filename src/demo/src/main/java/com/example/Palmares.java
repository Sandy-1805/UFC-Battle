package com.example;

public class Palmares {
    private int victories;
    private int defeats;
    private int draws;
    private Fighters fighter;
    private League league;

    public Palmares(int victories, int defeats, int draws, Fighters fighter, League league) {
        this.victories = victories;
        this.defeats = defeats;
        this.draws = draws;
        this.fighter = fighter;
        this.league = league;
    }
    public int getVictories() {
        return victories;
    }
    public int getDefeats() {
        return defeats;
    }
    public int getDraws() {
        return draws;
    }
    public Fighters getFighter() {
        return fighter;
    }

    public League getLeague() {
        return league;
    }


    public static void main(String[] args) {
        Fighters fighter = new Fighters("1", "Doe", "John", "The Beast", 85, "Champion");
        League league = new League("Ultimate Fighting Championship", fighter, null);
        Palmares palmares = new Palmares(10, 2, 1, fighter, league);

        Fighters fighter2 = new Fighters("2", "Smith", "Jane", "The Warrior", 75, "No Titles");
        Palmares palmares = new Palmares(5, 4, 7, fighter2, league);

        System.out.println(palmares);
        System.out.println("Fighter: " + palmares.getFighter().getFightersName());

        if(MatchType.Amical == MatchType.Amical) {
            palmares.victories = palmares.getVictories();
            palmares.defeats = palmares.getDefeats();
            palmares.draws = palmares.getDraws();
        }
        if(MatchType.Championnat == MatchType.Championnat) {
            if(palmares.getVictories(){
                Palmares.victories = palmares.getVictories() + 1;
            }) else if{
                Palmares.defeats = palmares.getDefeats() + 1;
            }
            } else {
                Palmares.draws = palmares.getDraws() + 1;
            }
        }
        if(MatchType.Officiel == MatchType.Officiel) {
            if(palmares.getVictories(){
                palmares.victories = palmares.getVictories() + 1;
            }) else if{
                palmares.defeats = palmares.getDefeats() + 1;
            } else {
                palmares.draws = palmares.getDraws() + 1;
            }
        }
}        

