package be.daStudios.legendOfTheLamb.character;

import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.FeatureCalculations;
import be.daStudios.legendOfTheLamb.character.classes.Classes;
import be.daStudios.legendOfTheLamb.character.races.Race;
import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.armour.Armour;
import be.daStudios.legendOfTheLamb.items.armour.ChainMail;
import be.daStudios.legendOfTheLamb.items.weapons.SpellBook;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;
import be.daStudios.legendOfTheLamb.items.weapons.Weapon;
import be.daStudios.legendOfTheLamb.monsters.Monsters;

import java.util.Scanner;


//TODO herbereking Armourclass in de WearArmour methode -> als hij iets aantrekt uit backpack halen + hetgeen hij aanheeft in backpack steken.
public class UserMethods {
    FeatureCalculations fc = new FeatureCalculations();
    Scanner keyboard = new Scanner(System.in);


    public void addExperience(User user, Monsters monster) {
        int experience = 0;
        if (monster.getCombatRating() == 0) {
            experience = 10;
            System.out.println("Experience increased by 10.");
        } else if (monster.getCombatRating() == 1) {
            experience = 50;
            System.out.println("Experience increased by 50.");
        } else if (monster.getCombatRating() == 2) {
            experience = 150;
            System.out.println("Experience increased by 150.");
        } else if (monster.getCombatRating() == 3) {
            experience = 200;
            System.out.println("Experience increased by 200.");
        } else if (monster.getCombatRating() == 4) {
            experience = 400;
            System.out.println("Experience increased by 400.");
        } else if (monster.getCombatRating() == 5) {
            experience = 1000;
            System.out.println("Experience increased by 1000.");
        }
        user.setExperience(user.getExperience() + experience);
        user.setCurrentHitPoints(user.getMaxHitPoints());
        checkIfIncreaseLevel(user);
    }

    //Methode om te checken of een speler bij het verkrijgen van experience, een level omhoog gaat.
    public void checkIfIncreaseLevel(User user) {
       if  (user.getExperience() >= 250 && user.getExperience() < 700) {
            user.setLevel(2);
            user.setProficiency(fc.calculateProficiency(user));
            increaseHpWhenLevelUp(user);
           System.out.println("Congratulations you've reached level 2!");
        } else if (user.getExperience() >= 700 && user.getExperience() < 1500) {
            user.setLevel(3);
           user.setProficiency(fc.calculateProficiency(user));
           increaseHpWhenLevelUp(user);
           System.out.println("Congratulations you've reached level 3!");
        } else if (user.getExperience() >= 1500 && user.getExperience() < 3500) {
            user.setLevel(4);
           user.setProficiency(fc.calculateProficiency(user));
           increaseHpWhenLevelUp(user);
           System.out.println("Congratulations you've reached level 4!");
        } else if (user.getExperience() >= 3500) {
            user.setLevel(5);
           user.setProficiency(fc.calculateProficiency(user));
           increaseHpWhenLevelUp(user);
           System.out.println("Congratulations you've reached the maximum level!");
           System.out.println("You have unlocked the achievement: I like to waste my time. ");
        }
    }



    public void increaseHpWhenLevelUp(User user) {
        user.setMaxHitPoints(user.getMaxHitPoints() + (DiceThrow.diceThrow(user.getLifeDice()) * 2));
        user.setCurrentHitPoints(user.getMaxHitPoints());
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

    public void wearArmour(Armour armour, User user) {
        Armour drawedArmour = new ChainMail();
        boolean containsArmour = user.getBackPack().getInventory().contains(armour);
        if (containsArmour) {
            drawedArmour = (Armour) user.getBackPack().getInventory().get(user.getBackPack().getInventory().indexOf(armour));
            if (user.getArmour() != null) {
                user.getBackPack().getInventory().add(user.getArmour());
            }
        } else {
            System.out.println("You have no such Armour in your inventory");
        }
        user.setArmour(drawedArmour);
    }

//    public void drawWeapon(String weaponInput, User user) {
//        user.getBackPack().getInventory();
//
//        Weapon drawedWeapon = new Sword();
//        boolean containsWeapon = user.getBackPack().getInventory().contains(weapon);
//        if (containsWeapon) {
//           drawedWeapon = (Weapon) user.getBackPack().getInventory().get(user.getBackPack().getInventory().indexOf(weapon));
//           if (user.getWeapon() != null) {
//               user.getBackPack().getInventory().add(user.getWeapon());
//           }
//        } else {
//            System.out.println("You have no such Weapon in your inventory");
//        }
//        user.setWeapon(drawedWeapon);
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
                user.setWeapon(user.getClasses().getSword());

                user.getBackPack().getInventory().add(user.getClasses().getSword());
//                user.getBackPack().getInventory().add(user.getClasses().getShield());
                user.setGold(user.getClasses().getGold());
                user.setArmourClass(fc.calculateArmourClass(user));
                user.setMaxHitPoints(fc.calculateHitPoints(user));
                user.setCurrentHitPoints(user.getMaxHitPoints());
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
                user.setWeapon(user.getClasses().getBow());

                user.setGold(user.getClasses().getGold());
                user.setArmourClass(fc.calculateArmourClass(user));
                user.setMaxHitPoints(fc.calculateHitPoints(user));
                user.setCurrentHitPoints(user.getMaxHitPoints());
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
                user.setWeapon(user.getClasses().getHolySymbol());

                user.setGold(user.getClasses().getGold());
                user.setArmourClass(fc.calculateArmourClass(user));
                user.setMaxHitPoints(fc.calculateHitPoints(user));
                user.setCurrentHitPoints(user.getMaxHitPoints());
                user.setSpeed(fc.calculateSpeed(user));
                user.setProficiency(fc.calculateProficiency(user));
                break;

        }

        return user;
    }

}
