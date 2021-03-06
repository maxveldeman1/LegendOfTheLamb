package be.daStudios.legendOfTheLamb.character.calculations;

import be.daStudios.legendOfTheLamb.character.User;

public class FeatureCalculations {
    Calculations calculations = new Calculations();

    public int calculateHitPoints(User user) {
        int hitPoints = 0;
        for (int i = 0; i < 3; i++) {
            hitPoints = DiceThrow.diceThrow(user.getLifeDice());
        }

        return hitPoints + 10;
    }


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
