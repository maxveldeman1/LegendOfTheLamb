package be.daStudios.legendOfTheLamb.items.weapons;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;

public interface Weapon {

    public String getDescription();

    public int getHitChance();

    public int getDamage();
}
