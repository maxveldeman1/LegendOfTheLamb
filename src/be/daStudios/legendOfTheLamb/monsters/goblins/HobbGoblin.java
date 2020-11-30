package be.daStudios.legendOfTheLamb.monsters.goblins;

import be.daStudios.legendOfTheLamb.monsters.Monsters;

public class HobbGoblin extends Monsters {
    public HobbGoblin() {
        int armourClass = 18;
        super.setArmourClass(armourClass);
        int hitPoints = 25;
        super.setHitPoints(hitPoints);
        int combatRating = 2;
        super.setCombatRating(combatRating);
    }
}
