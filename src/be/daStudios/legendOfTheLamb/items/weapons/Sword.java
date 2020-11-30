package be.daStudios.legendOfTheLamb.items.weapons;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;

public class Sword implements Weapon {
    private String description = "A sharpened piece of steel with a little wooden handle. Lethal how ever you look at it";
    Dices attDice = Dices.D20;
    Dices dmgDice = Dices.D10;


    public String getDescription() {
        return description;
    }

    public Dices getAttDice() {
        return attDice;
    }

    public Dices getDmgDice() {
        return dmgDice;
    }



    //TODO Methode maken om de hitchance(Boolean) & damage(int) berekenen

}
