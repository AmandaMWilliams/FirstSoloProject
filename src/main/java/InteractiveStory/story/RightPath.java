package InteractiveStory.story;

import InteractiveStory.tools.Console;

public class RightPath {
    private final String name;

    public RightPath(String name) {
        this.name = name;
    }

    public void rightPath1(String name) {
        Console.print("You chose the right path. \n" +
                "Mami jumped out from behind a tree and popped you with the chancleta. \n" +
                "You're grounded.\n\n" +
                "--------------------------------------------\n\n" +
                "THE END\n" +
                "Moral: Do not choose a path that is obviously wrong.");

    }

    public void rightPath2(String name) {
        Console.print("You chose the right path. \n" +
                "Mami jumped out from behind a tree and popped you with the chancleta. \n" +
                "You're grounded.\n\n" +
                "--------------------------------------------\n\n" +
                "THE END\n" +
                "Moral: Do not talk to strangers.");
    }
}
