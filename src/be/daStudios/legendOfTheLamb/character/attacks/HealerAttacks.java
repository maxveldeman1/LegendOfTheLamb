package be.daStudios.legendOfTheLamb.character.attacks;

import be.daStudios.legendOfTheLamb.character.User;
import be.daStudios.legendOfTheLamb.character.calculations.Calculations;
import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.Dices;

public class HealerAttacks {
    Calculations c = new Calculations();

    //TODO returns an amount to be healed
    public int healingWord (User user) {
        return DiceThrow.diceThrow(Dices.D6) + c.wisdomAbilityModifier(user);
    }
    //TODO IF HITS, enemy cannot attack for 1 turn
    public int[] cursingWord (User user) {
        int[] cursingWord = new int[2];
        cursingWord[0] = DiceThrow.diceThrow(Dices.D20) + user.getProficiency() + c.wisdomAbilityModifier(user);
        cursingWord[1] = DiceThrow.diceThrow(Dices.D6) + c.wisdomAbilityModifier(user);
        return cursingWord;
    }

    public int healingPrayer(User user) {
        return DiceThrow.diceThrow(Dices.D12) + c.wisdomAbilityModifier(user);
    }

    public int madeningPrayer(User user) {
        return DiceThrow.diceThrow(Dices.D20) + user.getProficiency() + c. wisdomAbilityModifier(user);
    }

    //Heals all allies + IF D6 rolls 5 or 6 -> damage all enemies.
    public int[] godsArea(User user) {
        int[] godsArea = new int[2];
        godsArea[0] = (DiceThrow.diceThrow(Dices.D12) * 2) + c.wisdomAbilityModifier(user);  //AMOUNT HEALED
        int diceThrow = DiceThrow.diceThrow(Dices.D6);

    if (diceThrow == 5 ||diceThrow == 6) {
        godsArea[1] = (DiceThrow.diceThrow(Dices.D12) * 2) + c.wisdomAbilityModifier(user);
    } else {
        godsArea[1] = 0;
    }
    return godsArea;
    }


}
