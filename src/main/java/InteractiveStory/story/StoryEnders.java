package InteractiveStory.story;

import InteractiveStory.tools.Console;

public class StoryEnders {
    private final String name;

    public StoryEnders(String name) {
        this.name = name;
    }

    public void storyEnder1(String name) {
        Console.print("%s chose the right path. \n" +
                "Mami jumped out from behind a tree and popped %s with the chancleta. \n" +
                "%s is grounded.\n\n" +
                "--------------------------------------------\n\n" +
                "THE END\n" +
                "Moral: Do not choose a path that is obviously wrong. Stay safe.\n", name, name, name);

    }

    public void storyEnder2(String name) {
        Console.print("%s chose the right path. \n" +
                "Mami jumped out from behind a tree and popped %s with the chancleta. \n" +
                "%s is grounded.\n\n" +
                "--------------------------------------------\n\n" +
                "THE END\n" +
                "Moral: Do not talk to strangers. Stay safe.\n", name, name, name);
    }

    public void storyEnder3(String name){
        Console.print("%s reached their hand into the lake water. \n" +
                "Mami swim up from under the water and popped %s with the chancleta. \n" +
                "%s is grounded.\n\n" +
                "--------------------------------------------\n\n" +
                "THE END\n" +
                "Moral: Do not touch anything you do not recognize. Stay safe.\n", name, name, name);
    }
}
