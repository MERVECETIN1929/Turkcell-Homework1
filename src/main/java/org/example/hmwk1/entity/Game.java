package org.example.hmwk1.entity;

public class Game{
    private int id;
    private String name;
    private double cost=0;
    private String description = "Lorem ipsum dolores ...";
    private int countOwner;


    public Game(int id, String name, double cost, String description, int countOwner ) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.countOwner = countOwner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCountOwner() {
        return countOwner;
    }

    public void setCountOwner(int countOwner) {
        this.countOwner = countOwner;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", countOwner=" + countOwner +
                '}';
    }
}
