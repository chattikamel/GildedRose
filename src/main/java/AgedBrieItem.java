/**
 * Created by chatti on 06/10/2016.
 */
public class AgedBrieItem extends Item {

	public static final String AGED_BRIE = "Aged Brie";

	public AgedBrieItem(int sellIn, int quality) {
		super(AGED_BRIE, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (isQualityInfMax()) {
			incrementQuality();
            if (isExpired()) {
                incrementQuality();
            }
		}
		decrementSellIn();
	}
}
