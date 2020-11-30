package be.daStudios.legendOfTheLamb.items.weapons;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;

public class HolySymbol {
    private String description = "An emblem to a god that is imbued with its power.Can be used to cast various spells that need support off the Wisdom Ability.";
    Dices attDice = Dices.D20;
    Dices dmgDice = Dices.D6;
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
