package altimetrik.raj;

public class DeluxeBurger {
    String BreadRollType;
    boolean meat,carrot,tomato,lettuce,spinach,cooldrinks,chips;
    private final int price_deluxeburger=350;

    public String getBreadRollType() {
        return BreadRollType;
    }

    public boolean isMeat() {
        return meat;
    }

    public boolean isCarrot() {
        return carrot;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isSpinach() {
        return spinach;
    }

    public boolean isCooldrinks() {
        return cooldrinks;
    }

    public boolean isChips() {
        return chips;
    }

    public int getPrice_deluxeburger() {
        return price_deluxeburger;
    }
}
