package be.daStudios.legendOfTheLamb.items.weapons;


import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.Dices;

import java.io.Serializable;


public class Bow implements Weapon, Serializable {
    Dices attDice = Dices.D20;
    Dices dmgDice = Dices.D12;
    private int hitChance;
    private int damage;
    private String name = "Bow";



    public String getDescription() {
        return "A piece of wood, stringed with flaxen string. Nothing special, but lethal from a distance.";
    }
    public int getHitChance() {
        return hitChance;
    }
    public int getDamage() {
        return damage;
    }
    public void setHitChance() {
        this.hitChance = DiceThrow.diceThrow(attDice);
    }
    public void setDamage() {
        this.damage = DiceThrow.diceThrow(dmgDice);
    }

    @Override
    public String getName() {
        return name;
    }
}
