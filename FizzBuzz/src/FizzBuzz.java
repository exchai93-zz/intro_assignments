public class FizzBuzz {

    public static String of(int i ) {
        if (i == 0)
            return "0";

        return _of(i);
    }

    private static String _of(int i) {
        String s = "";

        if (i % 3 == 0)
            s += "Fizz";
        if (i % 5 == 0)
            s += "Buzz";

        return s.isEmpty() ? String.valueOf(i) : s;
    }

}
