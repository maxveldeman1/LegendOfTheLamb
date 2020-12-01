package be.daStudios.legendOfTheLamb.items;

public abstract class Item {
    private String name;
    String itemDescription;
    int maxItemCharge;
    boolean weapon = false;
    boolean consumable = false;
    boolean armour = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public int getMaxItemCharge() {
        return maxItemCharge;
    }

    public void setMaxItemCharge(int maxItemCharge) {
        this.maxItemCharge = maxItemCharge;
    }

    public boolean isWeapon() {
        return weapon;
    }

    public void setWeapon(boolean weapon) {
        this.weapon = weapon;
    }

    public boolean isConsumable() {
        return consumable;
    }

    public void setConsumable(boolean consumable) {
        this.consumable = consumable;
    }

    public boolean isArmour() {
        return armour;
    }

    public void setArmour(boolean armour) {
        this.armour = armour;
    }


}
