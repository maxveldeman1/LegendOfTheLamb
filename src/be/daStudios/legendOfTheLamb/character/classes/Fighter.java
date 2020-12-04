package be.daStudios.legendOfTheLamb.character.classes;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.armour.Armour;
import be.daStudios.legendOfTheLamb.items.armour.ChainMail;
import be.daStudios.legendOfTheLamb.items.packs.BackPack;
import be.daStudios.legendOfTheLamb.items.packs.BackPacks;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;
import be.daStudios.legendOfTheLamb.items.weapons.Weapon;

import java.io.Serializable;

public class Fighter implements Classes, Serializable {

    private final String description = "Fighter";
    private final int baseArmour = 8;
    private final int strength = 2;
    private final int constitution = 1;
    private Dices lifeDice = Dices.D12;
//    Shield shield = new Shield();
    private Armour chainMail = new ChainMail();
    private BackPack backPack = new BackPack();
    private int gold = 15;
    private Weapon sword = new Sword();


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

    public Weapon getSword() {
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
    public Armour getClothes() {
        return null;
    }

    @Override
    public Weapon getDagger() {
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
    public Armour getLeatherArmour() {
        return null;
    }

    @Override
    public BackPacks getBackPack() {
        return this.backPack;
    }

    @Override
    public Weapon getBow() {
        return null;
    }

    @Override
    public Weapon getHolySymbol() {
        return null;
    }

//    public Item getShield() {
//        return shield;
//    }
//

}
