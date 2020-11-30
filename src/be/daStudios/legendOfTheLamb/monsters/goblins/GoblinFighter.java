package be.daStudios.legendOfTheLamb.monsters.goblins;

import be.daStudios.legendOfTheLamb.monsters.Monsters;

public class GoblinFighter extends Monsters {

    public GoblinFighter() {
        int armourClass = 17;
        super.setArmourClass(armourClass);
        int hitPoints = 15;
        super.setHitPoints(hitPoints);
        int combatRating = 1;
        super.setCombatRating(combatRating);
    }
}
