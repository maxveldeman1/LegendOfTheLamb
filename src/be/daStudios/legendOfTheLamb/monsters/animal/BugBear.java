package be.daStudios.legendOfTheLamb.monsters.animal;

import be.daStudios.legendOfTheLamb.items.weapons.Sword;
import be.daStudios.legendOfTheLamb.monsters.Monsters;

public class BugBear extends Monsters {
    public BugBear() {
        int armourClass = 18;
        super.setArmourClass(armourClass);
        int hitPoints = 34;
        super.setHitPoints(hitPoints);
        int combatRating = 3;
        super.setCombatRating(combatRating);
        Sword sword = new Sword();
        int gold =5;


    }
}
