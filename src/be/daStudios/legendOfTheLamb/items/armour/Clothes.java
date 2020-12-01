package be.daStudios.legendOfTheLamb.items.armour;

public class Clothes implements Armour{
    private String description = "A linen or woolen tunic that will rip with the slightest touch.";
    private int armourBase = 4;
    private int AC = 4;



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
