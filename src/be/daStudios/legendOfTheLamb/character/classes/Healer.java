package be.daStudios.legendOfTheLamb.character.classes;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.armour.ChainMail;
import be.daStudios.legendOfTheLamb.items.armour.Clothes;
import be.daStudios.legendOfTheLamb.items.armour.LeatherArmour;
import be.daStudios.legendOfTheLamb.items.weapons.Dagger;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;

public class Healer implements Classes{
    private String description = "Healer";
    private int baseArmour = 4;
    private int wisdom = 2;
    private int charisma = 1;
    Dices lifeDice = Dices.D6;
    //    HolySymbol holySymbol = new HolySymbol();
    Clothes clothes = new Clothes();
    //    ClericBackPack clericBackPack = new ClericBackPack();
    Integer coins = 15;
    Dagger dagger = new Dagger();

    public String getDescription() {
        return description;
    }

    public int getBaseArmour() {
        return baseArmour;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public Dices getLifeDice() {
        return lifeDice;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public Integer getCoins() {
        return coins;
    }

    public Dagger getDagger() {
        return dagger;
    }

//    public HolySymbol getHolySymbol() {
//        return HolySymbol;
//    }
//
//    public ClericBackPack getClericBackPack() {
//        return clericBackPack;
//    }
}
