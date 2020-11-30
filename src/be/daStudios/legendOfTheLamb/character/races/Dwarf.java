package be.daStudios.legendOfTheLamb.character.races;

import be.daStudios.legendOfTheLamb.character.Player;

public class Dwarf {
    private String description = "Dwarf";
    private int hitPoints;
    private int armourClass;
    private final int speed = 5;
    private int initiative;
    // Strength/Constitution/Dexterity/Wisdom/Intelligence/Charisma.
    private final int[] abilities = {18,16,14,13,11,8};

    public String getDescription() {
        return description;
    }

    public int getHitPoints() {
        return hitPoints;
    }


    public int getArmourClass() {
        return armourClass;
    }


    public int getSpeed() {
        return speed;
    }


    public int getInitiative() {
        return initiative;
    }

    public int[] getAbilities() {
        return abilities;
    }
}
