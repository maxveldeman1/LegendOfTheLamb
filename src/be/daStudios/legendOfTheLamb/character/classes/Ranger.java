package be.daStudios.legendOfTheLamb.character.classes;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.armour.LeatherArmour;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;

public class Ranger implements Classes{

    private String description = "Ranger";
    private int baseArmour = 6;
    private int dexterty = 2;
    private int constitution = 1;
    Dices lifeDice = Dices.D8;
    //    Bow bow = new Bow();
    LeatherArmour leatherArmour = new LeatherArmour();
    //    BackPack backPack = new BackPack();
    Integer coins = 10;
    Sword sword = new Sword();

    public String getDescription() {
        return description;
    }

    public int getBaseArmour() {
        return baseArmour;
    }

    public int getDexterty() {
        return dexterty;
    }

    public int getConstitution() {
        return constitution;
    }

    public Dices getLifeDice() {
        return lifeDice;
    }

    public LeatherArmour getLeatherArmour() {
        return leatherArmour;
    }

    public Integer getCoins() {
        return coins;
    }

    public Sword getSword() {
        return sword;
    }

//    public Bow getBow() {
//        return bow;
//    }
//
//    public BackPack getBackPack() {
//        return backPack;
//    }


}
