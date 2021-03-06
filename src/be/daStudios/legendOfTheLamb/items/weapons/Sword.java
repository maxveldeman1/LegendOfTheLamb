package be.daStudios.legendOfTheLamb.items.weapons;

import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.Dices;

import java.io.Serializable;

public class Sword implements Weapon, Serializable {

    Dices attDice = Dices.D20;
    Dices dmgDice = Dices.D10;
    private int hitChance;
    private int damage;
    private String name = "Sword";


    public String getDescription() {
        return "A sharpened piece of steel with a little wooden handle. Lethal how ever you look at it";
    }
    public int getHitChance() {
        return hitChance;
    }
    public int getDamage() {
        return damage;
    }
    public void setBasicHitChance() {
        this.hitChance = DiceThrow.diceThrow(attDice);
    }

    public void setBasicDamage() {
        this.damage = DiceThrow.diceThrow(dmgDice);
    }

    @Override
    public String getName() {
        return name;
    }
}
