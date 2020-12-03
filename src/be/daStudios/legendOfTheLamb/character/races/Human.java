package be.daStudios.legendOfTheLamb.character.races;

import be.daStudios.legendOfTheLamb.character.Player;

import java.io.Serializable;

public class Human implements Race, Serializable {
    private final String description = "Human";
    private int hitPoints;
    private int armourClass;
    private final int baseSpeed = 6;
    private int initiative;
    // Strength/Constitution/Dexterity/Wisdom/Intelligence/Charisma.
    private final int[] abilities = {17,15,15,14,12,9};



    public String getDescription() { return this.description;}

    public int getHitPoints() {
        return this.getHitPoints();
    }

    public int getArmourClass() {
        return this.armourClass;
    }


    public int getBaseSpeed() {
        return this.baseSpeed;
    }


    public int getInitiative() {
        return this.getInitiative();
    }

    public int[] getAbilities() {
        return abilities;
    }

}
