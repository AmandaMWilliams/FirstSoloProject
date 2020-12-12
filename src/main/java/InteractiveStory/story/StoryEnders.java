package InteractiveStory.story;

import InteractiveStory.tools.Console;

public class StoryEnders {
    private final String name;

    public StoryEnders(String name) {
        this.name = name;
    }

    public void storyEnderRightPath(String name) {
        Console.print("\n%s chose the right path.\n" +
                "Mami jumped out from behind a tree and popped %s with the chancleta.\n" +
                "%s is grounded.\n\n" +
                "--------------------------------------------\n\n" +
                "~ THE END ~\n" +
                "Moral: Do not choose a path that is obviously wrong. Stay safe.\n\n", name, name, name);
    }

    public void storyEnderWolfChat(String name) {
        Console.print("\n\"Hello, Mr. Wolf\" said %s.\n" +
                "Mami jumped out from behind a tree and popped %s with the chancleta.\n" +
                "%s is grounded.\n\n" +
                "--------------------------------------------\n\n" +
                "~ THE END ~\n" +
                "Moral: Do not talk to strangers. Stay safe.\n\n", name, name, name);
    }

    public void storyEnderReachIntoWater(String name){
        Console.print("\n%s reached their hand into the lake water.\n" +
                "Mami surfaced from under the water and popped %s with the chancleta.\n" +
                "%s is grounded.\n\n" +
                "--------------------------------------------\n\n" +
                "~ THE END ~\n" +
                "Moral: Do not touch anything you do not recognize. Stay safe.\n\n", name, name, name);
    }
}
