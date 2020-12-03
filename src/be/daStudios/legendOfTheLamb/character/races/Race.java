package be.daStudios.legendOfTheLamb.character.races;

import java.io.Serializable;

public interface Race extends Serializable {
    public String getDescription();

    public int getHitPoints();

    public int getArmourClass();

    public int getBaseSpeed();

    public int getInitiative();

    public int[] getAbilities();
}
