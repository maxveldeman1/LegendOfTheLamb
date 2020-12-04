package be.daStudios.legendOfTheLamb.items.armour;

import java.io.Serializable;

public class ChainMail implements Armour, Serializable  {
    private String description = "Many small rings make one big strong jacket.";
    int AC = 10;
    private String Penalty = "Sneaking, makes noise";


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getArmourBase() {
        return 10;
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


    @Override
    public String getName() {
        return "ChainMail";
    }
}
