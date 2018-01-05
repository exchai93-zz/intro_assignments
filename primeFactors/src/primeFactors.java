import java.util.ArrayList;


public class primeFactors {

    public static ArrayList<Integer> generate(int n) {
        ArrayList<Integer> factors = new ArrayList<>();
        int divisor = 2;

        for (int divisor = 2; n > 1; divisor++)
            for(; n % divisor == 0; n /= divisor)
                factors.add(divisor);
        return factors;
    }
}
