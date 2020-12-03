package be.daStudios.legendOfTheLamb.rooms;

import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.monsters.Monsters;

import java.io.Serializable;

public class BossRoom implements Room, Serializable {

    private String roomInfo;
    private boolean hasBeenCompleted;
    private Monsters monster;
    private Item item;


    public BossRoom(String roomInfo, Monsters monster, Item item) {
        setRoomInfo(roomInfo);
        setHasBeenCompleted(false);
        setMonster(monster);
        setItem(item);


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
    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return this.item;
    }


    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }

    public String getRoomInfo() {
        return this.roomInfo;
    }
}
