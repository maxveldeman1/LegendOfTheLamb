package be.daStudios.legendOfTheLamb.items;

import javax.swing.*;
import java.util.ArrayList;

public interface Entity {
    public void addEntity(Entity a);
    public ArrayList<Entity> getInventory();
    public void removeObject(Entity a);
    public String getDisplayName();
    public String getName();
    public String getDescription();
    public boolean TestCanBePickedUp();
    public void CantBePickedUp(String b);
    public String CanBePickedUp_Why();
    public void printInventory(JTextArea y);
    public boolean isLocked();
    public Entity getKey();
    public void lock();
    public void unlock();
    public int getGold();
    public void modifyGold(int a);
    public void setGold(int a);
    public void forSale(boolean a);
    public boolean isForSale();
    public void setVisible(boolean a);
    public boolean isVisible();
}
