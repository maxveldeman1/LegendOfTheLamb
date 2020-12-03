package be.daStudios.legendOfTheLamb.items.packs;

import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.weapons.SpellBook;

import java.io.Serializable;
import java.util.List;

public interface BackPacks extends Serializable {

    BackPacks getBackPack();
    List<Item> getInventory();
    public List<SpellBook> getSpellBookInventory();
    void setInventory(List<Item> inventory);
}
