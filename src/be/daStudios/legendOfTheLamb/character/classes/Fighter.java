package be.daStudios.legendOfTheLamb.character.classes;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.armour.Armour;
import be.daStudios.legendOfTheLamb.items.armour.ChainMail;
import be.daStudios.legendOfTheLamb.items.armour.Clothes;
import be.daStudios.legendOfTheLamb.items.armour.LeatherArmour;
import be.daStudios.legendOfTheLamb.items.weapons.Dagger;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;

public class Fighter implements Classes{

    private final String description = "Fighter";
    private final int baseArmour = 8;
    private final int strength = 2;
    private final int constitution = 1;
    Dices lifeDice = Dices.D12;
//    Shield shield = new Shield();
    Armour chainMail = new ChainMail();
//    BackPack backPack = new BackPack();
    private int gold = 15;
    Sword sword = new Sword();


    public String getDescription() {
        return description;
    }

    public int getBaseArmour() {
        return baseArmour;
    }

    public int getStrength() {
        return strength;
    }

    public Dices getLifeDice() {
        return lifeDice;
    }

    public Armour getChainMail() {
        return chainMail;
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

    @Override
    public int getDexterity() {
        return 0;
    }

    @Override
    public int getConstitution() {
        return this.constitution;
    }

    @Override
    public LeatherArmour getLeatherArmour() {
        return null;
    }

//    public Shield getShield() {
//        return shield;
//    }
//
//    public BackPack getBackPack() {
//        return backPack;
//    }
}
