package InteractiveStory.story;

import InteractiveStory.player.Reader;
import InteractiveStory.tools.Console;

public class LeftPath {
    private Reader reader;

    public LeftPath(String name) {
        this(new Reader(name));
    }

    public LeftPath(Reader reader) {
        this.reader = reader;
    }

    public void followButterfly(String name) {
        Console.print("You chose the left path. \n" + name +
                " followed a butterfly down the sunny path to a moss covered rock.\n" +
                name + " found a chancleta!\n");
        reader.add("Chancleta");
    }

    public Integer getWolfDecision(String name) {
        return Console.getIntegerInput("%s sat on the rock to take a break.\n"
                + "Just then, the Big Bad Wolf appeared from behind a tree.\n"
                + "1. Talk to wolf\n"
                + "2. Run away", name);
    }

    public void encounterWolf(Integer selection, String name){
        switch(selection){
            case 1:

                break;
            case 2:

                break;
            default:

                break;
        }
    }
}
