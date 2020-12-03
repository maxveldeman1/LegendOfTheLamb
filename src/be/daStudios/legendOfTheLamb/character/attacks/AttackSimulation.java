package be.daStudios.legendOfTheLamb.character.attacks;

import be.daStudios.legendOfTheLamb.Menu;
import be.daStudios.legendOfTheLamb.character.User;
import be.daStudios.legendOfTheLamb.character.UserMethods;
import be.daStudios.legendOfTheLamb.character.calculations.Calculations;
import be.daStudios.legendOfTheLamb.character.calculations.DiceThrow;
import be.daStudios.legendOfTheLamb.character.calculations.Dices;
import be.daStudios.legendOfTheLamb.character.classes.Fighter;
import be.daStudios.legendOfTheLamb.character.classes.Healer;
import be.daStudios.legendOfTheLamb.character.classes.Ranger;
import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.weapons.Sword;
import be.daStudios.legendOfTheLamb.monsters.Monsters;
import be.daStudios.legendOfTheLamb.monsters.animal.BugBear;
import be.daStudios.legendOfTheLamb.monsters.animal.Wolf;
import be.daStudios.legendOfTheLamb.monsters.goblins.GoblinFighter;
import be.daStudios.legendOfTheLamb.monsters.goblins.GoblinMinion;
import be.daStudios.legendOfTheLamb.monsters.goblins.GoblinRanger;
import be.daStudios.legendOfTheLamb.monsters.goblins.HobbGoblin;
import be.daStudios.legendOfTheLamb.monsters.troll.Troll;
import be.daStudios.legendOfTheLamb.utility.ChoiceChecker;
import be.daStudios.legendOfTheLamb.utility.Keyboard;

import java.util.ArrayList;
import java.util.List;

public class AttackSimulation {
    Keyboard keyboard = new Keyboard();
    Calculations c = new Calculations();
    ChoiceChecker choiceChecker = new ChoiceChecker();
    FighterAttacks fa = new FighterAttacks();
    RangerAttacks ra = new RangerAttacks();
    HealerAttacks ha = new HealerAttacks();
    MonsterAttacks ma = new MonsterAttacks();
    Menu menu = new Menu();
    UserMethods um = new UserMethods();


    public void attackSimulation(User user, Monsters monster) {
        if (user.getWeapon() == null) {
            String input = keyboard.askForText("You have not equipped any weapon. Please type: draw + weapon to equip it");
        } //TODO drawWeapon


        attackUntilSomebodyDies(user, monster);

            if (user.getCurrentHitPoints() <= 0) {
                System.out.println("You have died. Please restart from your last save.");
               menu.gameMenu();
            } else if (monster.getHitPoints() <= 0) {
                System.out.println("Congratulations you have defeated " + monster.getName());
                lootCoins(user, monster);
                um.addExperience(user, monster);


                List<Item> optionalLoot = monster.getLoot();
                List<Item> actualLoot = new ArrayList<>();
                for (int i = 0; i < optionalLoot.size(); i++) {
                    if (DiceThrow.diceThrow(Dices.D100) > 50) {
                        actualLoot.add(optionalLoot.get(i));
                    }
                }
                lootingAnEnemyIfPossible(user, actualLoot);

            }

    }

    private void lootCoins(User user, Monsters monster) {
        int goldCoins = monster.getGold();
        user.addGold(goldCoins);
        System.out.println(monster.getName() + " dropped " + goldCoins + " coins. They have been added to your inventory");
    }

    private void lootingAnEnemyIfPossible(User user, List<Item> actualLoot) {
        boolean wishesToContinue = false;
        while (!wishesToContinue) {
            if (actualLoot.size() > 0) {
                System.out.println("You have looted the following items:");
                actualLoot.forEach(s -> System.out.println(s.getName()));
                String input = keyboard.askForText("Which do you wish to keep?");
                Item item1 = new Sword();
                for (Item item : actualLoot) {
                    if (item.getName().equals(input)) {
                        item1 = item;
                    }
                }
                if (user.getClasses() instanceof Healer) {
                    if (user.getBackPack().getInventory().size() <= 15) {
                        user.getBackPack().getInventory().add(item1);
                        System.out.println("You have added " + item1.getName() + " to your inventory");
                    } else {
                        System.out.println("Your backpack is full!");
                    }
                } else if ( user.getBackPack().getInventory().size() <= 20) {
                    user.getBackPack().getInventory().add(item1);
                    System.out.println("You have added " + item1.getName() + " to your inventory");
                } else {
                    System.out.println("Your backpack is full!");
                }

            } else {
                System.out.println("There was nothing to loot..");
                wishesToContinue = true;
            }
        }
    }

