package InteractiveStory.player;

import java.util.List;

public class ItemInventory {

    private List<String> list;

    public ItemInventory(List<String> list) {
        this.list = list;
    }

    public void addItem(String item){
        list.add(item);
    }

    public void removeItem(String item){
        list.remove(item);
    }

    public Boolean hasItem(String item){
        return list.contains(item);
    }


}
