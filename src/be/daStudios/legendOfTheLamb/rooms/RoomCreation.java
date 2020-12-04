package be.daStudios.legendOfTheLamb.rooms;

import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.Key;
import be.daStudios.legendOfTheLamb.items.weapons.Bow;
import be.daStudios.legendOfTheLamb.monsters.animal.BugBear;
import be.daStudios.legendOfTheLamb.monsters.animal.WolfPackLeader;
import java.util.Random;


public class RoomCreation {
    Random random = new Random();

    String[] itemRoomInfoArray = {"When you enter the area you notice how quiet it is. You see the sunshine flickering on an item ahead of you.." +
            "Do you want to pick it up?", "You've entered a dark cave, there are rocks everywhere."};
    String[] monsterRoomInfoArray = {"You entered a dark cave, which smells like teen spirit",
            "As you walk on the trail through the forest, you hear the cracking of twigs...", "You look ahead of you and you see a dead corpse, this is gonna be nasty.",
            "A creature comes falling out of a tree"};
    String[] normalRoomInfoArray = {"There is absolutely nothing to see here!", "Just another dead corpse, nothing special"
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


    public Room createRandomRoom(int x, int y) {
        Room room = new NormalRoom("");
        if (x == 26 && y == 14) {
            BugBear bugBear = new BugBear();
            Item key= new Key();
            //TODO ipv sword moet er een Staff komen
            room = new BossRoom("The last boss", bugBear, key);

        } else if ((x == 2 && y == 12) || (x == 2 && y == 14)) {
            room= new DoorRoom("There is a locked door in this room");
        } else if (x == 28 && y == 20) {
            WolfPackLeader wolfPackLeader = new WolfPackLeader();
            Item bow = new Bow();
            room= new BossRoom("The wolf pack leader", wolfPackLeader, bow);
        } else {
            int randomRoom = random.nextInt(3);
            //TODO Uiteindelijk Array van Monsters maken als die af zijn en die ook weer random toevoegen aan monsterRoom
            switch (randomRoom) {
                case 0:
                    int randomMontserRoomInfo = random.nextInt(monsterRoomInfoArray.length);
                    room= new MonsterRoom(monsterRoomInfoArray[randomMontserRoomInfo]);
                    break;
                case 1:
                    int randomItemRoomInfo = random.nextInt(itemRoomInfoArray.length);
                    room= new ItemRoom(itemRoomInfoArray[randomItemRoomInfo], new Bow());
                    break;
                case 2:
                    int randomNormalRoomInfo = random.nextInt(normalRoomInfoArray.length);
                    room= new NormalRoom(normalRoomInfoArray[randomNormalRoomInfo]);
                    break;

            }

        }
        return room;
    }
}



