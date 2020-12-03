package be.daStudios.legendOfTheLamb.character.attacks;

import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.Dices;

public class MonsterAttacks {

    public int[] goblinMinionAttack() {
        int[] goblinMinionAttackArray = new int[2];
        goblinMinionAttackArray[0] = DiceThrow.diceThrow(Dices.D20) + 3;
        goblinMinionAttackArray[1] = DiceThrow.diceThrow(Dices.D4) + 2;
        return goblinMinionAttackArray;
    }

    public int[] goblinRangerAttack() {
        int[] goblinRangerAttackArray = new int[2];
        goblinRangerAttackArray[0] = DiceThrow.diceThrow(Dices.D20) + 4;
        goblinRangerAttackArray[1] = DiceThrow.diceThrow(Dices.D6) + 3;
        return goblinRangerAttackArray;
    }

    public int[] goblinFighterAttack() {
        int[] goblinFighterAttackArray = new int[2];
        goblinFighterAttackArray[0] = DiceThrow.diceThrow(Dices.D20) + 4;
        goblinFighterAttackArray[1] = DiceThrow.diceThrow(Dices.D6) + 3;
        return goblinFighterAttackArray;
    }

    public int[] hobbGoblinAttack() {
        int[] hobbGoblinAttackArray = new int[2];
        hobbGoblinAttackArray[0] = DiceThrow.diceThrow(Dices.D20) + 4;
        hobbGoblinAttackArray[1] = DiceThrow.diceThrow(Dices.D8) + 3;
        return hobbGoblinAttackArray;
    }

    public int[] trollClubAttack() {
        int[] trollClubAttackArray = new int[2];
        trollClubAttackArray[0] = DiceThrow.diceThrow(Dices.D20) + 5;
        trollClubAttackArray[1] = DiceThrow.diceThrow(Dices.D10) + 4;
        return trollClubAttackArray;
    }

    public int[] trollHeavyBlowAttack() {
        int[] goblinMinionAttackArray = new int[2];
        goblinMinionAttackArray[0] = (DiceThrow.diceThrow(Dices.D20) * 2) / 2 + 7;
        goblinMinionAttackArray[1] = (DiceThrow.diceThrow(Dices.D10) * 2) + 4;
        return goblinMinionAttackArray;
    }

    public int[] bugBearSwordAttack() {
        int[] bugBearSwordAttackArray = new int[2];
        bugBearSwordAttackArray[0] = DiceThrow.diceThrow(Dices.D20) + 5;
        bugBearSwordAttackArray[1] = DiceThrow.diceThrow(Dices.D10) + 4;
        return bugBearSwordAttackArray;
    }

    public int[] bugBearSwordDanceAttack() {
        int[] bugBearSwordDanceAttack = new int[4];
        bugBearSwordDanceAttack[0] = DiceThrow.diceThrow(Dices.D20) + 5;
        bugBearSwordDanceAttack[1] = DiceThrow.diceThrow(Dices.D10) + 4;
        bugBearSwordDanceAttack[2] = DiceThrow.diceThrow(Dices.D20) + 5;
        bugBearSwordDanceAttack[3] = DiceThrow.diceThrow(Dices.D10) + 4;
        return bugBearSwordDanceAttack;
    }

    public int[] wolfAttack() {
        int[] wolfAttackArray = new int[2];
        wolfAttackArray[0] = DiceThrow.diceThrow(Dices.D20) + 3;
        wolfAttackArray[1] = DiceThrow.diceThrow(Dices.D6) + 3;
        return wolfAttackArray;
    }
}
