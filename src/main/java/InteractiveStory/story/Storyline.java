package InteractiveStory.story;

import InteractiveStory.tools.Console;

public class Storyline {

    public Storyline() {
    }

    public void storyScript1(String name) {
        Console.print("Once upon a time, there was a youngster named " + name + ". \n" +
                name + " was on a special mission to take cookies to grandma's house." +
                "\nMami reminded " + name + " to beware of the Big Bad Wolf, \n" +
                "and sent young " + name + " unaccompanied into the dark forest of doom :) .\n\n" +
                "------------------------------------------------\n\n"
        );
    }

    public String abortMission() {
        return Console.getStringInput("Would you like to continue to Grandma's house or run home to Mami?\n" +
                "1. Proceed\n" +
                "2. Go home"
        );
    }

    public void storyDecision1(String name) {
        Integer selection = Console.getIntegerInput("Would you like to take the left path of light, or the right path of despair? \n" +
                "1. Left Path\n" +
                "2. Right Path\n"
        );
        decision1Switch(selection, name);
    }

    private void decision1Switch(Integer selection, String name) {
        switch(selection){
            case 1:
                LeftPath leftPath = new LeftPath(name);
                leftPath.followButterfly(name);
                leftPath.getWolfDecision(name);
                break;
            case 2:
                RightPath rightPath = new RightPath(name);
                rightPath.rightPath1(name);
                break;
            default:
                Console.println("Incorrect selection. Please try again.\n");
                storyDecision1(name);
                break;
        }
    }




}
