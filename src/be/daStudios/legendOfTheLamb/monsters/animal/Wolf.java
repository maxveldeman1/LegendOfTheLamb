package be.daStudios.legendOfTheLamb.monsters.animal;

import be.daStudios.legendOfTheLamb.monsters.Monsters;

public class Wolf extends Monsters {
    public Wolf() {
        int armourClass = 19;
        super.setArmourClass(armourClass);
        int hitPoints = 40;
        super.setHitPoints(hitPoints);
        int combatRating= 1/2;
        super.setCombatRating(combatRating);
    }
}
