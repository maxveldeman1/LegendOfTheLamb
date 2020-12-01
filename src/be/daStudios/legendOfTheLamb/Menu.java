package be.daStudios.legendOfTheLamb;

import be.daStudios.legendOfTheLamb.utility.ChoiceChecker;
import be.daStudios.legendOfTheLamb.utility.Keyboard;

public class Menu {
    Keyboard keyboard = new Keyboard();
    public void askMenu(){
        System.out.println("+++++++++++++++++++++++++++++\n" +
                "++ Legend of the Lamb – DA ++\n" +
                "+++++++++++++++++++++++++++++\n" +
                "-- DA Studios Belgium --\n" +
                "-----------------------------\n" +
                "Loading Maps and Save Games\n" +
                "++++++++++\n" +
                "++ DONE ++\n" +
                "++++++++++");
    }

    public void gameMenu(){
        printMenu();
        ChoiceChecker choiceChecker = new ChoiceChecker();
        String choice= choiceChecker.choiceCheckerStep1();
        System.out.println("\n" + "---------------------------");
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
        +"\t1. Forest of Streams"
        +"\t2. Cave of Thread");
        int mapChoice = cc.mapChoiceChecker();
        if (mapChoice ==1) {
            // map initialise Forest of streams
        } else {
            // map initialise cave of threads
        }
        System.out.println("What Race do you want to play with?\n"
            +"\tHuman\n"
            +"\tDwarf\n"
            +"\tElf\n");
        String raceChoice = cc.raceChoiceCheck();
        System.out.println("What Class do you want to play with?\n" +
                "\tFighter\n" +
                "\tHealer\n" +
                "\tRanger\n");
        String classChocie = cc.classChoiceCheck();
        String name = keyboard.askForText("What is your characters name?");
        // create player
        System.out.println("Your character is being Created.\n" +
                "Map is being loaded.\n"+
                "+++++++++++++++++++++++++++++");
    }

    private void printMenu() {
        System.out.println("What do you want to do?\n" +
                "New – Start a New Game\n" +
                "Load – Load a Saved Game\n" +
                "Reset – Reset all Saved Files\n" +
                "Controls – Game Controls\n" +
                "Settings – Game Settings\n" +
                "Quit - Quit Game ");
    }
}
