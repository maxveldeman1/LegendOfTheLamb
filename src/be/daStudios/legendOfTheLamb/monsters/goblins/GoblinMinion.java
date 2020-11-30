package be.daStudios.legendOfTheLamb.monsters.goblins;

import be.daStudios.legendOfTheLamb.monsters.Monsters;

public class GoblinMinion extends Monsters {
    public GoblinMinion() {
        int armourClass = 13;
        super.setArmourClass(armourClass);
        int hitPoints = 1;
        super.setHitPoints(hitPoints);
        int combatRating = 0;
        super.setCombatRating(combatRating);
    }
}
