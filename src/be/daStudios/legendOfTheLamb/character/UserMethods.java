package be.daStudios.legendOfTheLamb.character;

import be.daStudios.legendOfTheLamb.character.calculations.Calculations;
import be.daStudios.legendOfTheLamb.character.calculations.FeatureCalculations;
import be.daStudios.legendOfTheLamb.character.classes.Classes;
import be.daStudios.legendOfTheLamb.character.classes.Fighter;
import be.daStudios.legendOfTheLamb.character.races.Dwarf;
import be.daStudios.legendOfTheLamb.character.races.Race;

//TODO als player experience bij krijgt. Checken of hij level omhoog gaat, indien het geval lvl increasen.
//TODO als user lvl increased, proficiency updaten + hitpoints increasen.
//TODO als


//TODO herbereking Armourclass in de WearArmour methode -> als hij iets aantrekt uit backpack halen + hetgeen hij aanheeft in backpack steken.
public class UserMethods {
    FeatureCalculations fc = new FeatureCalculations();


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
        } else if (user.getExperience() >= 700 || user.getExperience() < 1500) {
            user.setLevel(3);
        } else if (user.getExperience() >= 1500 || user.getExperience() < 3500) {
            user.setLevel(4);
        } else if (user.getExperience() >= 3500) {
            user.setLevel(5);
        }
    }




    public User createUser(Classes classes, Race race, String name) {
        User user = new User(classes, race, name);
        user.setAbilities(user.getRace().getAbilities());
        user.setSpeed(user.getRace().getBaseSpeed());

        switch (user.getClasses().getDescription()) {
            case ("Fighter"):
                user.setArmourClass(fc.calculateArmourClass(user));
                user.setHitPoints(fc.calculateHitPoints(user));
                user.setSpeed(fc.calculateSpeed(user));
                user.setProficiency(fc.calculateProficiency(user));
                //increase strength
                user.getAbilities()[0] += user.getClasses().getStrength();
                //increase constitution
                user.getAbilities()[1] += user.getClasses().getConstitution();
                user.setLifeDice(user.getClasses().getLifeDice());
                //TODO ITEMS IN BACKPACK steken.

                break;
            case ("Ranger"):
                user.setArmourClass(fc.calculateArmourClass(user));
                user.setHitPoints(fc.calculateHitPoints(user));
                user.setSpeed(fc.calculateSpeed(user));
                user.setProficiency(fc.calculateProficiency(user));
                user.getAbilities()[2] += user.getClasses().getDexterity();
                user.getAbilities()[1] += user.getClasses().getConstitution();
                user.setLifeDice(user.getClasses().getLifeDice());
                //TODO ITEMS IN BACKPACK steken.
                break;
            case ("Healer"):
                user.setArmourClass(fc.calculateArmourClass(user));
                user.setHitPoints(fc.calculateHitPoints(user));
                user.setSpeed(fc.calculateSpeed(user));
                user.setProficiency(fc.calculateProficiency(user));
                user.getAbilities()[3] += user.getClasses().getWisdom();
                user.getAbilities()[5] += user.getClasses().getCharisma();
                user.setLifeDice(user.getClasses().getLifeDice());
                //TODO ITEMS IN BACKPACK STEKEN.
                break;

        }

        return user;
    }

}
