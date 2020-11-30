package be.daStudios.legendOfTheLamb.monsters.troll;

import be.daStudios.legendOfTheLamb.monsters.Monsters;

public class Troll extends Monsters {
    public Troll() {
        int armourClass = 19;
        super.setArmourClass(armourClass);
        int hitPoints = 40;
        super.setHitPoints(hitPoints);
        int combatRating = 4;
        super.setCombatRating(combatRating);
    }
}
