import java.util.ArrayList;


public class primeFactors {

    public static ArrayList<Integer> generate(int n) {

        ArrayList<Integer> factors = new ArrayList<>();
        int divisor = 2;
        if (n > 1) {
            while (n % divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            }
        }
        return factors;
    }
}
