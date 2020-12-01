package be.daStudios.legendOfTheLamb.character.classes;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.armour.Armour;
import be.daStudios.legendOfTheLamb.items.armour.ChainMail;
import be.daStudios.legendOfTheLamb.items.armour.Clothes;
import be.daStudios.legendOfTheLamb.items.armour.LeatherArmour;
import be.daStudios.legendOfTheLamb.items.packs.BackPacks;
import be.daStudios.legendOfTheLamb.items.weapons.Dagger;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;
import be.daStudios.legendOfTheLamb.items.weapons.Weapon;

public interface Classes {
    String getDescription();
    int getBaseArmour();
    int getStrength();
    Dices getLifeDice();
    Armour getChainMail();
    int getGold();
    Weapon getSword();
    int getWisdom();
    int getCharisma();
    Armour getClothes();
    Weapon getDagger();
    int getDexterity();
    int getConstitution();
    Armour getLeatherArmour();
    BackPacks getBackPack();
}
