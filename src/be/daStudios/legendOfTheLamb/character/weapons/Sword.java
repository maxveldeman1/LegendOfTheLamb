package be.daStudios.legendOfTheLamb.character.weapons;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;

public class Sword {
    private String description = "A sharpened piece of steel with a little wooden handle. Lethal how ever you look at it";
    Dices attDice = Dices.D20;
    Dices dmgDice = Dices.D12;
    private int proficiencyBonus;
    private int strength;
    private int hitChance;
    private int damage;

}
