package be.daStudios.legendOfTheLamb.monsters.animal;

import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.monsters.Monsters;

import java.util.ArrayList;
import java.util.List;

public class Wolf extends Monsters {
    List<Item> loot = new ArrayList<>();

    public Wolf() {
        int armourClass = 19;
        super.setArmourClass(armourClass);
        int hitPoints = 40;
        super.setHitPoints(hitPoints);
        int combatRating= 3;
        super.setCombatRating(combatRating);
        super.setGold(0);
        super.setLoot(loot);
        super.setName("Wolf");
        super.setMaxHitPoints(this.getHitPoints());
    }

    public List<Item> getLoot() {
        return loot;
    }
}
