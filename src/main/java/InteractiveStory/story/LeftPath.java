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

    public String leftPath1(String name) {
        reader.add("Chancleta");
        return Console.print("You chose the left path. \n" + name +
                " followed a butterfly down the sunny path to a moss covered rock.\n" +
                name + " found a chancleta!\n");
    }


}
