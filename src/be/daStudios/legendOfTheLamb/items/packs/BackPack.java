package be.daStudios.legendOfTheLamb.items.packs;

import be.daStudios.legendOfTheLamb.character.User;
import be.daStudios.legendOfTheLamb.items.Entity;

import javax.swing.*;
import java.io.*;
import java.text.DecimalFormat;



public class BackPack extends JTextArea implements Serializable {

    private DecimalFormat df = new DecimalFormat("#.#");

    public void Refresh(User user) {
        setText("");
        append("Inventory:\n\n");
        append("Gold: " + user.getClasses().getGold() + "\n\n");
        for (Entity b : user.) {
            if(b.isVisible() == true) {
                append(b.getName().substring(0, 1).toUpperCase() + b.getName().substring(1) + "\n");
            }
        }


}
