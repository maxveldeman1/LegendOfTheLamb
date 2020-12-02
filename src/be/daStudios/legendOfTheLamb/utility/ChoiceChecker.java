package be.daStudios.legendOfTheLamb.utility;


import java.util.Arrays;
import java.util.List;

public class ChoiceChecker {
    Keyboard keyboard = new Keyboard();

    public String choiceCheckerStep1() {
        String choice =keyboard.askForText("Your choice: ");
        if (!choice.matches("(?i)New|Load|Reset|Controls|Settings|Quit")) {
            System.out.println("That is not a valid choice!");
            choice = choiceCheckerStep1();
        }
        return choice.toLowerCase();
    }

    public int mapChoiceChecker() {
        int choice= keyboard.askForInt("Your choice: ");
        if (choice != 1 && choice != 2) {
            System.out.println("That is not a valid choice!");
            choice = mapChoiceChecker();
        }
        return choice;
    }

    public String raceChoiceCheck() {
        String choice = keyboard.askForText("Your choice: ");
        if (!choice.matches("(?i)Human|Dwarf|Elf")) {
            System.out.println("That is not a valid choice!");
            choice = raceChoiceCheck();
        }
        return choice.toLowerCase();

    }

    public String classChoiceCheck() {
        String choice = keyboard.askForText("Your choice: ");
        if (!choice.matches("(?i)Fighter|Healer|Ranger")) {
            System.out.println("That is not a valid choice!");
            choice = classChoiceCheck();
        }
        return choice.toLowerCase();

    }

    public String settingsChoiceCheck() {
        String choice = keyboard.askForText("Your choice: ");
        if (!choice.matches("(?i)Menu|Key Value")){
            System.out.println("This is not a valid choice!");
            choice = settingsChoiceCheck();
        }
        return choice.toLowerCase();
    }

    public String commandChoiceCheck() {
        String choice = keyboard.askForText("Your choice: ");
        if (!choice.matches("(?i)North|East|West|South|Help|Quit")){
            System.out.println("This is not a valid choice!");
            choice = settingsChoiceCheck();
        }
        return choice.toLowerCase();
    }





}
