package InteractiveStory.player;

import InteractiveStory.tools.Console;

import java.util.ArrayList;

public class Reader {
    private final String name;
    private ItemInventory inventory = new ItemInventory(new ArrayList<>());

    public Reader(String name) {
        this.name = name;
    }

    public void add(String item){
        inventory.addItem(item);
        Console.println("** %s stored %s in pocket **\n", name, item);
    }


}
