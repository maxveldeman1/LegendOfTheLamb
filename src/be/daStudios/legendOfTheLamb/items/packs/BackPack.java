package be.daStudios.legendOfTheLamb.items.packs;


import be.daStudios.legendOfTheLamb.items.Item;

import java.util.ArrayList;
import java.util.List;

public class BackPack implements BackPacks{

private List<Item> inventory = new ArrayList<>();


    @Override
    public BackPacks getBackPack() {
        return this;
    }

    @Override
    public List<Item> getInventory() {
        return this.inventory;
    }

    @Override
    public List<SpellBook> getSpellBookInventory() {
        return null;
    }


    @Override
    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }


}

