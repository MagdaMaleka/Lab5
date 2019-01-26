package Lab51;

public class ComputationTester {
    public static void main(String[] args) {
        System.out.println(Computation.ADD.perform(2, 6));
        System.out.println(Computation.SUBTRACT.perform(9, 7));
        System.out.println(Computation.MULTIPLY.perform(7, 8));
        System.out.println(Computation.DIVIDE.perform(10, 5));
    }
}
