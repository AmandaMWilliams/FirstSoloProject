package InteractiveStory.story;

import InteractiveStory.tools.Console;

public class Storyline {

    public Storyline() {
    }

    public void storyLineStart1(String name) {
        Console.print("Once upon a time, there was a youngster named %s.\n" +
                "%s was on a special mission to take cookies to grandma's house." +
                "\nMami told %s to beware of DANGER, especially the Big Bad Wolf, \n" +
                "and sent young %s unaccompanied into the dark forest of doom :) .\n\n" +
                "------------------------------------------------\n\n", name, name, name, name
        );
    }

    public void choosePathDecision1(String name) {
        Integer selection = Console.getIntegerInput("Would you like to take the left path of light, or the right path of despair? \n" +
                "1. Left Path\n" +
                "2. Right Path\n"
        );
        decision1Switch(selection, name);
    }

    private void decision1Switch(Integer selection, String name) {
        switch(selection){
            case 1:
                StoryContinuers storyContinuers = new StoryContinuers(name);
                storyContinuers.followButterfly(name);
                storyContinuers.getWolfDecision(name);
                break;
            case 2:
                StoryEnders storyEnders = new StoryEnders(name);
                storyEnders.storyEnderRightPath(name);
                break;
            default:
                Console.println("Incorrect selection. Please try again.\n");
                choosePathDecision1(name);
                break;
        }
    }




}
