package be.daStudios.legendOfTheLamb.items;

import javax.swing.*;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Item implements Entity, Serializable {
    protected boolean isVisible;
    protected String displayName;
    protected String name;
    protected String description;
    protected ArrayList<Entity> inventory = new ArrayList<Entity>();
    protected boolean canBePickedUp = true;
    protected String why;
    protected int gold;
    protected boolean forSale;
    protected Entity key;
    protected int value;
    protected DecimalFormat df = new DecimalFormat("#.#");

    public Item(String displayName, String name, String description,int ... values) {
        this.displayName = displayName;
        this.name = name;
        this.description = description;
        canBePickedUp = true;
        if (values.length == 0) {
            value = 0;
        } else {
            value = values[0];
        }
        gold = 0;
        forSale = false;
    }


    @Override
    public void addEntity(Entity entity) {
        inventory.add(entity);

    }

    @Override
    public ArrayList<Entity> getInventory() {
        return inventory;
    }

    @Override
    public void removeObject(Entity entity) {
        inventory.remove(entity);

    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return displayName;
    }

    @Override
    public boolean TestCanBePickedUp() {
        return canBePickedUp;
    }

    @Override
    public void CantBePickedUp(String why) {
        canBePickedUp = false;
        this.why = why;

    }

    @Override
    public String CanBePickedUp_Why() {
        return why;
    }

    @Override
    public void printInventory(JTextArea y) {
        y.append("Searching the " + displayName + " you find the following items:\n\n");
        for (Entity a : inventory) {
            y.append(a.getName());
        }

    }

    @Override
    public boolean isLocked() {
        return false;
    }

    @Override
    public Entity getKey() {
        return key;
    }

    @Override
    public void lock() {

    }

    @Override
    public void unlock() {

    }

    @Override
    public int getGold() {
        return gold;
    }

    @Override
    public void modifyGold(int a) {
        this.gold =gold+a;

    }

    @Override
    public void setGold(int a) {
        gold =a;

    }

    @Override
    public void forSale(boolean a) {
        forSale =a;
    }

    @Override
    public boolean isForSale() {
        return forSale;
    }

    @Override
    public void setVisible(boolean a) {
        isVisible = a;
    }

    @Override
    public boolean isVisible() {
        return isVisible;
    }
}
