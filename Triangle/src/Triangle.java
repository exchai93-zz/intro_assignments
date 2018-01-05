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

}