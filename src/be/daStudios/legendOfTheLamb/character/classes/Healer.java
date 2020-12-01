package be.daStudios.legendOfTheLamb.character.classes;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.armour.Armour;
import be.daStudios.legendOfTheLamb.items.armour.ChainMail;
import be.daStudios.legendOfTheLamb.items.armour.Clothes;
import be.daStudios.legendOfTheLamb.items.armour.LeatherArmour;
import be.daStudios.legendOfTheLamb.items.packs.ClericalBackPack;
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
    private int gold = 15;
    Dagger dagger = new Dagger();

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

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public Dices getLifeDice() {
        return lifeDice;
    }

    @Override
    public Armour getChainMail() {
        return null;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public int getGold() {
        return gold;
    }

    @Override
    public Sword getSword() {
        return null;
    }

    public Dagger getDagger() {
        return dagger;
    }

    @Override
    public int getDexterity() {
        return 0;
    }

    @Override
    public int getConstitution() {
        return 0;
    }

    @Override
    public LeatherArmour getLeatherArmour() {
        return null;
    }

//    public HolySymbol getHolySymbol() {
//        return HolySymbol;
//    }
//
    public ClericalBackPack getBackPack() {
        return clericBackPack;
    }
}
