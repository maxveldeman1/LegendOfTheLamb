package be.daStudios.legendOfTheLamb.items.weapons;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;

public class Bow implements Weapon{
    private String description = "A piece of wood, stringed with flaxen string. Nothing special, but lethal from a distance.";
    Dices attDice = Dices.D20;
    Dices dmgDice = Dices.D12;
    private int hitChance;
    private int damage;

    public String getDescription() {
        return description;
    }

    public Dices getAttDice() {
        return attDice;
    }

    public Dices getDmgDice() {
        return dmgDice;
    }

    public int getHitChance() {
        return hitChance;
    }

    public int getDamage() {
        return damage;
    }
}
