package be.daStudios.legendOfTheLamb.items.armour;

import java.io.Serializable;

public class LeatherArmour implements Armour, Serializable {
    private String description = " A rough animal hide that is tanned and tailored to the user. Great for agile work.";
    private int armourBase =8;
    private int AC = 8;


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

    @Override
    public String getName() {
        return "Leather Armour";
    }
}
