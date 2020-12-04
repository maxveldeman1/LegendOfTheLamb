package be.daStudios.legendOfTheLamb.monsters.goblins;

import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.armour.LeatherArmour;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;
import be.daStudios.legendOfTheLamb.monsters.Monsters;

import java.util.ArrayList;
import java.util.List;

public class GoblinRanger extends Monsters {

    List<Item> loot = new ArrayList<>();

    public GoblinRanger() {
        int armourClass = 15;
        super.setArmourClass(armourClass);
        int hitPoints = 12;
        super.setHitPoints(hitPoints);
        int combatRating = 1;
        super.setCombatRating(combatRating);
        super.setGold(5);
        addToList();
        super.setLoot(loot);
        super.setName("Goblin Ranger");
        super.setMaxHitPoints(this.getHitPoints());
    }


    public List<Item> getLoot() {
        return loot;
    }

    public void addToList() {
        loot.add(new Sword());
        loot.add(new LeatherArmour());
    }
}
