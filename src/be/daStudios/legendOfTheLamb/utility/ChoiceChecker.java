package be.daStudios.legendOfTheLamb.utility;


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
            choice = choiceCheckerStep1();
        }
        return choice.toLowerCase();

    }

    public String classChoiceCheck() {
        String choice = keyboard.askForText("Your choice: ");
        if (!choice.matches("(?i)Fighter|Healer|Ranger")) {
            System.out.println("That is not a valid choice!");
            choice = choiceCheckerStep1();
        }
        return choice.toLowerCase();

    }




}
