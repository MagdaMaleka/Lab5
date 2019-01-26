package Lab51;

public class Swiat {
    private kierunkiSwiata swiat;
    private String miasto;

    public Swiat(kierunkiSwiata swiat, String miasto) {
        this.swiat = swiat;
        this.miasto = miasto;
    }

    public kierunkiSwiata getSwiat() {
        return swiat;
    }

    public String getMiasto() {
        return miasto;
    }
}
