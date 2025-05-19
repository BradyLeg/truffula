# Truffula Notes
As part of Wave 0, please fill out notes for each of the below files. They are in the order I recommend you go through them. A few bullet points for each file is enough. You don't need to have a perfect understanding of everything, but you should work to gain an idea of how the project is structured and what you'll need to implement. Note that there are programming techniques used here that we have not covered in class! You will need to do some light research around things like enums and and `java.io.File`.

PLEASE MAKE FREQUENT COMMITS AS YOU FILL OUT THIS FILE.

## App.java
- Actual file that gets executed.
- Includes options to show hidden files, use colored output, and the root directory that the program should start reading from.
- Flags should be used to show hidden files (-h) and not using colored output (-nc).
## ConsoleColor.java
- Applies color to console text using Enums representing ANSI escape codes.
- To apply a color, prepend the desired color ANSI code to the text and append the RESET code after the text to reset the color to default.

## ColorPrinter.java / ColorPrinterTest.java
- ColorPrinter is a class that supports printing colored text using PrintStream.
- Allows setting a current color, print messages in that color, and deciding if the color should be reset or not.
- Colors and the reset code can be accessed from the ConsoleColor class
- ColorPrintTest contains a test for checking if the color red is applied to the text properly 

## TruffulaOptions.java / TruffulaOptionsTest.java
- checks flags for if color should not be used (-nc) 
- or if hidden files should be shown (-h) 
- if unkown flags are provided or path argument is missing, throws illegalArgumentException/
- FileNotFoundException will be thrown if specified directory does not exist or if path    points to a file instead of a directory
- checks to see if flags are being created properly 
- checks if file directory path is being read correctly

## TruffulaPrinter.java / TruffulaPrinterTest.java
- Prints the directory tree structure.
- Supports sorting files and directories in a case-insensitive alphabetical order.
- Cycles through texts colors for visually clarifying which level files and directories are at.
- Test file checks if os used is Windows or not.
- Test file contains a test to see if the directories and files are being printed out correctly and in the right order.


## AlphabeticalFileSorter.java
- Sorts an array of files alphabetically by name, ignoring case.
- uses lambdas, a shortcut way of writing small code without giving it a name 