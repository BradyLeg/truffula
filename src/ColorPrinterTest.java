import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColorPrinterTest {

  @Test
  void testPrintlnWithRedColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act: Print the message
    String message = "I speak for the trees";
    printer.println(message);

    String expectedOutput = ConsoleColor.RED + "I speak for the trees" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }

  @Test
  void testPrintWithCyanSingleParameterRestTrue() {
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.CYAN);

    printer.print("Miku Miku Beeeeaaaaam");

    String expected = ConsoleColor.CYAN + "Miku Miku Beeeeaaaaam" + ConsoleColor.RESET;

    assertEquals(expected, outputStream.toString());
  }

  @Test
  void testPrintWithColorAndResetFalse() {
    // arrange
    // this is to capture printed output
    ByteArrayOutputStream output = new ByteArrayOutputStream();
    PrintStream testStream = new PrintStream(output);

    // this will write to the output
    ColorPrinter printer = new ColorPrinter(testStream);
    printer.setCurrentColor(ConsoleColor.RED);

    String message = "test";

    // act perform the action we are testing
    // call the print method with resete to false
    // the printed message will stay red and will not reset after print
    printer.print(message, false);

    // assert
    String expected = ConsoleColor.RED.toString() + message;
    assertEquals(expected, output.toString());
  }
}
