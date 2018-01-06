import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class AsteriskPrinterTest {

    @Test
    public void printAsterisk() {
        AsteriskPrinter printer = new AsteriskPrinter();
        String result = printer.printAsterisk();

        assertEquals("*", result);
    }

    @Test
    public void printHorizontalLine() {
        AsteriskPrinter printer = new AsteriskPrinter();
        String result = printer.printHorizontalLine(8);

        assertEquals("********", result);
    }

    @Test
    public void printVerticalLine() {
        AsteriskPrinter printer = new AsteriskPrinter();
        String result = printer.printVerticalLine(3);

        assertEquals("*\n*\n*\n", result);
    }

    @Test
    public void printARightTriangle() {
        AsteriskPrinter printer = new AsteriskPrinter();
        String result = printer.printARightTriangle(3);

        assertEquals("*\n**\n***\n", result);
    }

    @Test
    public void printIsoscelesTriangle() {
        AsteriskPrinter printer = new AsteriskPrinter();
        String result = printer.printIsoscelesTriangle(3);

        assertEquals("  *  \n *** \n*****\n", result);
    }

    @Test
    public void printDiamond() {
        AsteriskPrinter printer = new AsteriskPrinter();
        String result = printer.printDiamond(3);

        assertEquals("  *  \n *** \n*****\n *** \n  *  \n", result);
    }


}