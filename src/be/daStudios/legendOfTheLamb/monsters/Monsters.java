package be.daStudios.legendOfTheLamb.monsters;

public abstract class Monsters {
    int hitPoints;
    int combatRating;
    int armourClass;

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getCombatRating() {
        return combatRating;
    }

    public void setCombatRating(int combatRating) {
        this.combatRating = combatRating;
    }

    public int getArmourClass() {
        return armourClass;
    }

    public void setArmourClass(int armourClass) {
        this.armourClass = armourClass;
    }
}
