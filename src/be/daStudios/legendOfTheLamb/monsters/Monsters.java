package be.daStudios.legendOfTheLamb.monsters;

import be.daStudios.legendOfTheLamb.items.Item;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Monsters implements Serializable {
    int hitPoints;
    int combatRating;
    int armourClass;
    int gold;
    String name;
    int maxHitPoints;

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public void setMaxHitPoints(int maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    List<Item> loot = new ArrayList<>();

    public List<Item> getLoot() {
        return loot;
    }

    public void setLoot(List<Item> loot) {
        this.loot = loot;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getCombatRating() {
        return combatRating;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }



    public void setCombatRating(int combatRating) {
        this.combatRating = combatRating;
    }


    public int getArmourClass() {
        return armourClass;
    }

    public void setArmourClass(int armourClass) {
        this.armourClass = armourClass;
    }
}
