package be.daStudios.legendOfTheLamb.items.packs;

import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.weapons.SpellBook;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClericalBackPack implements BackPacks, Serializable {
    private List<Item> inventory = new ArrayList<>();
    private List<SpellBook> spellBookInventory = new ArrayList<>();

    public ClericalBackPack () {
        setInventory(new ArrayList<>());
        setSpellBookInventory(new ArrayList<SpellBook>());
    }

    public void setInventory(List<Item> inventory) {
        this.inventory = inventory;
    }

    public List<Item> getInventory() {
        return this.inventory;
    }

    public void setSpellBookInventory(List<SpellBook> spellBookInventory ) {
        this.spellBookInventory = spellBookInventory;
    }

    public List<SpellBook> getSpellBookInventory() {
        return this.spellBookInventory;
    }


    @Override
    public BackPacks getBackPack() {
        return this;
    }
}
