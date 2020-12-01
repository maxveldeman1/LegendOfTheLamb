package be.daStudios.legendOfTheLamb.items.weapons;


import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.Dices;


public class Bow implements Weapon{
    Dices attDice = Dices.D20;
    Dices dmgDice = Dices.D12;
    private int hitChance;
    private int damage;



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
}
