package be.daStudios.legendOfTheLamb.maps;

public class FoS {
    String description = "The forest of Streams is a large 40 by 40 map that has multiple fresh water streams running through it. It is also\n" +
            "home to giant wolves and a small Goblin raiders camp. The habitants of Streamville asked you to rid the forest\n" +
            "of the goblins and bring back the staff of the bugbear leader.";

    public void printDescription() {
        char[][] map = new char[40][40];
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < map.length; j++) {
                {
                    map[i][j] = '.';
                    goUpDown(map, i, j, 37, 40, 6);
                    goSideWays(map, i, j, 6, 9, 37);
                    goUpDown(map, i, j, 34, 37, 8);
                    goSideWays(map, i, j, 1, 9, 34);
                    goUpDown(map, i, j, 22, 34, 1);
                    goUpDown(map, i, j, 4, 22, 2);
                    goSideWays(map, i, j, 1, 11, 22);
                    goSideWays(map, i, j, 2, 35, 4);
                    goSideWays(map, i, j, 2, 19, 13);
                    goUpDown(map, i, j, 4, 15, 18);
                    goSideWays(map, i, j, 19, 27, 14);
                    goUpDown(map, i, j, 4, 32, 34);
                    goUpDown(map, i, j, 22, 31, 11);
                    goSideWays(map, i, j, 12, 19, 30);
                    goSideWays(map, i, j, 12, 17, 24);
                    goUpDown(map, i, j, 20, 24, 16);
                    goSideWays(map, i, j, 17, 29, 20);
                    goUpDown(map, i, j, 26, 30, 18);
                    goSideWays(map, i, j, 19, 23, 26);
                    goSideWays(map, i, j, 28, 34, 31);
                    goUpDown(map, i, j, 26, 36, 22);
                    goUpDown(map, i, j, 31, 38, 28);
                    goUpDown(map, i, j, 31, 37, 32);
                    goUpDown(map, i, j, 33, 39, 38);
                    goSideWays(map, i, j, 33, 38, 33);
                    goSideWays(map, i, j, 30, 38, 38);
                    goSideWays(map, i, j, 30, 33, 36);
                    goUpDown(map, i, j, 37, 39, 30);
                    goSideWays(map, i, j, 17, 28, 37);
                    goUpDown(map, i, j, 35, 38, 17);
                    goSideWays(map, i, j, 17, 22, 35);
                }
                System.out.printf("%c ", map[i][j]);
            }
            System.out.println();
        }
    }

        private static void goSideWays(char[][] map, int i, int j, int from, int until,int posX) {
            for (int l = from; l < until; l++) {
                if (map[i][j] == map[posX][l]) {
                    map[posX][l] = 'x';
                }
            }
        }

        private static void goUpDown(char[][] map, int i, int j, int from, int untill, int posY) {
            for (int k = from; k < untill; k++) {
                if (map[i][j] == map[k][posY]) {
                    map[k][posY] = 'x';
                }
            }
        }


}
