public class TshirtTester {
    public static void main(String[] args) {
       // Tshirt tshirt = new Tshirt(TshirtSize.S, "Polex");

        Tshirt[] tshirt = new Tshirt[3];
        tshirt[0] = new Tshirt(TshirtSize.S, "Polex");
        tshirt[1] = new Tshirt(TshirtSize.M, "Zara");
        tshirt[2] = new Tshirt(TshirtSize.L, "Cropp");

        for (Tshirt x : tshirt) {
             System.out.println("Posiadamy koszulke marki " + x.getManufacture() + " o rozmiarze " + x.getSize());
        }
    }
}
