package be.daStudios.legendOfTheLamb.rooms;

import java.io.Serializable;

public class DoorRoom implements Room, Serializable {
    private String roomInfo;
    private boolean hasBeenCompleted;


    public DoorRoom(String roomInfo) {
        setRoomInfo(roomInfo);
        setHasBeenCompleted(false);

    }

    @Override
    public void setRoomInfo(String roomInfo) {

    }

    @Override
    public String getRoomInfo() {
        return roomInfo;
    }

    @Override
    public void setHasBeenCompleted(boolean trueOrFalse) {

    }

    @Override
    public boolean getHasBeenCompleted() {
        return false;
    }
}
