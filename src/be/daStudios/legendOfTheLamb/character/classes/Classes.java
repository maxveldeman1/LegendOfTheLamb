package be.daStudios.legendOfTheLamb.character.classes;

import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.items.armour.Armour;
import be.daStudios.legendOfTheLamb.items.armour.ChainMail;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;

public interface Classes {
    public String getDescription();
    public int getBaseArmour();

    public int getStrength();

    public Dices getLifeDice();
    public Armour getChainMail();

    public int getGold();

    public Sword getSword();


}
