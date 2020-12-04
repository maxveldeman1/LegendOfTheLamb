package be.daStudios.legendOfTheLamb.rooms;


import java.io.Serializable;

public class NormalRoom implements Room, Serializable {
    private String roomInfo;
    private boolean hasBeenCompleted;


    public NormalRoom(String roomInfo) {
        setRoomInfo(roomInfo);
        setHasBeenCompleted(false);


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
