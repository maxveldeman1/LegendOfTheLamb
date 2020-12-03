package be.daStudios.legendOfTheLamb.maps;
import be.daStudios.legendOfTheLamb.FilePath;
import be.daStudios.legendOfTheLamb.Menu;
import be.daStudios.legendOfTheLamb.character.User;
import be.daStudios.legendOfTheLamb.items.Item;
import be.daStudios.legendOfTheLamb.items.Key;
import be.daStudios.legendOfTheLamb.rooms.DoorRoom;
import be.daStudios.legendOfTheLamb.rooms.Room;
import be.daStudios.legendOfTheLamb.utility.ChoiceChecker;
import be.daStudios.legendOfTheLamb.utility.Keyboard;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class Session implements Serializable {
    User user;
    private final Map map;
    private int x;
    private int y;
    private boolean running;

    public Session(User user, Map map) {
        setUser(user);
        this.map = map;
        this.x = map.getStartingX();
        this.y = map.getStartingY();
        this.running = true;
    }

    public Map getMap() {
        return map;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void attemptMovement(int xOff, int yOff) {
        int newX = x + xOff;
        int newY = y + yOff;
        Room other = map.getRoom(newX, newY);
        if (other == null) {
            System.out.println("There is nothing in that direction.");
            return;
        }
        if (other instanceof DoorRoom){
            if (user.getBackPack().getInventory().stream().anyMatch(s -> s instanceof Key)){
                this.x = newX;
                this.y = newY;
                System.out.println("\nYou enter the next room...");
                System.out.println(map.getRoom(newX, newY).getRoomInfo() + "\n");

            } else {
                System.out.println("The door is locked");
            }
        }else {
            this.x = newX;
            this.y = newY;
            System.out.println("\nYou enter the next room...");
            System.out.println(map.getRoom(newX, newY).getRoomInfo() + "\n");
        }

    }

    public void showPossibleRoutes() {
        map.getRoom(x,y).setHasBeenCompleted(true);
        Room north = map.getRoom(x, y - 1);
        Room east = map.getRoom(x + 1, y);
        Room south = map.getRoom(x, y + 1);
        Room west = map.getRoom(x - 1, y);
        System.out.print("Possible routes in this room:\n ");
        if (north != null) System.out.print("\tNorth\n");
        if (east != null) System.out.print("\tEast\n");
        if (south != null) System.out.print("\tSouth\n");
        if (west != null) System.out.print("\tWest\n");

    }

    /**
     * Special behaviour:
     * this method will 'hijack' the current thread and keep cycling within itself.
     * It only returns when the user manually closes the loop or if the program is shut down.
     */
    public void start() {
        Keyboard keyboard = new Keyboard();
        System.out.println("Hello " + user.getName()+"!\n");
        System.out.println("Welcome to " + map.getMapName() + "!\n");
        System.out.println(map.getDescription()+"\n");
        System.out.println("Type 'help' for a list of commands.");
        while (running) {
            showPossibleRoutes();
            String userInput = (new ChoiceChecker()).commandChoiceCheck();
            switch (userInput){
                case "north":
                    attemptMovement(0, -1); break;
                case "east":
                    attemptMovement(1, 0); break;
                case "south":
                    attemptMovement(0, 1); break;
                case "west":
                    attemptMovement(-1, 0); break;
                case"quit":
                    close();break;
                case "help":
                    Menu.printControls();

            }
        }
    }
    public void continueSession(){
        System.out.println("Welcome back!");
        System.out.println("Type 'help' for a list of commands.");
        while (running) {
            showPossibleRoutes();
            String userInput = (new ChoiceChecker()).commandChoiceCheck();
            switch (userInput){
                case "north":
                    attemptMovement(0, -1); break;
                case "east":
                    attemptMovement(1, 0); break;
                case "south":
                    attemptMovement(0, 1); break;
                case "west":
                    attemptMovement(-1, 0); break;
                case"quit":
                    close();break;
                case "help":
                    Menu.printControls();

            }
        }

    }



    public void save() {
        Path path = Paths.get(FilePath.STANDARD_PATH.toString());

        try(FileOutputStream fileOutputStream = new FileOutputStream(System.getProperty("user.home") + "\\Legend of the Lamb\\savegames\\SaveFile.sav", true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {
            Files.createDirectories(path.getParent());
            if(Files.exists(path)){
                Files
                objectOutputStream.writeObject(this);
            } else {Files.createFile(path);
                objectOutputStream.writeObject(this);}




        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void close() {
        save();
        this.running = false;
    }



}
