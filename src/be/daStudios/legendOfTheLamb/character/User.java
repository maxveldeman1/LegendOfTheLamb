package be.daStudios.legendOfTheLamb.character;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.character.classes.Classes;
import be.daStudios.legendOfTheLamb.character.races.Race;
import be.daStudios.legendOfTheLamb.items.armour.Armour;

public class User {
    //TODO Afwerken, Armour aantrekmethode,
    private int hitPoints;
    private int armourClass;
    private int speed;
    private int initiative;
    private Classes classes;
    private Race race;
    //// Strength/Constitution/Dexterity/Wisdom/Intelligence/Charisma.
    private int[] abilities;
//    Backpack
    private Armour armour;
    private int experienceLevel;
    private Dices lifeDice;
    private int level;

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getArmourClass() {
        return armourClass;
    }

    public void setArmourClass(int armourClass) {
        this.armourClass = armourClass;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int[] getAbilities() {
        return abilities;
    }

    public void setAbilities(int[] abilities) {
        this.abilities = abilities;
    }

    public Armour getArmour() {
        return armour;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setLifeDice(Dices lifeDice) {
        this.lifeDice = lifeDice;
    }

    public Dices getLifeDice() {
        return lifeDice;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Race getRace() {
        return race;
    }

    public int getLevel() {
        return level;
    }
}
