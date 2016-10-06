import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class GildedRoseTest {
	private static List<Item> items = null;

	@BeforeClass
	 public static  void init(){

		 items = new ArrayList<Item>();
		 items.add(new Item("+5 Dexterity Vest", 9, 19));
		 items.add(new Item("Aged Brie", 1, 1));
		 items.add(new Item("Elixir of the Mongoose", 4, 6));
		 items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
		 items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 14, 21));
		 items.add(new Item("Conjured Mana Cake", 2, 5));
	 }

	@Test
	public void testTheTruth() {

		GildedRose.main(null);

		for (int i = 0; i < items.size() ; i++) {
			Item expectedItem = items.get(i);
			Item actualItem = GildedRose.getItems().get(i);
			assertEquals(expectedItem, actualItem);
		}

		assertEquals("Test Size", items.size(), GildedRose.getItems().size());

	}
}
