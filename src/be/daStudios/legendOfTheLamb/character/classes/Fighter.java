package be.daStudios.legendOfTheLamb.character.classes;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.armour.Armour;
import be.daStudios.legendOfTheLamb.items.armour.ChainMail;
import be.daStudios.legendOfTheLamb.items.packs.BackPack;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;

public class Fighter implements Classes{

    private String description = "Fighter";
    private int baseArmour = 8;
    private int strength = 2;
    private int constitution = 1;
    Dices lifeDice = Dices.D12;
//    Shield shield = new Shield();
    Armour chainMail = new ChainMail();
    BackPack backPack = new BackPack();
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

//    public Shield getShield() {
//        return shield;
//    }
//
    public BackPack getBackPack() {
        return backPack;
    }
}
