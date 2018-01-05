import java.util.ArrayList;


public class primeFactors {

    public static ArrayList<Integer> generate(int n) {

        ArrayList<Integer> factors = new ArrayList<>();

        if (n > 1) {
            if (n % 2 == 0) {
                factors.add(2);
                n /= 2;
            }
        }
        if (n > 1)
            factors.add(n);
        return factors;
    }
}
