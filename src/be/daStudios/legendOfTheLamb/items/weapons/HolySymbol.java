package be.daStudios.legendOfTheLamb.items.weapons;

import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.Dices;

import java.io.Serializable;

public class HolySymbol implements Weapon, Serializable {
    Dices attDice = Dices.D20;
    Dices dmgDice = Dices.D6;
    private int hitChance;
    private int damage;
    private String name = "Holy Symbol";



    public String getDescription() {
        return "An emblem to a god that is imbued with its power.Can be used to cast various spells that need support off the Wisdom Ability.";
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
