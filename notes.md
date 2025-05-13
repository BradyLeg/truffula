# Truffula Notes
As part of Wave 0, please fill out notes for each of the below files. They are in the order I recommend you go through them. A few bullet points for each file is enough. You don't need to have a perfect understanding of everything, but you should work to gain an idea of how the project is structured and what you'll need to implement. Note that there are programming techniques used here that we have not covered in class! You will need to do some light research around things like enums and and `java.io.File`.

PLEASE MAKE FREQUENT COMMITS AS YOU FILL OUT THIS FILE.

## App.java
- Actual file that gets executed.
- Includes options to show hidden files, use colored output, and the root directory that the program should start reading from.
- Flags should be used to show hidden files (-h) and not using colored output (-nc).
## ConsoleColor.java
- Applies color to console text using Enums representing ANSI escape codes.
- To apply a color, prepend the desired color ANSI code to the text and append the REST code after the text to rest the color to default.

## ColorPrinter.java / ColorPrinterTest.java
- ColorPrinter is a class that supports printing colored text using PrintStream.
- Allows setting a current color, print messages in that color, and deciding if the color should be rest or not.
- Colors and the rest code can be accessed from the ConsoleColor class

## TruffulaOptions.java / TruffulaOptionsTest.java

## TruffulaPrinter.java / TruffulaPrinterTest.java

## AlphabeticalFileSorter.java