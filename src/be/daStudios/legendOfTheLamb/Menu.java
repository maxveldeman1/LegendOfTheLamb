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
import be.daStudios.legendOfTheLamb.maps.Map;
import be.daStudios.legendOfTheLamb.maps.Session;
import be.daStudios.legendOfTheLamb.utility.ChoiceChecker;
import be.daStudios.legendOfTheLamb.utility.Keyboard;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Menu {
    Keyboard keyboard = new Keyboard();
    ChoiceChecker choiceChecker = new ChoiceChecker();
    static String username = null;
    String password = null;
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
      String choice;

      do {
          printMenu();
          choice = choiceChecker.choiceCheckerStep1();
          System.out.println("-----------------------------");
          switch (choice) {
              case "new":
                  createNewGame(choiceChecker);

                  break;
              case "load":
                  break;
              case "reset":
                  break;
              case "controls":
                  printControls();
                  break;
              case "settings":

                  settingsMenu();
                  break;
          }
      } while (!choice.matches("(?i)Quit"));
    }

    private void settingsMenu(){
        if (username == null) {
            setUsernameAndPassword();
            settingsMenu();
        } else {
            printSettings(username, password);
            String settingsChoice =choiceChecker.settingsChoiceCheck();
            System.out.println("-----------------------------");
            if (settingsChoice.matches("(?i)Key Value")){
                setUsernameAndPassword();
                settingsMenu();
            }
        }

    }
    private void setUsernameAndPassword() {
        username = keyboard.askForText("Please enter a username.");
        password = keyboard.askForText("Please enter a password.");
        System.out.println("-----------------------------");
    }

    private void printSettings(String username, String password) {
        System.out.println("\t\tSettings\n" +
                "-----------------------------\n" +
                "Username: " + username +
                "\nWachtwoord: " + Stream.generate(() -> "*").limit(password.length()).collect(Collectors.joining()) +
                "\nType -Key value-\n" +
                "to change your settings.\n" +
                "Type -Menu-\n" +
                "to go back to main menu\n" +
                "-----------------------------");
    }

    public void endMenu() {
        System.out.println("Thank you for playing our game!\n" +
                "\n" +
                "Closing down game!\n" +
                "   .   .   . Done!\n-----------------------------");
    }

    private void printControls() {
        System.out.println("\t\tControls\n" +
                        "-----------------------------\n" +
            "Go -direction- : go to direction\n"+
            "Direction : north, south, west, east\n"+
            "Attack -monster- : attack the\n"+
            "specified monster with main weapon.\n"+
            "Draw -weapon- : Draw your weapon\n"+
            "Use -item- on -obstacle- : us the\n"+
            "item on the obstacle.\n"+
            "Look : Look around again\n"+
            "Save -saveName- : Saves the game.\n" +
            "Quit : Goes back to main Menu\n" +
                "-----------------------------");
    }

    private void createNewGame(ChoiceChecker cc)
    {
        System.out.println("What map do you want to play?\n"
                +"-----------------------------\n"
        +"\t1. Forest of Streams\n"
        +"\t2. Cave of Thread\n"
        +"-----------------------------");
        int mapChoice = cc.mapChoiceChecker();

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
                "What is your characters name?\n" +
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
        Map map = new Map();
        if (mapChoice ==1) {

            Session session = new Session(name,map);
            session.start();
            // map initialise Forest of streams
        } else {
            Session session = new Session(name,map);
            session.start();

            // map initialise cave of threads
        }

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
                "   What do you want to do?\n" +
                "-----------------------------\n" +
                "New      – Start a New Game\n" +
                "Load     – Load a Saved Game\n" +
                "Reset    – Reset all Saved Files\n" +
                "Controls – Game Controls\n" +
                "Settings – Game Settings\n" +
                "Quit     - Quit Game\n" +
                "-----------------------------");
    }

    public String getUsername() {
        return username;
    }
}
