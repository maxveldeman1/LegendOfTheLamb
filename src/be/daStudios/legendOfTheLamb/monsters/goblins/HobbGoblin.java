package be.daStudios.legendOfTheLamb.monsters.goblins;

import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.armour.LeatherArmour;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;
import be.daStudios.legendOfTheLamb.monsters.Monsters;

import java.util.ArrayList;
import java.util.List;

public class HobbGoblin extends Monsters {
    List<Item> loot = new ArrayList<>();

    public HobbGoblin() {
        int armourClass = 18;
        super.setArmourClass(armourClass);
        int hitPoints = 25;
        super.setHitPoints(hitPoints);
        int combatRating = 2;
        super.setCombatRating(combatRating);
        super.setGold(5);
        addToList();
        super.setLoot(loot);
        super.setName("Hobb Goblin");
        super.setMaxHitPoints(this.getHitPoints());
    }


    public void addToList() {
        loot.add(new Sword());
        loot.add(new LeatherArmour());
    }

    public List<Item> getLoot() {
        return loot;
    }
}
