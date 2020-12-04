package be.daStudios.legendOfTheLamb.items.armour;

import java.io.Serializable;

public class BrokenWoodenShield implements Armour, Serializable {

    @Override
    public int getArmourBase() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "A broken Shield";
    }

    @Override
    public String getName() {
        return "Broken Wooden Shield";
    }
}
