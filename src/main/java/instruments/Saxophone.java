package instruments;

import behaviours.ICanPlay;
import behaviours.ICanSell;

public class Saxophone extends Instrument implements ICanPlay, ICanSell {

    //if add a key/type e.g. Eb Alto / Bb Soprano, would that be better as another subclass?

    private String saxType;

    public Saxophone(double wholeSalePrice, double salePrice, String category, String brand, String model, String saxType) {
        super(wholeSalePrice, salePrice, category, brand, model);
        this.saxType = saxType;
    }

    @Override
    public String play() {
        return "I'm a saxophone";
    }

    @Override
    public double calculateMarkUp() {
        return this.getSalePrice() - this.getWholeSalePrice();
    }

    public String getSaxType() {
        return saxType;
    }

    public void setSaxType(String saxType) {
        this.saxType = saxType;
    }
}
