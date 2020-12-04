package be.daStudios.legendOfTheLamb.monsters.goblins;

import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.armour.BrokenWoodenShield;
import be.daStudios.legendOfTheLamb.items.armour.LeatherArmour;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;
import be.daStudios.legendOfTheLamb.monsters.Monsters;

import java.util.ArrayList;
import java.util.List;

public class GoblinFighter extends Monsters {
    List<Item> loot = new ArrayList<>();


    public GoblinFighter() {
        int armourClass = 17;
        super.setArmourClass(armourClass);
        int hitPoints = 15;
        super.setHitPoints(hitPoints);
        int combatRating = 1;
        super.setCombatRating(combatRating);
        super.setGold(5);
        addToList();
        super.setLoot(loot);
        super.setName("Goblin Fighter");
        super.setMaxHitPoints(this.getHitPoints());
    }

    public void addToList() {
        loot.add(new Sword());
        loot.add(new LeatherArmour());
        loot.add(new BrokenWoodenShield());
    }

    public List<Item> getLoot() {
        return loot;
    }
}
