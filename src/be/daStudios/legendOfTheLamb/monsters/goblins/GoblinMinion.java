package be.daStudios.legendOfTheLamb.monsters.goblins;

import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.armour.LeatherArmour;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;
import be.daStudios.legendOfTheLamb.monsters.Monsters;

import java.util.ArrayList;
import java.util.List;

public class GoblinMinion extends Monsters {
    List<Item> loot = new ArrayList<>();

    public GoblinMinion() {
        int armourClass = 13;
        super.setArmourClass(armourClass);
        int hitPoints = 1;
        super.setHitPoints(hitPoints);
        int combatRating = 0;
        super.setCombatRating(combatRating);
        super.setGold(5);
        addToList();
        super.setLoot(loot);
        super.setName("Goblin Minion");

    }


    public void addToList() {
        loot.add(new Sword());
        loot.add(new LeatherArmour());
    }

    public List<Item> getLoot() {
        return loot;
    }

}
