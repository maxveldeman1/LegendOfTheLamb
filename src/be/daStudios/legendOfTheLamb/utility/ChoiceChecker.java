package be.daStudios.legendOfTheLamb.utility;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChoiceChecker {
    Keyboard keyboard = new Keyboard();

    public String choiceCheckerStep1() {
        String choice = keyboard.askForText("Your choice: ");
        if (!choice.matches("(?i)New|Load|Reset|Controls|Settings|Quit")) {
            System.out.println("That is not a valid choice!");
            choice = choiceCheckerStep1();
        }
        return choice.toLowerCase();
    }

    public int mapChoiceChecker() {
        int choice = keyboard.askForInt("Your choice: ");
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
        if (!choice.matches("(?i)Menu|Key Value")) {
            System.out.println("This is not a valid choice!");
            choice = settingsChoiceCheck();
        }
        return choice.toLowerCase();
    }

    public String commandChoiceCheck() {
        String choice = keyboard.askForText("Your choice: ");
        if (!choice.matches("(?i)North|East|West|South|Help|Quit|Save")) {
            System.out.println("This is not a valid choice!");
            choice = commandChoiceCheck();
        }
        return choice.toLowerCase();
    }

    public String saveCheck() {
        System.out.println("This save already exists.\nDo you want to overwrite it? <YES/NO>");
        String choice = keyboard.askForText("Your choice: ");
        if (!choice.matches("(?i)Yes|No")) {
            System.out.println("This is not a valid choice!");
            choice = saveCheck();
        }
        return choice.toLowerCase();
    }

    public String fighterAttackCheck() {
        String s = keyboard.askForText("Your attack Choice: ");
        List<String> fighterAttackList = new ArrayList<>();
        fighterAttackList.add("swordattack");
        fighterAttackList.add("sworddance");
        fighterAttackList.add("sworddanceenhanced");
        fighterAttackList.add("mightyzornhau");

        s = s.toLowerCase();
        if (s.contains(" ")) {
            s = s.replace(" ", "");
        }
        if (!fighterAttackList.contains(s)) {
            System.out.println("This is not a valid choice!");
            s = fighterAttackCheck();

        }
        return s;
    }

    public String rangerAttackCheck() {
        String s = keyboard.askForText("Your attack Choice: ");
        List<String> rangerAttackList = new ArrayList<>();
        rangerAttackList.add("swordattack");
        rangerAttackList.add("bowattack");
        rangerAttackList.add("piercingshot");
        rangerAttackList.add("seekershot");
        rangerAttackList.add("arrowrain");

        s = s.toLowerCase();
        if (s.contains(" ")) {
            s = s.replace(" ", "");
        }
        if (!rangerAttackList.contains(s)) {
            System.out.println("This is not a valid choice!");
            s = rangerAttackCheck();
        }
        return s;
    }

    public String healerAttackCheck(int cursingWordUseAmount) {
        String s = keyboard.askForText("Your attack Choice: ");
        List<String> healerAttackList = new ArrayList<>();
        healerAttackList.add("healingword");
        healerAttackList.add("cursingword");
        healerAttackList.add("healingprayer");
        healerAttackList.add("madeningprayer");
        healerAttackList.add("godsarea");

        s = s.toLowerCase();
        if (s.contains(" ")) {
            s = s.replace(" ", "");
        }
        if (!healerAttackList.contains(s)) {
            System.out.println("This is not a valid choice!");
            s = healerAttackCheck(cursingWordUseAmount);
        } else if (cursingWordUseAmount > 2) {
            System.out.println("You have used up all your Cursing Word charges.");
            s = healerAttackCheck(cursingWordUseAmount);
        }
        return s;
    }

    public int saveChoice( int max) {
        int choice = keyboard.askForInt("Your choice: ");
        if (choice > max || choice < 1) {
            System.out.println("Choose a number between 1 and " + max);
            choice = saveChoice(max);
            return choice;
        } else {
            return choice;
        }
    }

}





