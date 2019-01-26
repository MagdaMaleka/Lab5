import java.nio.charset.IllegalCharsetNameException;

public class SquareRoot {
    public static void main(String[] args) {
        double d = 0;
        try {
            d = Double.parseDouble(args[0]);
            if (d < 0) {
                throw new IllegalArgumentException("Podano wartość mniejszą od zera");
            }
            System.out.println("Pierwiastek kwadratowy liczby: " + args[0] + " to " + Math.sqrt(d));
        } catch (NumberFormatException e){
            System.out.println("Podana wartość musi byc liczba");
        } catch ( IllegalArgumentException e) {
            System.out.println("Liczba ujemna");
        }
        System.out.println("Koniec");

    }
}
