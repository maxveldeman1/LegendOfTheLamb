package be.daStudios.legendOfTheLamb.monsters.troll;

import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;
import be.daStudios.legendOfTheLamb.monsters.Monsters;

import java.util.ArrayList;
import java.util.List;

public class Troll extends Monsters {
    List<Item> loot = new ArrayList<>();

    public Troll() {
        int armourClass = 19;
        super.setArmourClass(armourClass);
        int hitPoints = 40;
        super.setHitPoints(hitPoints);
        int combatRating = 4;
        super.setCombatRating(combatRating);
        super.setGold(0);
        addLoot();
        super.setLoot(loot);
        super.setName("Troll");
    }

    public void addLoot() {
        loot.add(new Sword());
    }
    public List<Item> getLoot() {
        return loot;
    }
}
