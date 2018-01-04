import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void testPrintAsterisk() {
        Triangle triangle = new Triangle();
        String result = triangle.PrintAsterisk();

        assertEquals("*", result);
    }

    @Test
    public void testDrawHoriztonalLine() {
        Triangle triangle = new Triangle();
        String result = triangle.DrawHoriztonalLine(8);

        assertEquals("********", result);
    }


}