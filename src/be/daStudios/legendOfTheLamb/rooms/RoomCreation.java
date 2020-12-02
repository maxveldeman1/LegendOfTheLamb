package be.daStudios.legendOfTheLamb.rooms;

import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.weapons.Bow;
import be.daStudios.legendOfTheLamb.monsters.animal.BugBear;
import be.daStudios.legendOfTheLamb.rooms.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class RoomCreation {
    Random random = new Random();



    String[] itemRoomInfoArray = {"", "When you enter the area you notice how quiet it is. You see the sunshine flickering on an item ahead of you.." +
            "Do you want to pick it up?", "You've entered a dark cave, there are rocks everywhere.", "Other random info", "more info"};
    String[] monsterRoomInfoArray = {"", "You entered a dark cave, which smells like teen spirit",
            "As you walk on the trail through the forest, you hear the cracking of twigs...", "You look ahead of you and you see a dead corpse, this is gonna be nasty.",
            "A creature comes falling out of a tree"};
    String[] normalRoomInfoArray = {"", "There is absolutely nothing to see here!", "Just another dead corpse, nothing special"
            , "You walk into, well a special location. There is a unicorn dancing on top of Donald Trumps head. You cheer for a moment and then decide to pass by."
            , "There has been a troll on a rampage here, hope he's not coming back."};


//    public List<Room> CreateForestOfStreamsGenerator () {
//        List<Room> forestOfStreamsMap = new ArrayList<>();
//
//        forestOfStreamsMap.add(new NormalRoom("You start your adventure in the forest of streams.", 6, 39));
//
//
//        for (int i = 2; i <= 3; i++) {
//            int randomRoom = random.nextInt(4);
//
//            //TODO Uiteindelijk Array van Monsters maken als die af zijn en die ook weer random toevoegen aan monsterRoom
//            if (randomRoom == 1) {
//
//                int randomMontserRoomInfo = random.nextInt(monsterRoomInfoArray.length);
//                forestOfStreamsMap.add(new MonsterRoom(monsterRoomInfoArray[randomMontserRoomInfo]), new BugBear())
//
//            } else if (randomRoom == 2) {
//
//                int randomItemRoomInfo = random.nextInt(itemRoomInfoArray.length);
//                forestOfStreamsMap.add(new ItemRoom(itemRoomInfoArray[randomItemRoomInfo], new Bow()
//                        , Direction.EXIT, Direction.NOEXIT, Direction.NOEXIT, Direction.NOEXIT));
//
//            } else if (randomRoom == 3) {
//
//                int randomNormalRoomInfo = random.nextInt(normalRoomInfoArray.length);
//                forestOfStreamsMap.add(new NormalRoom(normalRoomInfoArray[randomNormalRoomInfo]), )
//            }
//
//        }
//    }


    public List<Room> createRoomsVertical(int startX, int startY, int endY) {
            List<Room> rooms = new ArrayList<>();
        for (int i = startY; i <= endY; i++) {
            rooms.add(createRandomRoom(startX, i));

        }
        return rooms;
    }

    public List<Room> createRoomsHorizontal(int startX, int endX, int startY) {
            List<Room> rooms = new ArrayList<>();

        for (int i = startX; i <= endX; i++) {
            rooms.add(createRandomRoom(i, startY));
        }
        return rooms;
    }

    public Room createRandomRoom(int x, int y) {
        int randomRoom = random.nextInt(4);
        Room room = new NormalRoom("", 0, 0);

        //TODO Uiteindelijk Array van Monsters maken als die af zijn en die ook weer random toevoegen aan monsterRoom
        if (randomRoom == 1) {

            int randomMontserRoomInfo = random.nextInt(monsterRoomInfoArray.length);
            room = new MonsterRoom(monsterRoomInfoArray[randomMontserRoomInfo], new BugBear(), x, y);

        } else if (randomRoom == 2) {

            int randomItemRoomInfo = random.nextInt(itemRoomInfoArray.length);
            room = new ItemRoom(itemRoomInfoArray[randomItemRoomInfo], new Bow(), x, y);

        } else if (randomRoom == 3) {

            int randomNormalRoomInfo = random.nextInt(normalRoomInfoArray.length);
            room = new NormalRoom(normalRoomInfoArray[randomNormalRoomInfo], x, y);
        }
        return room;
    }

}




//    goUpDown(map, i, j, 37, 40, 6);
//    goSideWays(map, i, j, 6, 9, 37);
//    goUpDown(map, i, j, 34, 37, 8);
//    goSideWays(map, i, j, 1, 9, 34);
//    goUpDown(map, i, j, 22, 34, 1);
//    goUpDown(map, i, j, 4, 22, 2);
//    goSideWays(map, i, j, 1, 11, 22);
//    goSideWays(map, i, j, 2, 35, 4);
//    goSideWays(map, i, j, 2, 19, 13);
//    goUpDown(map, i, j, 4, 15, 18);
//    goSideWays(map, i, j, 19, 27, 14);
//    goUpDown(map, i, j, 4, 32, 34);
//    goUpDown(map, i, j, 22, 31, 11);
//    goSideWays(map, i, j, 12, 19, 30);
//    goSideWays(map, i, j, 12, 17, 24);
//    goUpDown(map, i, j, 20, 24, 16);
//    goSideWays(map, i, j, 17, 29, 20);
//    goUpDown(map, i, j, 26, 30, 18);
//    goSideWays(map, i, j, 19, 23, 26);
//    goSideWays(map, i, j, 28, 34, 31);
//    goUpDown(map, i, j, 26, 36, 22);
//    goUpDown(map, i, j, 31, 38, 28);
//    goUpDown(map, i, j, 31, 37, 32);
//    goUpDown(map, i, j, 33, 39, 38);
//    goSideWays(map, i, j, 33, 38, 33);
//    goSideWays(map, i, j, 30, 38, 38);
//    goSideWays(map, i, j, 30, 33, 36);
//    goUpDown(map, i, j, 37, 39, 30);
//    goSideWays(map, i, j, 17, 28, 37);
//    goUpDown(map, i, j, 35, 38, 17);
//    goSideWays(map, i, j, 17, 22, 35);



