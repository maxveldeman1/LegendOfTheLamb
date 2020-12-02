package be.daStudios.legendOfTheLamb.maps;

import be.daStudios.legendOfTheLamb.rooms.Room;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Map implements Serializable {
    private final String description = "The forest of Streams is a large 40 by 40 map that has multiple fresh water streams running through it. It is also\n" +
            "home to giant wolves and a small Goblin raiders camp. The inhabitants of Streamville asked you to rid the forest\n" +
            "of the goblins and bring back the staff of the bugbear leader.";
    private int startingX;
    private int startingY;
    private String name;
    private Room[][] rooms;

    public Map() {
    }

    public String getMapName() {
        return name;
    }


    public boolean isReachable(int x, int y) {
        try {
            return rooms[y][x] != null;
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            return false;
        }
    }

    public Room getRoom(int x, int y) {
        if (isReachable(x, y)) return rooms[y][x];
        return null;
    }

    public int getStartingX() {
        return startingX;
    }

    public int getStartingY() {
        return startingY;
    }


    private static void goSideWays(int[][] map, int i, int j, int from, int until, int posX) {
        for (int l = from; l < until; l++) {
            if (map[i][j] == map[posX][l]) {
                map[posX][l] = 1;
            }
        }
    }


    private static void goUpDown(int[][] map, int i, int j, int from, int untill, int posY) {
        for (int k = from; k < untill; k++) {
            if (map[i][j] == map[k][posY]) {
                map[k][posY] = 1;
            }
        }
    }

    public static void constructForestMapLayout() {
        Map fos = new Map();
        fos.name = "Forest of Streams";
        fos.rooms = new Room[40][40];
        int[][] mapData = new int[40][40];
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < mapData.length; j++) {
                {
                    mapData[i][j] = 0;
                    goUpDown(mapData, i, j, 37, 40, 6);
                    goSideWays(mapData, i, j, 6, 9, 37);
                    goUpDown(mapData, i, j, 34, 37, 8);
                    goSideWays(mapData, i, j, 1, 9, 34);
                    goUpDown(mapData, i, j, 22, 34, 1);
                    goUpDown(mapData, i, j, 4, 22, 2);
                    goSideWays(mapData, i, j, 1, 11, 22);
                    goSideWays(mapData, i, j, 2, 35, 4);
                    goSideWays(mapData, i, j, 2, 19, 13);
                    goUpDown(mapData, i, j, 4, 15, 18);
                    goSideWays(mapData, i, j, 19, 27, 14);
                    goUpDown(mapData, i, j, 4, 32, 34);
                    goUpDown(mapData, i, j, 22, 31, 11);
                    goSideWays(mapData, i, j, 12, 19, 30);
                    goSideWays(mapData, i, j, 12, 17, 24);
                    goUpDown(mapData, i, j, 20, 24, 16);
                    goSideWays(mapData, i, j, 17, 29, 20);
                    goUpDown(mapData, i, j, 26, 30, 18);
                    goSideWays(mapData, i, j, 19, 23, 26);
                    goSideWays(mapData, i, j, 28, 34, 31);
                    goUpDown(mapData, i, j, 26, 36, 22);
                    goUpDown(mapData, i, j, 31, 38, 28);
                    goUpDown(mapData, i, j, 31, 37, 32);
                    goUpDown(mapData, i, j, 33, 39, 38);
                    goSideWays(mapData, i, j, 33, 38, 33);
                    goSideWays(mapData, i, j, 30, 38, 38);
                    goSideWays(mapData, i, j, 30, 33, 36);
                    goUpDown(mapData, i, j, 37, 39, 30);
                    goSideWays(mapData, i, j, 17, 28, 37);
                    goUpDown(mapData, i, j, 35, 38, 17);
                    goSideWays(mapData, i, j, 17, 22, 35);
                }
                fos.startingX = 6;
                fos.startingY = 39;
                for (int o = 0; o < mapData.length; o++) {
                    for (int p = 0; p < mapData[o].length; p++) {
                        if (mapData[o][p] == 1) fos.rooms[o][p] =  ;
                    }
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(".\\maps\\" + fos.name + ".ser");
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(fos);
                    objectOutputStream.close();
                    fileOutputStream.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }


        }

    }
}



