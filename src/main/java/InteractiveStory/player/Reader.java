package InteractiveStory.player;

import InteractiveStory.tools.Console;

import java.util.ArrayList;

public class Reader {
    private ItemInventory inventory = new ItemInventory(new ArrayList<>());

    public void add(String item){
        inventory.addItem(item);
        Console.println("** " + item + " stored in pocket **\n");
    }


}
