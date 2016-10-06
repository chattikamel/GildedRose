import java.util.ArrayList;
import java.util.List;

public class GildedRose {


    private static List<Item> items = null;

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("OMGHAI!");

        items = new ArrayList<Item>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new AgedBrieItem(2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new SulfrasItem(0, 80));
        items.add(new BackstageItem(15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        updateQuality();

    }

    public static void displayItems() {
        for (Item item : items) {
            System.out.format("%s, %s, %s \n", item.getName(), item.getSellIn(), item.getQuality());
        }
    }

    public static void updateQuality() {
        for (Item item : items) {
            item.updateQuality();
        }
    }

    public static List<Item> getItems() {
        return items;
    }
}