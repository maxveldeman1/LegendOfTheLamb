package be.daStudios.legendOfTheLamb.utility;


public class ChoiceChecker {
    Keyboard keyboard = new Keyboard();

    public String choiceCheckerStep1() {
        String choice =keyboard.askForText("Your choice: ");
       if (choice.matches("(?i)New|Load|Reset|Controls|Settings|Quit")) {
           return choice.toLowerCase();
       }else {
           System.out.println("That is not an available option");
           choiceCheckerStep1();
           return choice.toLowerCase();
       }
    }


}
