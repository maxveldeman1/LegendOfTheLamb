package be.daStudios.legendOfTheLamb.items.armour;

import be.daStudios.legendOfTheLamb.items.Item;

public class Clothes extends Item implements Armour{
    private String description = "A linen or woolen tunic that will rip with the slightest touch.";
    private int armourBase = 4;
    private int AC = 4;

    public Clothes() {
        setName("Linen Clothes");
        super.setItemDescription(getDescription());
        super.setArmour(true);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getArmourBase() {
        return armourBase;
    }

    public void setArmourBase(int armourBase) {
        this.armourBase = armourBase;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }
}
