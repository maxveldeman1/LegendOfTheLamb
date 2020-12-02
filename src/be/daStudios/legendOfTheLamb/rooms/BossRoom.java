package be.daStudios.legendOfTheLamb.rooms;

import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.monsters.Monsters;

public class BossRoom implements Room{

    private String roomInfo;
    private boolean hasBeenCompleted;
    private Monsters monster;
    private Item item;
    private int x;
    private int y;

    public BossRoom(String roomInfo, Monsters monster, Item item, int x, int y) {
        setRoomInfo(roomInfo);
        setHasBeenCompleted(false);
        setMonster(monster);
        setItem(item);
        setX(x);
        setY(y);
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

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setRoomInfo(String roomInfo) {
        this.roomInfo = roomInfo;
    }

    public String getRoomInfo() {
        return this.roomInfo;
    }
}
