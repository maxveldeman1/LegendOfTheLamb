package be.daStudios.legendOfTheLamb.character.calculations;

import java.util.Random;

public class DiceThrow {


    public static int diceThrow(Dices dices) {
        Random random = new Random();
        return random.nextInt(dices.maxThrow);

    }


}