    private void attackUntilSomebodyDies(User user, Monsters monster) {
        int cursingWordCounter = 0;

        while (user.getCurrentHitPoints() > 0 || monster.getHitPoints() > 0) {
            System.out.println("Current Health: " + user.getCurrentHitPoints() + "/" + user.getMaxHitPoints());
            checkAndDisplayAttacks(user);
            int hitChancePlayer = 0;
            int hitChanceEnemy = 0;
            int damagePlayer = 0;
            int damageEnemy = 0;
            int amountHealed = 0;
            int hitChanceEnemyIfSwordDance = 0;
            int damageEnemyIfSwordDance = 0;
            int hitChancePlayerIfSwordDance = 0;
            int damagePlayerIfSwordDance = 0;
            int hitChancePlayerIfSwordDanceEnhanced = 0;
            int damagePlayerIfSwordDanceEnhanced = 0;
            String attackChoice = "";
            String attackChoiceEnemy = "";


            if (user.getClasses() instanceof Fighter) {
                String input = choiceChecker.fighterAttackCheck();

                switch (input) {
                    case "swordattack":
                        int[] hitAndDmgSa = fa.swordAttack(user);
                        hitChancePlayer = hitAndDmgSa[0];
                        damagePlayer = hitAndDmgSa[1];
                        attackChoice = "swordattack";
                        break;
                    case "sworddance":
                        int[] hitAndDmgSd = fa.swordDance(user);
                        hitChancePlayer = hitAndDmgSd[0] ;
                        damagePlayer = hitAndDmgSd[1];
                        hitChancePlayerIfSwordDance = hitAndDmgSd[2];
                        damagePlayerIfSwordDance = hitAndDmgSd[3];
                        attackChoice = "sworddance";
                        break;
                    case "sworddanceenhanced":
                        int[] hitAndDmgSde = fa.swordDance(user);
                        hitChancePlayer = hitAndDmgSde[0];
                        damagePlayer = hitAndDmgSde[1];
                        hitChancePlayerIfSwordDance = hitAndDmgSde[2];
                        damagePlayerIfSwordDance = hitAndDmgSde[3];
                        hitChancePlayerIfSwordDanceEnhanced = hitAndDmgSde[4];
                        damagePlayerIfSwordDanceEnhanced = hitAndDmgSde[5];
                        attackChoice = "sworddanceenhanced";
                        break;
                    case "mightyzornhau":
                        int[] mightyZornhau = fa.mightyZornhau(user);
                        hitChancePlayer = mightyZornhau[0];
                        damagePlayer = mightyZornhau[1];
                        attackChoice = "mightyzornhau";
                        break;
                }
            } else if (user.getClasses() instanceof Ranger) {
                String input = choiceChecker.rangerAttackCheck();
                switch (input) {
                    case "swordattack":
                        int[] hitAndDmgSa = ra.swordAttack(user);
                        hitChancePlayer = hitAndDmgSa[0];
                        damagePlayer =  hitAndDmgSa[1];
                        attackChoice = "swordattack";
                        break;
                    case "bowattack":
                        int[] hitAndDmgBa = ra.bowAttack(user);
                        hitChancePlayer = hitAndDmgBa[0];
                        damagePlayer = hitAndDmgBa[1];
                        attackChoice = "bowattack";
                        break;
                    case "piercingshot":
                        int[] hitAndDmgPs = ra.piercingShot(user);
                        hitChancePlayer =  hitAndDmgPs[0];
                        damagePlayer = hitAndDmgPs[1];
                        attackChoice = "piercingshot";
                        break;
                    case "seekershot":
                        int[] seekerShot = ra.seekerShot(user);
                        hitChancePlayer = seekerShot[0];
                        damagePlayer = seekerShot[1];
                        attackChoice = "seekershot";
                        break;
                    case "arrowrain":
                        int[] arrowRain = ra.arrowRain(user);
                        hitChancePlayer = arrowRain[0];
                        damagePlayer = arrowRain[1];
                        attackChoice = "arrowrain";
                        break;
                }

            } else if (user.getClasses() instanceof Healer) {
                String input = choiceChecker.healerAttackCheck(cursingWordCounter);
                switch (input) {
                    case "healingword":
                        amountHealed = ha.healingWord(user);
                        hitChancePlayer = 100;
                        attackChoice = "healingword";
                        break;
                    case "cursingword":
                        int[] hitAndDmgCw = ha.cursingWord(user);
                        cursingWordCounter++;
                        hitChancePlayer = hitAndDmgCw[0];
                        damagePlayer = hitAndDmgCw[1];
                        attackChoice = "cursingword";
                        break;
                    case "healingprayer":
                        amountHealed = ha.healingPrayer(user);
                        hitChancePlayer = 100;
                        attackChoice = "healingprayer";
                        break;
                    case "madeningprayer":
                        attackChoice = "madeningprayer";
                        hitChancePlayer = ha.madeningPrayer(user);

                        break;
                    case "godsarea":
                        int[] godsArea = ha.godsArea(user);
                        amountHealed = godsArea[0];
                        damagePlayer = godsArea[1];
                        attackChoice = "godsarea";
                        break;
                }
            }

            if (monster instanceof GoblinMinion) {
                int[] hitAndDmgGM = ma.goblinMinionAttack();
                hitChanceEnemy = hitAndDmgGM[0];
                damageEnemy = hitAndDmgGM[1];
            } else if (monster instanceof GoblinFighter) {
                int[] hitAndDmgGF = ma.goblinFighterAttack();
                hitChanceEnemy = hitAndDmgGF[0];
                damageEnemy = hitAndDmgGF[1];
            } else if (monster instanceof GoblinRanger) {
                int[] hitAndDmgGR = ma.goblinRangerAttack();
                hitChanceEnemy = hitAndDmgGR[0];
                damageEnemy = hitAndDmgGR[1];
            } else if (monster instanceof HobbGoblin) {
                int[] hitAndDmgHG = ma.hobbGoblinAttack();
                hitChanceEnemy = hitAndDmgHG[0];
                damageEnemy = hitAndDmgHG[1];
            } else if (monster instanceof Wolf) {
                int[] hitAndDmgWolf = ma.wolfAttack();
                hitChanceEnemy = hitAndDmgWolf[0];
                damageEnemy = hitAndDmgWolf[1];
            } else if (monster instanceof BugBear) {
                if (DiceThrow.diceThrow(Dices.D20) > 13) {
                    int[] hitAndDmgBB = ma.bugBearSwordDanceAttack();
                    hitChanceEnemy = hitAndDmgBB[0];
                    damageEnemy = hitAndDmgBB[1];
                    hitChanceEnemyIfSwordDance = hitAndDmgBB[2];
                    damageEnemyIfSwordDance = hitAndDmgBB[3];
                    attackChoiceEnemy = "Double";
                } else {
                    int[] hitAndDmgBB = ma.bugBearSwordAttack();
                    hitChanceEnemy = hitAndDmgBB[0];
                    damageEnemy = hitAndDmgBB[1];
                }
            } else if (monster instanceof Troll) {
                if (DiceThrow.diceThrow(Dices.D20) > 13) {
                    int[] hitAndDmgTrollHeavy = ma.trollHeavyBlowAttack();
                    hitChanceEnemy = hitAndDmgTrollHeavy[0];
                    damageEnemy = hitAndDmgTrollHeavy[1];
                } else {
                    int[] hitAndDmgTroll = ma.trollClubAttack();
                    hitChanceEnemy = hitAndDmgTroll[0];
                    damageEnemy = hitAndDmgTroll[1];
                }
            }

            adjustHealthAfterCombat(user, monster, hitChancePlayer, hitChanceEnemy, damagePlayer, damageEnemy, amountHealed,
                    hitChancePlayerIfSwordDance,damagePlayerIfSwordDance,  hitChancePlayerIfSwordDanceEnhanced, damagePlayerIfSwordDanceEnhanced, attackChoice,
                    hitChanceEnemyIfSwordDance, damageEnemyIfSwordDance, attackChoiceEnemy);
        }
    }

