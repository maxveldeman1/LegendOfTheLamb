package be.daStudios.legendOfTheLamb.character.classes;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.armour.Armour;
import be.daStudios.legendOfTheLamb.items.armour.Clothes;
import be.daStudios.legendOfTheLamb.items.armour.LeatherArmour;
import be.daStudios.legendOfTheLamb.items.weapons.Dagger;
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
    private int gold = 10;
    Sword sword = new Sword();

    public String getDescription() {
        return description;
    }

    public int getBaseArmour() {
        return baseArmour;
    }

    @Override
    public int getStrength() {
        return 0;
    }

    public int getDexterity() {
        return dexterty;
    }

    public int getConstitution() {
        return constitution;
    }

    public Dices getLifeDice() {
        return lifeDice;
    }

    @Override
    public Armour getChainMail() {
        return null;
    }

    public LeatherArmour getLeatherArmour() {
        return leatherArmour;
    }

    public int getGold() {
        return gold;
    }

    public Sword getSword() {
        return sword;
    }

    @Override
    public int getWisdom() {
        return 0;
    }

    @Override
    public int getCharisma() {
        return 0;
    }

    @Override
    public Clothes getClothes() {
        return null;
    }

    @Override
    public Dagger getDagger() {
        return null;
    }

//    public Bow getBow() {
//        return bow;
//    }
//
    public BackPack getBackPack() {
        return backPack;
    }


}
