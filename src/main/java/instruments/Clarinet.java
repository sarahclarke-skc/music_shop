package instruments;

import behaviours.ICanPlay;
import behaviours.ICanSell;

public class Clarinet extends Instrument implements ICanPlay, ICanSell {

    private String clarinetType;

    public Clarinet(double wholeSalePrice, double salePrice, String category, String brand, String model, String clarinetType) {
        super(wholeSalePrice, salePrice, category, brand, model);
        this.clarinetType = clarinetType;
    }

    public String getClarinetType() {
        return clarinetType;
    }

    public void setClarinetType(String clarinetType) {
        this.clarinetType = clarinetType;
    }

    @Override
    public String play() {
        return "I'm a clarinet";
    }

    @Override
    public double calculateMarkUp() {
        return this.getSalePrice() - this.getWholeSalePrice();
    }
}
