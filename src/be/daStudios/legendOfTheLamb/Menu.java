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
        ChoiceChecker cc = new ChoiceChecker();
        String choice= cc.choiceCheckerStep1();
        System.out.println("\n" + "---------------------------");
        switch (choice){
            case "new":
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
