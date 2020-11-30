package be.daStudios.legendOfTheLamb.character.races;

public class Elf {
    private final String description = "Elf";
    private int hitPoints;
    private int armourClass;
    private final int speed = 7;
    private int initiative;
    // Strength/Constitution/Dexterity/Wisdom/Intelligence/Charisma.
    private final int[] abilities = {16,14,16,13,13,8};

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
