package be.daStudios.legendOfTheLamb.character.races;

import be.daStudios.legendOfTheLamb.character.Player;

public class Human extends Player {
    private String description = "Human";
    private int hitPoints;
    private int armourClass;
    private int speed;
    private int initiative;
    private int[] abilities = {16,14,14,13,11,8};


    public

    @Override
    public int getHitPoints() {
        return super.getHitPoints();
    }

    @Override
    public void setHitPoints(int hitPoints) {
        super.setHitPoints(hitPoints);
    }

    @Override
    public int getArmourClass() {
        return super.getArmourClass();
    }

    @Override
    public void setArmourClass(int armourClass) {
        super.setArmourClass(armourClass);
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

    @Override
    public void setSpeed(int speed) {
        super.setSpeed(speed);
    }

    @Override
    public int getInitiative() {
        return super.getInitiative();
    }

    @Override
    public void setInitiative(int initiative) {
        super.setInitiative(initiative);
    }


}
