package be.daStudios.legendOfTheLamb.character.attacks;

import be.daStudios.legendOfTheLamb.character.User;
import be.daStudios.legendOfTheLamb.character.classes.Fighter;
import be.daStudios.legendOfTheLamb.character.classes.Healer;
import be.daStudios.legendOfTheLamb.character.classes.Ranger;
import be.daStudios.legendOfTheLamb.monsters.Monsters;

import java.util.Scanner;

public class AttackSimulation {
    Scanner keyboard = new Scanner(System.in);
    FighterAttacks fa = new FighterAttacks();
    RangerAttacks ra = new RangerAttacks();
    HealerAttacks ha = new HealerAttacks();

    public void attackSimulation(User user, Monsters monster) {
        if (user.getWeapon() == null) {
            System.out.println("You have not equipped any weapon. Please type: draw + weapon to equip it");
        }
        //TODO exception checks toevoegen
        while (user.getCurrentHitPoints() <= 0 || monster.getHitPoints() <= 0) {
            checkAndDisplayAttacks(user);
            int hitChancePlayer = 0;
            int hitChanceEnemy = 0;
            int damagePlayer = 0;
            int damageEnemy = 0;
            int amountHealed = 0;
            int hitChancePlayerIfSwordDance = 0;
            int damagePlayerIfSwordDance = 0;
            int hitChancePlayerIfSwordDanceEnhanced = 0;
            int damagePlayerIfSwordDanceEnhanced = 0;

            String input = keyboard.nextLine();
            if (user.getClasses() instanceof Fighter) {
                switch (input) {
                    case "Sword Attack":
                        int[] hitAndDmgSa = fa.swordAttack(user);
                        hitAndDmgSa[0] = hitChancePlayer;
                        hitAndDmgSa[1] = damagePlayer;
                        break;
                    case "Sword Dance":
                        int[] hitAndDmgSd = fa.swordDance(user);
                        hitAndDmgSd[0] = hitChancePlayer;
                        hitAndDmgSd[1] = damagePlayer;
                        hitAndDmgSd[2] = hitChancePlayerIfSwordDance;
                        hitAndDmgSd[3] = damagePlayerIfSwordDance;
                        break;
                    case "Sword Dance Enhanced":
                        int[] hitAndDmgSde = fa.swordDance(user);
                        hitAndDmgSde[0] = hitChancePlayer;
                        hitAndDmgSde[1] = damagePlayer;
                        hitAndDmgSde[2] = hitChancePlayerIfSwordDance;
                        hitAndDmgSde[3] = damagePlayerIfSwordDance;
                        hitAndDmgSde[4] = hitChancePlayerIfSwordDanceEnhanced;
                        hitAndDmgSde[5] = damagePlayerIfSwordDanceEnhanced;
                        break;
                    case "Mighty Zornhau":
                        int[] mightyZornhau = fa.mightyZornhau(user);
                        mightyZornhau[0] = hitChancePlayer;
                        mightyZornhau[1] = damagePlayer;

                }
            } else if (user.getClasses() instanceof Ranger) {
                switch (input) {
                    case "Sword Attack":
                        int[] hitAndDmgSa = ra.swordAttack(user);
                        hitAndDmgSa[0] = hitChancePlayer;
                        hitAndDmgSa[1] = damagePlayer;
                        break;
                    case "Bow Attack":
                        int[] hitAndDmgBa = ra.bowAttack(user);
                        hitAndDmgBa[0] = hitChancePlayer;
                        hitAndDmgBa[1] = damagePlayer;

                        break;
                    case "Piercing Shot":
                        int[] hitAndDmgPs = ra.piercingShot(user);
                        hitAndDmgPs[0] = hitChancePlayer;
                        hitAndDmgPs[1] = damagePlayer;
                        break;
                    case "Seeker Shot":
                        int[] seekerShot = ra.seekerShot(user);
                        seekerShot[0] = hitChancePlayer;
                        seekerShot[1] = damagePlayer;
                        break;
                    case "Arrow Rain":
                        int[] arrowRain = ra.arrowRain(user);
                        arrowRain[0] = hitChancePlayer;
                        arrowRain[1] = damagePlayer;
                        break;

                }

            } else if (user.getClasses() instanceof Healer) {
                switch (input) {
                    case "Healing Word":
                        amountHealed = ha.healingWord(user);
                        hitChancePlayer = 100;
                        break;
                    case "Cursing Word":
                        //TODO hierdoor kan enemy niet aanvallen.
                        //TODO NOG EENS BEKIJKEN, SEEMS OVERPOWERED
//                        int[] hitAndDmgCw = ha.cursingWord(user);
//                        hitAndDmgCw[0] = hitChancePlayer;
//                        hitAndDmgCw[1] = damagePlayer;
                        break;
                    case "Healing Prayer":
                        amountHealed = ha.healingPrayer(user);
                        break;
                    case "Madening Prayer":
                        //TODO Eens bekijken hoe exact uit te werken.. creature valt zichzelf aan als hij verliest met het DiceThrowen...
                        break;
                    case "Gods Area":
                        int[] godsArea = ha.godsArea(user);
                        godsArea[0] = amountHealed;
                        godsArea[1] = damagePlayer;
                        break;
                }
            }

            //TODO Simulation komt dus hier


            if (user.getMaxHitPoints() <= 0) {
                System.out.println("You have died. Please restart from your last save.");
                //TODO link naar save files voegen om zo de speler te kunnen laten kiezen welke save hij terug wilt laden.
            } else if (monster.getHitPoints() <= 0) {
                System.out.println("Congratulations you have defeated your enemy");
                //TODO Items of goldcoins toevoegen aan monsters zodat deze gedropt kunnen worden na het gevecht.
//            if()
            }
        }
    }

        private void checkAndDisplayAttacks (User user){
            if (user.getClasses() instanceof Fighter) {
                System.out.println("Please choose which attack you would like to use:");
                System.out.println("Sword Attack");
                if (user.getLevel() >= 3) {
                    System.out.println("Sword Dance");
                } else if (user.getLevel() >= 4) {
                    System.out.println("Sword Dance Enhanced");
                } else if (user.getLevel() >= 5) {
                    System.out.println("Mighty Zornhau");
                }
            } else if (user.getClasses() instanceof Ranger) {
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
            } else if (user.getClasses() instanceof Healer) {
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
        }
    }

