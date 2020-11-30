package be.daStudios.legendOfTheLamb.monsters.goblins;

import be.daStudios.legendOfTheLamb.monsters.Monsters;

public class GoblinRanger extends Monsters {
    public GoblinRanger() {
        int armourClass = 15;
        super.setArmourClass(armourClass);
        int hitPoints = 12;
        super.setHitPoints(hitPoints);
        int combatRating = 1;
        super.setCombatRating(combatRating);
    }
}
