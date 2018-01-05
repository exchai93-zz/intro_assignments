public class FizzBuzz {

    public static String of(int i ) {
        if (i == 0)
            return "0";
        if (i % 3 == 0)
            return "Fizz";
        if (i == 5)
            return "Buzz";
        return String.valueOf(i);
    }

}
