package be.daStudios.legendOfTheLamb.character.attacks;

import be.daStudios.legendOfTheLamb.character.User;
import be.daStudios.legendOfTheLamb.character.calculations.Calculations;
import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.Dices;

public class FighterAttacks {
    Calculations c = new Calculations();



    public int[] swordAttack(User user) {

        int[] swordAttack = new int[2];
        swordAttack[0] = DiceThrow.diceThrow(Dices.D20) + user.getProficiency() + c.strengthAbilityModifier(user);
        swordAttack[1] = DiceThrow.diceThrow(Dices.D10) + c.strengthAbilityModifier(user);
        return swordAttack;
    }

    public int[] swordDance (User user) {

            int[] swordDance = new int[4];
            swordDance[0] = DiceThrow.diceThrow(Dices.D20) + user.getProficiency() + c.strengthAbilityModifier(user);
            swordDance[1] = DiceThrow.diceThrow(Dices.D10) + c.strengthAbilityModifier(user);
            swordDance[2] = DiceThrow.diceThrow(Dices.D20) + user.getProficiency() + c.strengthAbilityModifier(user);
            swordDance[3] = DiceThrow.diceThrow(Dices.D10) + c.strengthAbilityModifier(user);

        return swordDance;
    }

    public int[] swordDanceEnhanced(User user) {
        int[] swordDanceEnhanced = new int[6];
        swordDanceEnhanced[0] = DiceThrow.diceThrow(Dices.D20) + user.getProficiency() + c.strengthAbilityModifier(user);
        swordDanceEnhanced[1] = DiceThrow.diceThrow(Dices.D10) + c.strengthAbilityModifier(user);
        swordDanceEnhanced[2] = DiceThrow.diceThrow(Dices.D20) + user.getProficiency() + c.strengthAbilityModifier(user);
        swordDanceEnhanced[3] = DiceThrow.diceThrow(Dices.D10) + c.strengthAbilityModifier(user);
        swordDanceEnhanced[4] = DiceThrow.diceThrow(Dices.D20) + user.getProficiency() + c.strengthAbilityModifier(user);
        swordDanceEnhanced[5] = DiceThrow.diceThrow(Dices.D10) + c.strengthAbilityModifier(user);

        return swordDanceEnhanced;
    }

    public int[] mightyZornhau(User user) {
        int[] mightyZornhau = new int[2];
        mightyZornhau[0] = (DiceThrow.diceThrow(Dices.D20) * 2) + user.getProficiency() + c.strengthAbilityModifier(user);
        mightyZornhau[1] = 3000;
        return mightyZornhau;
    }


}
