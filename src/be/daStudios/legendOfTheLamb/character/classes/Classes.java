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

public interface Classes {
    String getDescription();
    int getBaseArmour();
    int getStrength();
    Dices getLifeDice();
    Item getChainMail();
    int getGold();
    Item getSword();
    int getWisdom();
    int getCharisma();
    Item getClothes();
    Item getDagger();
    int getDexterity();
    int getConstitution();
    Item getLeatherArmour();
    BackPacks getBackPack();
}
