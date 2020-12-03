package be.daStudios.legendOfTheLamb;

public enum FilePath {
    STANDARD_PATH(System.getProperty("user.home") + "\\Legend of the Lamb\\savegames\\");

    private final String path;

    FilePath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return path;
    }

}