    private void adjustHealthAfterCombat(User user, Monsters monster, int hitChancePlayer, int hitChanceEnemy, int damagePlayer, int damageEnemy,
                                         int amountHealed, int hitChancePlayerIfSworeDance, int damagePlayerIfSwordDance, int hitChancePlayerIfSwordDanceEnhanced,
                                         int damagePlayerIfSwordDanceEnhanced, String attackChoice, int hitChanceEnemyIfSwordDance, int damageEnemyIfSwordDance,
                                         String attackChoiceEnemy) {


        //TODO monster attack genereren + aanvallen invoeren.


        if (attackChoice.equals("madeningprayer") && hitChancePlayer > DiceThrow.diceThrow(Dices.D20) + 17) {
            monster.setHitPoints(monster.getHitPoints() - damageEnemy);
            System.out.println("The monster was so stupid enough to hit himself for " + damageEnemy + " damage");

        } else if (attackChoice.equals("madeningprayer") && hitChancePlayer < DiceThrow.diceThrow(Dices.D20) + 17) {
            if (hitChanceEnemy > user.getArmourClass()) {

                user.setCurrentHitPoints(user.getCurrentHitPoints() - damageEnemy);
                System.out.println(monster.getName() + "dealt " + damageEnemy + " damage");

            } else {
                System.out.println("The enemy missed");
            }
        } else if (c.calculateInitiative(user, monster)) {
            if (hitChancePlayer > monster.getArmourClass()) {
                attackSwordDance(monster, damagePlayer, attackChoice);

                attackSwordDanceEnhanced(monster, damagePlayer, attackChoice);

                attackEqualsHealing(user, amountHealed, attackChoice);
                monster.setHitPoints(monster.getHitPoints() - damagePlayer);
                ifDealtDamage(damagePlayer);
            } else {
                System.out.println("You missed your attack");
            }
            if (monster.getHitPoints() > 0) {
                if (!attackChoice.equals("cursingword")) {
                    if (hitChanceEnemy > user.getArmourClass()) {
                        usedIfSwordDanceEnemy(monster, user, damageEnemy, attackChoiceEnemy);
                        user.setCurrentHitPoints(user.getCurrentHitPoints() - damageEnemy);
                        System.out.println(monster.getName() + "dealt " + damageEnemy + " damage");
                    } else {
                        System.out.println("The enemy missed");
                    }
                } else {
                    System.out.println("The Enemy has been cursed, causing it to not being able to attack for 1 turn.");
                }
            }
        } else {
            if (!attackChoice.equals("cursedword")) {
            if (hitChanceEnemy > user.getArmourClass()) {
                usedIfSwordDanceEnemy(monster, user, damageEnemy, attackChoiceEnemy);
                    user.setCurrentHitPoints(user.getCurrentHitPoints() - damageEnemy);
                    System.out.println(monster.getName() + "dealt " + damageEnemy + " damage");

                } else {
                    System.out.println("The enemy missed");
                }
            } else {
                System.out.println("The Enemy has been cursed, causing it to not being able to attack for 1 turn.");
            }
            if (user.getCurrentHitPoints() > 0) {


                if (hitChancePlayer > monster.getArmourClass()) {
                    attackSwordDance(monster, damagePlayer, attackChoice);

                    attackSwordDanceEnhanced(monster, damagePlayer, attackChoice);

                    attackEqualsHealing(user, amountHealed, attackChoice);
                    monster.setHitPoints(monster.getHitPoints() - damagePlayer);
                    ifDealtDamage(damagePlayer);
                } else {
                    System.out.println("You missed your attack");
                }
            }


        }
    }

