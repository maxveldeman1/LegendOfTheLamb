package be.daStudios.legendOfTheLamb.rooms;

import be.daStudios.legendOfTheLamb.monsters.Monsters;

public class MonsterRoom implements Room{

    private String roomInfo;
    private boolean hasBeenCompleted;
    private Monsters monster;
    private int x;
    private int y;

    public MonsterRoom(String roomInfo, Monsters monster, int x, int y) {
        setRoomInfo(roomInfo);
        setHasBeenCompleted(false);
        setMonster(monster);
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
