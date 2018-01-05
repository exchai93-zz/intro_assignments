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

    public String printAnIsoscelesTriangle(int num) {
        String result = "";
        int width = (2 * num) - 1;

        for (int i = 1; i < num * 2; i += 2) {
            for (int j = 1; j < (num - (i / 2)); j++) {
                result +=(" ");
            }
            for (int j = 0; j < i; j++) {
                result +=("*");
            }
            result +=("\n");
        }
        return result;
    }

}