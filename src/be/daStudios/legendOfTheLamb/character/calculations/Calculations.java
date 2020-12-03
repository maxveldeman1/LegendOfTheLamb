package be.daStudios.legendOfTheLamb.character.calculations;

import be.daStudios.legendOfTheLamb.character.User;
import be.daStudios.legendOfTheLamb.monsters.Monsters;
import be.daStudios.legendOfTheLamb.monsters.animal.BugBear;
import be.daStudios.legendOfTheLamb.monsters.animal.WolfPackLeader;

public class Calculations {



    public int armourModifier(User user) {
        return ((user.getClasses().getBaseArmour() + user.getArmour().getArmourBase()) -15) / 2 ;
    }

    public int strengthAbilityModifier(User user) {
        return (user.getAbilities()[0] -10) / 2;
    }

    public int dexterityAbilityModifier(User user) {
        return (user.getAbilities()[2] -10) / 2;
    }

    public int constitutionAbilityModifier(User user) {
        return (user.getAbilities()[1] -10) / 2;
    }

    public int wisdomAbilityModifier(User user) {
        return (user.getAbilities()[3] -10) / 2;
    }

    public int IntelligenceAbilityModifier(User user) {
        return (user.getAbilities()[4] -10) / 2;
    }

    public int charismaAbilityModifier(User user) {
        return (user.getAbilities()[5] -10) / 2;
    }



//    public boolean calculateHitChancePlayer (Player player) {
////        DiceThrow.diceThrow(player.)
//    }

    //Returns true if player attacks first.
    public boolean calculateInitiative (User user, Monsters monster) {
        boolean userHitsFirst = true;
        int userThrow = DiceThrow.diceThrow(Dices.D20) + user.getAbilities()[2];
        int enemyThrow = 0;
        if (monster instanceof BugBear || monster instanceof WolfPackLeader) {
            enemyThrow =  DiceThrow.diceThrow(Dices.D20) + DiceThrow.diceThrow(Dices.D20) + DiceThrow.diceThrow(Dices.D4);
        }
        enemyThrow = DiceThrow.diceThrow(Dices.D20) + DiceThrow.diceThrow(Dices.D20);
        if (!(userThrow > enemyThrow)) {
            userHitsFirst = false;
        }

        return userHitsFirst;
    }

}
