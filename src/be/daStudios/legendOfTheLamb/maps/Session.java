package be.daStudios.legendOfTheLamb.maps;
import be.daStudios.legendOfTheLamb.maps.Map;
import be.daStudios.legendOfTheLamb.rooms.Room;


import java.io.*;

public class Session implements Serializable {
    private final String username;
    private final Map map;
    private int x;
    private int y;
    private boolean running;

    public Session(String username, Map map) {
        this.username = username;
        this.map = map;
        this.x = map.getStartingX();
        this.y = map.getStartingY();
        this.running = true;
    }

    public void attemptMovement(int xOff, int yOff) {
        int newX = x + xOff;
        int newY = y + yOff;
        Room other = map.getRoom(newX, newY);
        if (other == null) {
            System.out.println("There is nothing in that direction.");
            return;
        }
        this.x = newX;
        this.y = newY;
        System.out.println("You enter the next room...");
    }

    public void showPossibleRoutes() {
        Room north = map.getRoom(x, y - 1);
        Room east = map.getRoom(x + 1, y);
        Room south = map.getRoom(x, y + 1);
        Room west = map.getRoom(x - 1, y);
        System.out.print("Possible routes in this room: ");
        if (north != null) System.out.print("North\t");
        if (east != null) System.out.print("East\t");
        if (south != null) System.out.print("South\t");
        if (west != null) System.out.print("West");
        System.out.print("\n");
    }

    /**
     * Special behaviour:
     * this method will 'hijack' the current thread and keep cycling within itself.
     * It only returns when the user manually closes the loop or if the program is shut down.
     */
    public void start() {
        System.out.println();
        System.out.println("Welcome to " + map.getMapName() + ", " + username+".");
        System.out.println("Type 'help' for a list of commands.");
        while (running) {
            Commands.processInput(this);
        }
    }

    public void save() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(".\\saves\\" + username + ".ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void close() {
        save();
        this.running = false;
    }
}
