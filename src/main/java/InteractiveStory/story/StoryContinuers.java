package InteractiveStory.story;

import InteractiveStory.player.Reader;
import InteractiveStory.tools.Console;

public class StoryContinuers {
    private Reader reader;
    private Integer selection;

    public StoryContinuers(String name) {
        this(new Reader(name));
    }

    public StoryContinuers(Reader reader) {
        this.reader = reader;
    }

    public void followButterfly(String name) {
        Console.print("\n%s chose the left path.\n\n" +
                "%s followed a butterfly down the sunny path to a moss covered rock.\n" +
                "%s found a chancleta!\n", name, name, name);
        reader.add("Chancleta");
    }

    public void getWolfDecision(String name) {
        selection =
                Console.getIntegerInput("%s sat on the rock to take a break.\n"
                        + "Just then, the Big Bad Wolf appeared from behind a tree.\n" +
                        "He smiled at %s with a ferocious grin.\n\n" +
                        "---------------------------------------------\n\n"
                        + "1. Talk to the wolf\n"
                        + "2. Run away", name, name);
        encounterWolf(selection, name);
    }

    public void encounterWolf(Integer selection, String name) {
        switch (selection) {
            case 1:
                StoryEnders storyEnders = new StoryEnders(name);
                storyEnders.storyEnder2(name);
                break;
            case 2:
                stopAtLake(name);
                break;
            default:
                Console.println("Incorrect selection. Please try again.\n");
                getWolfDecision(name);
                break;
        }
    }

    public void stopAtLake(String name) {
        Console.print("\n%s ran and ran until they reached the lake at the edge of Grandma's property.\n" +
                "The sneaky wolf knew %s must be going to visit Grandma. \n" +
                "So he took the super secret back way to beat %s to Grandma's house.\n\n", name, name, name);
        lakeDecision(name);
    }

    public void lakeDecision(String name) {
        selection = Console.getIntegerInput("The lake was blue and beautiful.\n" +
                "%s saw something shiny in the water.\n\n" +
                "---------------------------------------\n\n" +
                "1. Pick up the shiny thing\n" +
                "2. Ignore the shiny thing and walk away", name);
        pickUpShiny(selection, name);
    }

    public void pickUpShiny(Integer selection, String name) {
        switch (selection) {
            case 1:
                StoryEnders storyEnders = new StoryEnders(name);
                storyEnders.storyEnder3(name);
                break;
            case 2:
                fishGetTeeth(name);
                madeItToGrandmas(name);
                break;
            default:
                Console.println("Incorrect selection. Please try again.\n");
                lakeDecision(name);
                break;
        }
    }

    private void fishGetTeeth(String name) {
        Console.print("\n%s finished resting and began to walk away toward Grandma's.\n" +
                "Just as %s turned, a fish swam passed the shiny object,\n" +
                "launching it from the water, and hitting %s in the head.\n" +
                "%s found a Grandma's teeth!\n", name, name, name, name);
        reader.add("Grandma's teeth");
    }

    private void madeItToGrandmas(String name) {

    }
}