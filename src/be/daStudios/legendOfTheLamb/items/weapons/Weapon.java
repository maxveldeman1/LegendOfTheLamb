package be.daStudios.legendOfTheLamb.items.weapons;

import be.daStudios.legendOfTheLamb.items.Item;

public interface Weapon extends Item {

    public String getDescription();

    public int getHitChance();

    public int getDamage();
}
