package be.daStudios.legendOfTheLamb.character;

import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.FeatureCalculations;
import be.daStudios.legendOfTheLamb.character.classes.Classes;
import be.daStudios.legendOfTheLamb.character.races.Race;
import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.armour.Armour;
import be.daStudios.legendOfTheLamb.items.weapons.SpellBook;
import be.daStudios.legendOfTheLamb.items.weapons.Weapon;

import java.util.Scanner;


//TODO herbereking Armourclass in de WearArmour methode -> als hij iets aantrekt uit backpack halen + hetgeen hij aanheeft in backpack steken.
public class UserMethods {
    FeatureCalculations fc = new FeatureCalculations();
    Scanner keyboard = new Scanner(System.in);


    public void addExperience(User user, int experience) {
        user.setExperience(user.getExperience() + experience);
        checkIfIncreaseLevel(user);
    }

    //Methode om te checken of een speler bij het verkrijgen van experience, een level omhoog gaat.
    public void checkIfIncreaseLevel(User user) {
       if (user.getExperience() < 250) {
           user.setLevel(1);
       }
        else if  (user.getExperience() >= 250 || user.getExperience() < 700) {
            user.setLevel(2);
            user.setProficiency(fc.calculateProficiency(user));
            increaseHpWhenLevelUp(user);
        } else if (user.getExperience() >= 700 || user.getExperience() < 1500) {
            user.setLevel(3);
           user.setProficiency(fc.calculateProficiency(user));
           increaseHpWhenLevelUp(user);
        } else if (user.getExperience() >= 1500 || user.getExperience() < 3500) {
            user.setLevel(4);
           user.setProficiency(fc.calculateProficiency(user));
           increaseHpWhenLevelUp(user);
        } else if (user.getExperience() >= 3500) {
            user.setLevel(5);
           user.setProficiency(fc.calculateProficiency(user));
           increaseHpWhenLevelUp(user);
        }
    }


    public void increaseHpWhenLevelUp(User user) {
        user.setHitPoints(user.getHitPoints() + (DiceThrow.diceThrow(user.getLifeDice()) * 2));
    }

    public void addToBackPack(User user, Item item) {
        if (user.getClasses().getDescription().equals("Healer")) {
            if (item instanceof SpellBook) {
                if (user.getBackPack().getSpellBookInventory().size() < 5) {
                    user.getBackPack().getSpellBookInventory().add((SpellBook) item);
                } else {
                    System.out.println("Your spellBookInventory is full! Please remove an item first.");
                }
            }
        } else {
            if (user.getBackPack().getInventory().size() < 20) {
                user.getBackPack().getInventory().add(item);
            } else {
                System.out.println("Your inventory is full! Please remove an item first.");
            }
        }
    }

    public void printYourBackPack(User user) {
        if (user.getClasses().getDescription().equals("Healer")) {
            System.out.println("Gold:" + user.getGold() + " coins");
            System.out.println("Your items:");
            user.getBackPack().getInventory().forEach(System.out::println);
            System.out.println("Your amount of SpellBooks" + user.getBackPack().getSpellBookInventory().size());
        } else {
            System.out.println("Gold: " + user.getGold() + " coins");
            System.out.println("Your items:");
            user.getBackPack().getInventory().forEach(System.out::println);
        }
    }

//    public void wearArmour(Armour armour) {
//
//    }
//
//    public void drawWeapon(String weapon, User user) {
//
//
//        user.getBackPack().getInventory().stream().filter(s -> s.equals(weapon));
//        user.setWeapon(user.getBackPack().getInventory());
//    }


    public User createUser(Classes classes, Race race, String name) {
        User user = new User(classes, race, name);
        user.setAbilities(user.getRace().getAbilities());
        user.setSpeed(user.getRace().getBaseSpeed());

        switch (user.getClasses().getDescription()) {
            case ("Fighter"):
                //increase strength
                user.getAbilities()[0] += user.getClasses().getStrength();
                //increase constitution
                user.getAbilities()[1] += user.getClasses().getConstitution();
                user.setLifeDice(user.getClasses().getLifeDice());
                user.setBackpack(user.getClasses().getBackPack());
                user.setArmour(user.getClasses().getChainMail());
                user.getBackPack().getInventory().add(user.getClasses().getSword());
//                user.getBackPack().getInventory().add(user.getClasses().getShield());
                user.setGold(user.getClasses().getGold());
                user.setArmourClass(fc.calculateArmourClass(user));
                user.setHitPoints(fc.calculateHitPoints(user));
                user.setSpeed(fc.calculateSpeed(user));
                user.setProficiency(fc.calculateProficiency(user));
                break;
            case ("Ranger"):
                user.getAbilities()[2] += user.getClasses().getDexterity();
                user.getAbilities()[1] += user.getClasses().getConstitution();
                user.setLifeDice(user.getClasses().getLifeDice());
                user.setBackpack(user.getClasses().getBackPack());
                user.getBackPack().getInventory().add(user.getClasses().getSword());
//                user.getBackPack().getInventory().add(user.getClasses().getBow());
                user.setArmour(user.getClasses().getLeatherArmour());
                user.setGold(user.getClasses().getGold());
                user.setArmourClass(fc.calculateArmourClass(user));
                user.setHitPoints(fc.calculateHitPoints(user));
                user.setSpeed(fc.calculateSpeed(user));
                user.setProficiency(fc.calculateProficiency(user));
                break;
            case ("Healer"):

                user.getAbilities()[3] += user.getClasses().getWisdom();
                user.getAbilities()[5] += user.getClasses().getCharisma();
                user.setLifeDice(user.getClasses().getLifeDice());
                user.setBackpack(user.getClasses().getBackPack());
//                user.getBackPack().getInventory().add(user.getClasses().getHolySymbol());
                user.getBackPack().getInventory().add(user.getClasses().getDagger());
                user.setArmour(user.getClasses().getClothes());
                user.setGold(user.getClasses().getGold());
                user.setArmourClass(fc.calculateArmourClass(user));
                user.setHitPoints(fc.calculateHitPoints(user));
                user.setSpeed(fc.calculateSpeed(user));
                user.setProficiency(fc.calculateProficiency(user));
                break;

        }

        return user;
    }

}
