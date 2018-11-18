package data_access;

import java.util.List;
import java.util.ArrayList;
import domain.*;

public class InMemoryItemDao implements ItemDao {
    private List<Item> items;

    public InMemoryItemDao() {
        items = new ArrayList<Item>();
    }

    public List<Item> getItems() {
        return items;
    }

    public Item getItemById(int id) {
        return items.get(id);
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
}