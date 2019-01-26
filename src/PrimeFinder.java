
public class PrimeFinder implements Runnable {
    public long target;
    public long prime;
    public boolean finished = false;
    private Thread runner;

    public static void main(String[] args) {

try {
    PrimeFinder primeFinder = new PrimeFinder( -76);
} catch (NegativeNumberException test){
    test.printStackTrace();
}

    }

    PrimeFinder(long inTarget) throws NegativeNumberException{
        if(inTarget<0) throw new NegativeNumberException();
        target = inTarget;
        if (runner == null) {
            runner = new Thread(this);
            runner.start();
        }
    }

    public void run() {
        long numPrimes = 0;
        long candidate = 2;
        while (numPrimes < target) {
            if (isPrime(candidate)) {
                numPrimes++;
                prime = candidate;
            }
            candidate++;
        }
        finished = true;
    }

    boolean isPrime(long checkNumber) {
        double root = Math.sqrt(checkNumber);
        for (int i = 2; i <= root; i++) {
            if (checkNumber % i == 0)
                return false;
        }
        return true;
    }



}