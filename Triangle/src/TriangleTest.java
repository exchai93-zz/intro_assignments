import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void printAsterisk() {
        Triangle triangle = new Triangle();
        String result = triangle.printAsterisk();

        assertEquals("*", result);
    }

    @Test
    public void printHorizontalLine() {
        Triangle triangle = new Triangle();
        String result = triangle.printHorizontalLine(8);

        assertEquals("********", result);
    }

    @Test
    public void printVerticalLine() {
        Triangle triangle = new Triangle();
        String result = triangle.printVerticalLine(3);

        assertEquals("*\n*\n*\n", result);
    }

    @Test
    public void printARightTriangle() {
        Triangle triangle = new Triangle();
        String result = triangle.printARightTriangle(3);

        assertEquals("*\n**\n***\n", result);
    }

    @Test
    public void printIsoscelesTriangle() {
        Triangle triangle = new Triangle();
        String result = triangle.printIsoscelesTriangle(3);

        assertEquals("  *  \n *** \n*****\n", result);
    }

    @Test
    public void printDiamond() {
        Triangle triangle = new Triangle();
        String result = triangle.printDiamond(3);

        assertEquals("  *  \n *** \n*****\n *** \n  *  \n", result);
    }


}