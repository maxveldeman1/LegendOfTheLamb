package be.daStudios.legendOfTheLamb.character.calculations;

import be.daStudios.legendOfTheLamb.character.User;

public class FeatureCalculations {
    Calculations calculations = new Calculations();

    public int calculateHealthPoints(User user) {
        int healthpoints = 0;
        for (int i = 0; i < 3; i++) {
            healthpoints = DiceThrow.diceThrow(user.getLifeDice());
        }

        return healthpoints + 10;
    }

//    public int calculateLevelUpHealthPoints() {
//
//    }
    //TODO NOT SURE IF IT WORKS
    public int calculateArmourClass(User user) {
        return user.getClasses().getBaseArmour() + calculations.armourModifier(user) + calculations.strengthAbilityModifier(user);
    }

    public int calculateSpeed(User user) {
        int modifier = 0;
        if (calculations.dexterityAbilityModifier(user) > calculations.constitutionAbilityModifier(user)) {
            modifier = calculations.dexterityAbilityModifier(user);
        } else {
            modifier = calculations.constitutionAbilityModifier(user);
        }

        return user.getRace().getBaseSpeed() + modifier;
    }

    public int calculateProficiency(User user) {
        return user.getLevel() /2;
    }
}
