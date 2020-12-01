package be.daStudios.legendOfTheLamb.items.armour;

import be.daStudios.legendOfTheLamb.items.Item;

public class ChainMail extends Item implements Armour{
    private String description = "Many small rings make one big strong jacket.";
    private int ArmourBase = 10;
    int AC = 10;
    private String Penalty = "Sneaking, makes noise";

    public ChainMail() {
        setName("Chain Mail");
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
        return ArmourBase;
    }

    public void setArmourBase(int armourBase) {
        ArmourBase = armourBase;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public String getPenalty() {
        return Penalty;
    }

    public void setPenalty(String penalty) {
        Penalty = penalty;
    }


}
