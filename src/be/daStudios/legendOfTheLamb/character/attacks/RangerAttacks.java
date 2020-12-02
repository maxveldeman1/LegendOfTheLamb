package be.daStudios.legendOfTheLamb.character.attacks;

import be.daStudios.legendOfTheLamb.character.User;
import be.daStudios.legendOfTheLamb.character.calculations.Calculations;
import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.Dices;

public class RangerAttacks {
    Calculations c = new Calculations();

    public int[] swordAttack(User user) {
        int[] swordAttack = new int[2];
        swordAttack[0] = DiceThrow.diceThrow(Dices.D20) + user.getProficiency() + c.strengthAbilityModifier(user);
        swordAttack[1] = DiceThrow.diceThrow(Dices.D10) + c.strengthAbilityModifier(user);
        return swordAttack;
    }

    public int[] bowAttack(User user) {
        int[] bowAttack = new int[2];
        bowAttack[0] = DiceThrow.diceThrow(Dices.D20) + user.getProficiency() + c.dexterityAbilityModifier(user);
        bowAttack[1] = DiceThrow.diceThrow(Dices.D12) + c.dexterityAbilityModifier(user);
        return bowAttack;
    }

    public int[] piercingShot(User user) {
        int[] piercingShot = new int[2];
        piercingShot[0] = DiceThrow.diceThrow(Dices.D20) + user.getProficiency() + c.dexterityAbilityModifier(user);
        piercingShot[1] = DiceThrow.diceThrow(Dices.D12) + (c.dexterityAbilityModifier(user) * 2);
        return piercingShot;
    }

    public int[] seekerShot(User user) {
        int[] seekerShot = new int[2];
        seekerShot[0] = 100;
        seekerShot[1] = (DiceThrow.diceThrow(Dices.D12) + c.dexterityAbilityModifier(user)) / 2;
        return seekerShot;
    }
    //TODO bij uiteindelijk aanval hit deze alle enemies.
    public int[] arrowRain(User user) {
        int[] arrowRain = new int[2];
        arrowRain[0] = DiceThrow.diceThrow(Dices.D20) + user.getProficiency() + c.dexterityAbilityModifier(user);
        arrowRain[1] = DiceThrow.diceThrow(Dices.D10) + c.dexterityAbilityModifier(user);
        return arrowRain;
    }
}