    private void usedIfSwordDanceEnemy(Monsters monster, User user, int damageEnemy, String attackChoiceEnemy) {
        if (attackChoiceEnemy.equals("Double")) {
            user.setCurrentHitPoints(user.getCurrentHitPoints() - damageEnemy);
            System.out.println("The Enemy attacks Twice!");
            System.out.println(monster.getName() + "dealt " + damageEnemy + " damage");

        }
    }

    private void attackSwordDanceEnhanced(Monsters monster, int damagePlayer, String attackChoice) {
        if(attackChoice.equals("sworddanceenhanced")) {
            System.out.println("You attack three times!");
            monster.setHitPoints(monster.getHitPoints() - damagePlayer);
            ifDealtDamage(damagePlayer);
            monster.setHitPoints(monster.getHitPoints() - damagePlayer);
            ifDealtDamage(damagePlayer);
        }
    }

    private void attackSwordDance(Monsters monster, int damagePlayer, String attackChoice) {
        if (attackChoice.equals("sworddance")) {
            System.out.println("You attack twice!");
            monster.setHitPoints(monster.getHitPoints() - damagePlayer);
            ifDealtDamage(damagePlayer);
        }
    }

    private void ifDealtDamage(int damagePlayer) {
        if (damagePlayer != 0) {
            System.out.println("You dealt " + damagePlayer + " damage");
        }
    }

