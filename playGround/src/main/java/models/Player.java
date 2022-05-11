package models;

public class Player {
    private String name;
    private String height;
    private String position;
    private Double salary;
    private String team;

    public Player(String name, String height, String position, Double salary, String team) {
        this.name = name;
        this.height = height;
        this.position = position;
        this.salary = salary;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
