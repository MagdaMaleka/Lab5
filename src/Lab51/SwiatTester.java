package Lab51;

public class SwiatTester {
    public static void main(String[] args) {

        Swiat swiat = new Swiat(kierunkiSwiata.SOUTH, "Krakow");

        System.out.println(swiat.getMiasto() + " jest miastem położonym na " + swiat.getSwiat() + " Polski");
    }

}
