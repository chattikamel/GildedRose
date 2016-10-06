/**
 * Created by chatti on 06/10/2016.
 */
public class BackstageItem extends Item {

	public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";

	public BackstageItem(int sellIn, int quality) {
		super(BACKSTAGE, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (isQualityInfMax()) {
			incrementQuality();

			if (getSellIn() < 11) {
				incrementQuality();
			}

			if (getSellIn() < 6) {
				incrementQuality();
			}
		}
		decrementSellIn();
	}
}
