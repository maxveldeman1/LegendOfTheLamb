package be.daStudios.legendOfTheLamb.items.packs;

import be.daStudios.legendOfTheLamb.items.Item;

import java.util.List;

public interface BackPacks {

    BackPacks getBackPack();
    List<Item> getInventory();
    public List<SpellBook> getSpellBookInventory();
    void setInventory(List<Item> inventory);
}
