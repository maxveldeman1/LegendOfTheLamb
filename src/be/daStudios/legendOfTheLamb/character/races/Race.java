package be.daStudios.legendOfTheLamb.character.races;

public interface Race {
    public String getDescription();

    public int getHitPoints();

    public int getArmourClass();

    public int getBaseSpeed();

    public int getInitiative();

    public int[] getAbilities();
}
