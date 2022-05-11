package models;

import java.util.List;

public class Team {
    private String city;
    private String name;
    private List<Player> players;
    private double salaryCap;

    public Team(String city, String name, List<Player> players, double salaryCap) {
        this.city = city;
        this.name = name;
        this.players = players;
        this.salaryCap = salaryCap;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public double getSalaryCap() {
        return salaryCap;
    }

    public void setSalaryCap(double salaryCap) {
        this.salaryCap = salaryCap;
    }
}
