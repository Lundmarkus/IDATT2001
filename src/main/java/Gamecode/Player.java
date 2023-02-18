package Gamecode;

import java.util.List;

public class Player {

    private String name;
    private int health;
    private int score;
    private int gold;
    private List<String> inventory;

    Player(String name, int health, int gold) {
        this.name = name;
        this.health = health;
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public void addHealth(int health) {
        this.health = this.health + health;
    }

    public int getHealth() {
        if (this.health < 0) {
            throw new IllegalStateException("Health cannot be negative");
        }
        return this.health;
    }

    public void addScore(int points) {
        this.score += score;
    }


    public int getScore(){
        return this.score;
    }

    public void addGold(int gold) {
        this.gold += gold;
    }

    public int getGold() {
        return this.gold;
    }

    public void addToInventory(String item) {
        if (item == null) {
            throw new IllegalArgumentException("You cannot add nothing to your inventory!");
        }
        inventory.add(item);
    }


    public List<String> getInventory() {
        return this.inventory;
    }


}
