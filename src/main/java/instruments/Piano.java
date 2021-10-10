package instruments;

import behaviours.ICanPlay;
import behaviours.ICanSell;

public class Piano  extends Instrument implements ICanSell, ICanPlay {

    public Piano(double wholeSalePrice, double salePrice, String category, String brand, String model) {
        super(wholeSalePrice, salePrice, category, brand, model);
    }

    @Override
    public String play() {
        return "I'm a piano";
    }

    @Override
    public double calculateMarkUp() {
        return this.getSalePrice() - this.getWholeSalePrice();
    }
}
