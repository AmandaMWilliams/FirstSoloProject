package InteractiveStory;

import InteractiveStory.tools.Console;

public class Storyline {

    Storyline storyline = new Storyline();

    public void storyScript1(String name) {
        Console.print("Once upon a time, there was a youngster named " + name + ". \n" +
                name + " was on a special mission to take cookies to grandma's house." +
                "\nMami reminded " + name + " to beware of the Big Bad Wolf, \n" +
                "and sent young " + name + " unaccompanied into the dark forest of doom :) .\n\n" +
                "------------------------------------------------\n\n"
        );
    }

    public void abortMission() {
        Console.getIntegerInput("Would you like to continue to Grandma's house or run home to Mami?\n" +
                "1. Proceed\n" +
                "2. Go home"
        );
    }

    public void storyDecision1(String name) {
        String output = null;
        Integer selection = Console.getIntegerInput("Would you like to take the left path of light, or the right path of despair? \n" +
                "1. Left Path\n" +
                "2. Right Path\n"
        );
        output = decision1Switch(selection, name);
    }

    private String decision1Switch(Integer selection, String name) {
        String output = null;
        switch(selection){
            case 1:
                output = storyline.leftPath1(name);
                break;
        }
        return output;
    }

    public String leftPath1(String name) {
        return Console.print("You chose the left path. " + name + " followed a butterfly down the sunny path to a moss covered rock.\n" +
                name + " found a chancleta!\n" +
                "** Chancleta stored in pocket **");
    }


}
