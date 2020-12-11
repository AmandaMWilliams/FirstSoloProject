package InteractiveStory.story;

import InteractiveStory.player.Reader;
import InteractiveStory.tools.Console;

public class LeftPath {
    private Reader reader;
    private Integer selection;

    public LeftPath(String name) {
        this(new Reader(name));
    }

    public LeftPath(Reader reader) {
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
                RightPath rightPath = new RightPath(name);
                rightPath.rightPath2(name);
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
        Console.print("%s ran and ran until they reached the lake at the edge of Grandma's property.\n" +
                "The sneaky wolf knew %s must be going to visit Grandma. \n" +
                "So he took the super secret back way to beat %s there.", name, name, name);

    }
}
