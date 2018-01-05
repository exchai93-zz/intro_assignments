public class Triangle {

    public String printAsterisk() {
        return("*");
    }

    public String printHorizontalLine(int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result +=("*");
        }
        return result;
    }

    public String printVerticalLine(int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            result +=("*\n");
        }
        return result;
    }

    public String printARightTriangle(int num) {
        String result = "";
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++)
                result +=("*");
                result +=("\n");

        }
        return result;
    }

}