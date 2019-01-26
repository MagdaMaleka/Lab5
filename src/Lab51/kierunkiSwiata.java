package Lab51;

public enum kierunkiSwiata {
    EAST("E", "wschód"),
    NORTH_EAST("NE", "północny_wschód"),
    SOUTH_EAST("SE", "połódniowy_wschód"),
    WEST("W", "zachód"),
    NORTH_WEST("NW", "północny_zachód"),
    SOUTH_WEST("SW", "połódniowy_zachód"),
    NORTH("N", "północ"),
    SOUTH("S", "połódnie");


    private String shortcut;
    private String polishName;

    kierunkiSwiata(String shortcut, String polishName) {
        this.shortcut = shortcut;
        this.polishName = polishName;
    }

    public String getShortcut() {
        return shortcut;
    }

    public String getPolishName() {
        return polishName;
    }

}
