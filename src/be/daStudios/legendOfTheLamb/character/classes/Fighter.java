package be.daStudios.legendOfTheLamb.character.classes;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.armour.ChainMail;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;

import java.util.ArrayList;
import java.util.List;

public class Fighter {

    private String description = "Fighter";
    private int baseArmour = 8;
    private int strength = 2;
    private int constitution = 1;
    Dices lifeDice = Dices.D12;
//    Shield shield = new Shield();
    ChainMail chainMail = new ChainMail();
//    BackPack backPack = new BackPack();
    Integer coins = 15;
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

    public ChainMail getChainMail() {
        return chainMail;
    }

    public Integer getCoins() {
        return coins;
    }

    public Sword getSword() {
        return sword;
    }

//    public Shield getShield() {
//        return shield;
//    }
//
//    public BackPack getBackPack() {
//        return backPack;
//    }
}
