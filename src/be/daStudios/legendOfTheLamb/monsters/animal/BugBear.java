package be.daStudios.legendOfTheLamb.monsters.animal;

import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.armour.LeatherArmour;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;
import be.daStudios.legendOfTheLamb.monsters.Monsters;

import java.util.ArrayList;
import java.util.List;

public class BugBear extends Monsters {
    List<Item> loot = new ArrayList<>();

    public BugBear() {
        int armourClass = 18;
        super.setArmourClass(armourClass);
        int hitPoints = 34;
        super.setHitPoints(hitPoints);
        int combatRating = 3;
        super.setCombatRating(combatRating);
        int gold =5;
        super.setGold(gold);
        addToList();
        super.setLoot(loot);
        super.setName("Bug Bear");
        super.setMaxHitPoints(this.getHitPoints());


    }

    public void addToList() {
        loot.add(new Sword());
        loot.add(new LeatherArmour());
    }
}
