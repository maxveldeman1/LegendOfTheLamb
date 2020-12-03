package be.daStudios.legendOfTheLamb.items.weapons;

import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.Dices;

import java.io.Serializable;

public class SpellBook implements Weapon, Serializable {
    Dices attDice = Dices.D20;
    private int hitChance;
    private int damage;
    private String name = "SpellBook";


    public String getDescription() {
        return "An item created by the elves of the past. Usable item to unleash a powerful attack.";
    }
    public int getHitChance() {
        return hitChance;
    }
    public int getDamage() {
        return damage;
    }
    public void setBasicHitChance() {
        this.hitChance = DiceThrow.diceThrow(attDice)+10;
    }
    public void setBasicDamage() {
        this.damage = 10;
    }

    @Override
    public String getName() {
        return name;
    }
}