    private void attackEqualsHealing(User user, int amountHealed, String attackChoice) {
        if (attackChoice.equals("healingword") || attackChoice.equals("healingprayer") || attackChoice.equals("godsarea")) {
            if (user.getCurrentHitPoints() == user.getMaxHitPoints()) {
                System.out.println("You are already at full health");
            } else {
                user.setCurrentHitPoints(user.getCurrentHitPoints() + amountHealed);
                int healthChange = amountHealed;

                if (user.getCurrentHitPoints() > user.getMaxHitPoints()) {
                    healthChange -= user.getCurrentHitPoints() - user.getMaxHitPoints();
                    user.setCurrentHitPoints(user.getMaxHitPoints());

                }

                System.out.println("You have healed yourself: " + healthChange);
            }
        }
    }

    private void checkAndDisplayAttacks (User user){
            if (user.getClasses() instanceof Fighter) {

                checkLevelAndDisplayFighterAttacks(user);
            } else if (user.getClasses() instanceof Ranger) {

                checkLevelAndDisplayRangerAttacks(user);
            } else if (user.getClasses() instanceof Healer) {

                checkLevelAndDisplayHealerAttacks(user);
            }
        }

    private void checkLevelAndDisplayHealerAttacks(User user) {
        System.out.println("Please choose which attack you would like to use:");
        System.out.println("Healing Word");
        System.out.println("Cursing Word");
        if (user.getLevel() >= 3) {
            System.out.println("Healing Prayer");
        } else if (user.getLevel() >= 4) {
            System.out.println("Madening Prayer");
        } else if (user.getLevel() >= 5) {
            System.out.println("Gods Area");
        }
    }

    private void checkLevelAndDisplayRangerAttacks(User user) {
        System.out.println("Please choose which attack you would like to use:");
        System.out.println("Sword Attack");
        System.out.println("Bow Attack");
        if (user.getLevel() >= 3) {
            System.out.println("Piercing Shot");
        } else if (user.getLevel() >= 4) {
            System.out.println("Seeker Shot");
        } else if (user.getLevel() >= 5) {
            System.out.println("Arrow Rain");
        }
    }

    private void checkLevelAndDisplayFighterAttacks(User user) {
        System.out.println("Please choose which attack you would like to use:");
        System.out.println("Sword Attack");
        if (user.getLevel() >= 3) {
            System.out.println("Sword Dance");
        } else if (user.getLevel() >= 4) {
            System.out.println("Sword Dance Enhanced");
        } else if (user.getLevel() >= 5) {
            System.out.println("Mighty Zornhau");
        }
    }

    public void checkIfLevelIsHighEnough(User user, int level, Monsters monster) {

        if (!(user.getLevel() >= level)) {
            System.out.println("Your level is not high enough to use this attack.");
            attackUntilSomebodyDies(user, monster);
        }
    }
    }

