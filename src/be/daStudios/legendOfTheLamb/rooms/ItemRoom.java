package be.daStudios.legendOfTheLamb.rooms;

import be.daStudios.legendOfTheLamb.items.Item;

public class ItemRoom implements Room {

    private String roomInfo;
    private boolean hasBeenCompleted;
    private Item item;

    public ItemRoom(String roomInfo, Item item) {
        setRoomInfo(roomInfo);
        setHasBeenCompleted(false);
        setItem(item);
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return this.item;
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
