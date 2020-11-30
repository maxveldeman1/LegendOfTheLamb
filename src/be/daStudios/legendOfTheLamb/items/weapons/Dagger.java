package be.daStudios.legendOfTheLamb.items.weapons;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;

public class Dagger {
    private String description = "A small knife that can be used in different situations.";
    Dices attDice = Dices.D20;
    Dices dmgDice = Dices.D4;
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
