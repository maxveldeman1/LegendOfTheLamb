package be.daStudios.legendOfTheLamb.character.calculations;

import be.daStudios.legendOfTheLamb.character.User;

public class FeatureCalculations {
    Calculations calculations = new Calculations();

    public int calculateHitPoints(User user) {
        int hitoints = 0;
        for (int i = 0; i < 3; i++) {
            hitoints = DiceThrow.diceThrow(user.getLifeDice());
        }

        return hitoints + 10;
    }

//    public int calculateLevelUpHitPoints() {
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
