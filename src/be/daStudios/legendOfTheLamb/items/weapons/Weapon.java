package be.daStudios.legendOfTheLamb.items.weapons;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;

public interface Weapon {

    public String getDescription();


    public Dices getAttDice();


    public Dices getDmgDice();


    public int getHitChance();


    public int getDamage();
}
