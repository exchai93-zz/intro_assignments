import java.util.ArrayList;


public class primeFactors {

    public static ArrayList<Integer> generate(int n) {

        ArrayList<Integer> factors = new ArrayList<>();

        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }
}
