package be.daStudios.legendOfTheLamb.character.classes;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.armour.Armour;
import be.daStudios.legendOfTheLamb.items.armour.Clothes;
import be.daStudios.legendOfTheLamb.items.armour.LeatherArmour;
import be.daStudios.legendOfTheLamb.items.packs.BackPack;
import be.daStudios.legendOfTheLamb.items.packs.BackPacks;
import be.daStudios.legendOfTheLamb.items.weapons.Dagger;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;

public class Ranger implements Classes{

    private String description = "Ranger";
    private int baseArmour = 6;
    private int dexterty = 2;
    private int constitution = 1;
    private Dices lifeDice = Dices.D8;
    //    Bow Item = new Bow();
    private Item leatherArmour = new LeatherArmour();
    private BackPack backPack = new BackPack();
    private int gold = 10;
    private Item sword = new Sword();

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
    public Item getChainMail() {
        return null;
    }

    public Item getLeatherArmour() {
        return leatherArmour;
    }

    @Override
    public BackPacks getBackPack() {
        return backPack;
    }

    public int getGold() {
        return gold;
    }

    public Item getSword() {
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
    public Item getClothes() {
        return null;
    }

    @Override
    public Item getDagger() {
        return null;
    }

//    public Item getBow() {
//        return bow;
//    }
//


}
