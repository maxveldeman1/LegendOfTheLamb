package be.daStudios.legendOfTheLamb.rooms;

import be.daStudios.legendOfTheLamb.items.weapons.Bow;
import be.daStudios.legendOfTheLamb.monsters.Monsters;
import be.daStudios.legendOfTheLamb.monsters.animal.Wolf;
import be.daStudios.legendOfTheLamb.monsters.goblins.GoblinFighter;
import be.daStudios.legendOfTheLamb.monsters.goblins.GoblinMinion;
import be.daStudios.legendOfTheLamb.monsters.goblins.GoblinRanger;
import be.daStudios.legendOfTheLamb.monsters.goblins.HobbGoblin;
import be.daStudios.legendOfTheLamb.monsters.troll.Troll;

import java.io.Serializable;
import java.util.Random;

public class MonsterRoom implements Room, Serializable {
    Random random = new Random();

    private String roomInfo;
    private boolean hasBeenCompleted;
    private Monsters monster;


    public MonsterRoom(String roomInfo) {
        setRoomInfo(roomInfo);
        setHasBeenCompleted(false);
        setMonster(createMonster());

    }

    public void setMonster(Monsters monster) {
        this.monster = monster;
    }

    public Monsters getMonster() {
        return this.monster;
    }

    public void setHasBeenCompleted(boolean trueOrFalse) {
        this.hasBeenCompleted = trueOrFalse;
    }

    public boolean getHasBeenCompleted() {
        return this.hasBeenCompleted;
    }


    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }

    public String getRoomInfo() {
        return this.roomInfo;
    }


    public Monsters createMonster() {
        int randomMonster = random.nextInt(5);
        switch (randomMonster) {
            default: Monsters monsters = new Wolf();
            case 0:
                monsters = new GoblinFighter();
                setMonster(monsters);
                break;
            case 1:
                monsters = new GoblinMinion();
                setMonster(monsters);
                break;
            case 2:
                monsters = new GoblinRanger();
                setMonster(monsters);
                break;
            case 3:
                monsters = new HobbGoblin();
                setMonster(monsters);
                break;
            case 4: monsters = new Troll();
                setMonster(monsters);
                break;


        }
        return getMonster();

    }
}
