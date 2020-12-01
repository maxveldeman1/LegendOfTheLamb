package be.daStudios.legendOfTheLamb.character.classes;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.armour.Armour;
import be.daStudios.legendOfTheLamb.items.armour.ChainMail;
import be.daStudios.legendOfTheLamb.items.armour.Clothes;
import be.daStudios.legendOfTheLamb.items.armour.LeatherArmour;
import be.daStudios.legendOfTheLamb.items.weapons.Dagger;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;

public interface Classes {
    String getDescription();
    int getBaseArmour();
    int getStrength();
    Dices getLifeDice();
    Armour getChainMail();
    int getGold();
    Sword getSword();
    int getWisdom();
    int getCharisma();
    Clothes getClothes();
    Dagger getDagger();
    int getDexterity();
    int getConstitution();
    LeatherArmour getLeatherArmour();
}
