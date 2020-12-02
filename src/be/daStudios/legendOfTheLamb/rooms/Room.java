package be.daStudios.legendOfTheLamb.rooms;

import be.daStudios.legendOfTheLamb.monsters.Monsters;

public interface Room {

    void setRoomInfo(String roomInfo);

    String getRoomInfo();

    public void setHasBeenCompleted(boolean trueOrFalse);

    boolean getHasBeenCompleted();

    //TODO op een of andere manier een bepaald aantal Enums als richting meegeven a/d constructor v/e room..
    //TODO Map maken.. Maybe Arraylist<Room>....

    //TODO Rooms met 4 extra int parameters(de mogelijke richtingen) waarbij je bij richtingen die niet mogelijk zijn -1 toevoegt. OF Enum.NOEXIT
    //TODO Room constructor setNorth


}
