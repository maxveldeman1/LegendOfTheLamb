package be.daStudios.legendOfTheLamb.items.armour;

public class LeatherArmour implements Armour{
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
}
