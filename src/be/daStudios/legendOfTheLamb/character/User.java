package be.daStudios.legendOfTheLamb.character;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.character.classes.Classes;
import be.daStudios.legendOfTheLamb.character.races.Race;
import be.daStudios.legendOfTheLamb.items.armour.Armour;

public class User {
    //TODO Afwerken, Armour aantrekmethode
    private String name;
    private int hitPoints;
    private int armourClass;
    private int speed;
    private int initiative;
    private int proficiency;
    private Classes classes;
    private Race race;
    //// Strength/Constitution/Dexterity/Wisdom/Intelligence/Charisma.
    private int[] abilities;
//    Backpack
    private Armour armour;
    private int experience = 0;
    private int level = 1;
    private Dices lifeDice;

    public User (Classes classes, Race race, String name) {
        setClasses(classes);
        setRace(race);
        setName(name);


    }
   public void setName(String name) {
        this.name = name;}

        public String getName() {
        return this.name;
        }
    public void setProficiency(int proficiency) {
        this.proficiency = proficiency;
    }

    public int getProficiency() {
        return proficiency;
    }

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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
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

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
