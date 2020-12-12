package InteractiveStory.tools;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Console {
    private final Scanner input;
    private final PrintStream output;

    public Console(InputStream in, PrintStream out) {
        this.input = new Scanner(in);
        this.output = out;
    }

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt, Object... args) {
        Scanner scanner = new Scanner(System.in);
        println(prompt, args);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt, Object... args) { //take the Double value, convert to an int, and return int
        try {
            return getDoubleInput(prompt, args).intValue();
        } catch (Exception e){
            println("Invalid Input.");
            return getIntegerInput(prompt, args);
        }
    }

    public static Double getDoubleInput(String prompt, Object... args) {
        String userInput = getStringInput(prompt, args);
        return Double.parseDouble(userInput);  //read entered String as a Double and return Double
    }
}
