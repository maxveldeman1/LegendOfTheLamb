package be.daStudios.legendOfTheLamb.items.weapons;

import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.Dices;

public class Dagger implements Weapon {
    Dices attDice = Dices.D20;
    Dices dmgDice = Dices.D4;
    private int hitChance;
    private int damage;



    public String getDescription() {
        return "A small knife that can be used in different situations.";
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
}
