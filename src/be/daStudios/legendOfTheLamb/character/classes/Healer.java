package be.daStudios.legendOfTheLamb.character.classes;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.armour.Armour;
import be.daStudios.legendOfTheLamb.items.armour.Clothes;

import be.daStudios.legendOfTheLamb.items.packs.BackPacks;
import be.daStudios.legendOfTheLamb.items.packs.ClericalBackPack;
import be.daStudios.legendOfTheLamb.items.weapons.Dagger;
import be.daStudios.legendOfTheLamb.items.weapons.Weapon;

import java.io.Serializable;

public class Healer implements Classes, Serializable {
    private String description = "Healer";
    private int baseArmour = 4;
    private int wisdom = 2;
    private int charisma = 1;
    private Dices lifeDice = Dices.D6;
    //    HolySymbol Item = new HolySymbol();
    private Armour clothes = new Clothes();
    private ClericalBackPack clericBackPack = new ClericalBackPack();
    private int gold = 15;
    private Weapon dagger = new Dagger();

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

    public Armour getClothes() {
        return clothes;
    }

    public int getGold() {
        return gold;
    }

    @Override
    public Weapon getSword() {
        return null;
    }

    public Weapon getDagger() {
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
    public Armour getLeatherArmour() {
        return null;
    }

    @Override
    public BackPacks getBackPack() {
        return clericBackPack;
    }

//    public HolySymbol getHolySymbol() {
//        return HolySymbol;
//    }
//

}
