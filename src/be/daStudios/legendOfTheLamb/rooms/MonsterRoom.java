package be.daStudios.legendOfTheLamb.rooms;

import be.daStudios.legendOfTheLamb.monsters.Monsters;

public class MonsterRoom {

    private String roomInfo;
    private boolean hasBeenCompleted;
    private Monsters monster;

    public MonsterRoom(String roomInfo, Monsters monster) {
        setRoomInfo(roomInfo);
        setHasBeenCompleted(false);
        setMonster(monster);
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
}
