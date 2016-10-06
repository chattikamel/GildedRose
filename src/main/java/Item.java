import com.sun.deploy.util.StringUtils;

public class Item {
	public String name;
	public int sellIn;
	public int quality;

	public Item(String name, int sellIn, int quality) {
		this.setName(name);
		this.setSellIn(sellIn);
		this.setQuality(quality);
	}

	public void updateQuality() {
        if (getQuality() > 0) {
            decrementQuality();
        }
        decrementSellIn();
    }

	public boolean isExpired() {
        return getSellIn() < 0;
    }

	public void decrementSellIn() {
        setSellIn(getSellIn() - 1);
    }

	public void incrementQuality() {
        setQuality(getQuality() + 1);
    }

	public void decrementQuality() {
        setQuality(getQuality() - 1);
    }

	public boolean isQualityInfMax() {
        return getQuality() < 50;
    }

	/* Generated getter and setter code */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSellIn() {
		return sellIn;
	}

	public void setSellIn(int sellIn) {
		this.sellIn = sellIn;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	@Override
	public boolean equals(Object anObject) {
		if (this == anObject) {
			return true;
		}
		if (anObject instanceof Item) {
			Item object = (Item) anObject;
			return (object.getName() != null && object.getName().equals(this.getName())
					&& object.getQuality() == this.getQuality() && object.getSellIn() == this.getSellIn());

		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Item(").append(getName()).append(", ").append(getSellIn()).append(", ").append(getQuality())
				.append(")");
		return  sb.toString();
	}
}
