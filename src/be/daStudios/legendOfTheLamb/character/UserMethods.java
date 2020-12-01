package be.daStudios.legendOfTheLamb.character;

import be.daStudios.legendOfTheLamb.character.calculations.Calculations;
import be.daStudios.legendOfTheLamb.character.calculations.FeatureCalculations;
import be.daStudios.legendOfTheLamb.character.classes.Classes;
import be.daStudios.legendOfTheLamb.character.classes.Fighter;
import be.daStudios.legendOfTheLamb.character.races.Dwarf;
import be.daStudios.legendOfTheLamb.character.races.Race;


//TODO herbereking Armourclass in de WearArmour methode -> als hij iets aantrekt uit backpack halen + hetgeen hij aanheeft in backpack steken.
public class UserMethods {
    FeatureCalculations fc = new FeatureCalculations();


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
