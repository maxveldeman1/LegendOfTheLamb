package be.daStudios.legendOfTheLamb;

import be.daStudios.legendOfTheLamb.character.UserMethods;
import be.daStudios.legendOfTheLamb.character.classes.Classes;
import be.daStudios.legendOfTheLamb.character.classes.Fighter;
import be.daStudios.legendOfTheLamb.character.classes.Healer;
import be.daStudios.legendOfTheLamb.character.classes.Ranger;
import be.daStudios.legendOfTheLamb.character.races.Dwarf;
import be.daStudios.legendOfTheLamb.character.races.Elf;
import be.daStudios.legendOfTheLamb.character.races.Human;
import be.daStudios.legendOfTheLamb.character.races.Race;
import be.daStudios.legendOfTheLamb.utility.ChoiceChecker;
import be.daStudios.legendOfTheLamb.utility.Keyboard;

public class Menu {
    Keyboard keyboard = new Keyboard();
    public void bootUpMenu(){
        System.out.println("+++++++++++++++++++++++++++++\n" +
                "++ Legend of the Lamb – DA ++\n" +
                "+++++++++++++++++++++++++++++\n" +
                "---- DA Studios Belgium -----\n" +
                "-----------------------------\n" +
                "Loading Maps and Save Games!\n" +
                "\t\t++++++++++\n" +
                "\t\t++ DONE ++\n" +
                "\t\t++++++++++");
    }

    public void gameMenu(){
        printMenu();
        ChoiceChecker choiceChecker = new ChoiceChecker();
        String choice= choiceChecker.choiceCheckerStep1();
        System.out.println("-----------------------------");
        switch (choice){
            case "new":
                createNewGame(choiceChecker);
                break;
            case "load":
                break;
            case "reset":
                break;
            case"controls":
                break;
            case"settings":
                break;
            case"quit":
                break;
        }

    }

    private void createNewGame(ChoiceChecker cc) {
        System.out.println("What map do you want to play?\n"
                +"-----------------------------\n"
        +"\t1. Forest of Streams\n"
        +"\t2. Cave of Thread\n"
        +"-----------------------------");
        int mapChoice = cc.mapChoiceChecker();
        if (mapChoice ==1) {
            // map initialise Forest of streams
        } else {
            // map initialise cave of threads
        }
        System.out.println("-----------------------------\n" +
                "What Race do you want to play with?\n"+
                "-----------------------------\n"
            +"\tHuman\n"
            +"\tDwarf\n"
            +"\tElf\n" +
                "-----------------------------");
        String raceChoice = cc.raceChoiceCheck();
        System.out.println("-----------------------------\n" +
                "What Class do you want to play with?\n" +
                "-----------------------------\n" +
                "\tFighter\n" +
                "\tHealer\n" +
                "\tRanger\n" +
                "-----------------------------");
        String classChoice = cc.classChoiceCheck();
        String name = keyboard.askForText("-----------------------------\n" +
                "What is your characters name\n?" +
                "-----------------------------");
        UserMethods userMethods = new UserMethods();
        switch (raceChoice.toLowerCase()) {
            case "human":
                userHumanCreator(classChoice, name, userMethods);
                break;
            case "dwarf":
                userDwarfCreator(classChoice, name, userMethods);
                break;
            case "elf":
                userElfCreator(classChoice, name, userMethods);
                break;
        }


        System.out.println("Your character is being Created.\n" +
                "Map is being loaded.\n"+
                "+++++++++++++++++++++++++++++");
    }

    private void userHumanCreator(String classChocie, String name, UserMethods userMethods) {
        Race human = new Human();
        switch (classChocie.toLowerCase()) {
            case "healer":
                Classes healer = new Healer();
                userMethods.createUser(healer, human, name);
            break;
            case "fighter":
                Classes fighter = new Fighter();
                userMethods.createUser(fighter, human, name);
            break;
            case "ranger":
                Classes ranger = new Ranger();
                userMethods.createUser(ranger, human, name);
            break;
        }
    }

    private void userElfCreator(String classChocie, String name, UserMethods userMethods) {
        Race elf = new Elf();
        switch (classChocie.toLowerCase()) {
            case "healer":
                Healer healer = new Healer();
                userMethods.createUser(healer, elf, name);
                break;
            case "fighter":
                Classes fighter = new Fighter();
                userMethods.createUser(fighter, elf, name);
                break;
            case "ranger":
                Classes ranger = new Ranger();
                userMethods.createUser(ranger, elf, name);
                break;
        }
    }

    private void userDwarfCreator(String classChocie, String name, UserMethods userMethods) {
        Race dwarf = new Dwarf();
        switch (classChocie.toLowerCase()) {
            case "healer":
                Classes healer = new Healer();
                userMethods.createUser(healer, dwarf, name);
                break;
            case "fighter":
                Classes fighter = new Fighter();
                userMethods.createUser(fighter, dwarf, name);
                break;
            case "ranger":
                Classes ranger = new Ranger();
                userMethods.createUser(ranger, dwarf, name);
                break;
        }
    }

    private void printMenu() {
        System.out.println("-----------------------------\n"+
                "What do you want to do?\n" +
                "-----------------------------\n" +
                "New      – Start a New Game\n" +
                "Load     – Load a Saved Game\n" +
                "Reset    – Reset all Saved Files\n" +
                "Controls – Game Controls\n" +
                "Settings – Game Settings\n" +
                "Quit     - Quit Game\n" +
                "-----------------------------");
    }
}
