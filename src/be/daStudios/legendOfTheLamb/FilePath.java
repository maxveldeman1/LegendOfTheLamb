package be.daStudios.legendOfTheLamb;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public enum FilePath {
    STANDARD_PATH(System.getProperty("user.home") ,"Legend of the Lamb", "savegames");

    private final String path;

    FilePath(String... path) {
        FileSystem fs = FileSystems.getDefault();
        String newPath = "";
        for (String string : path) {
            newPath = newPath.concat(string + fs.getSeparator());
        }
        this.path = newPath;
    }

    @Override
    public String toString() {
        return path;
    }

}
