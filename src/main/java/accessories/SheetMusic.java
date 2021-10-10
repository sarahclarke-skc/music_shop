package accessories;

import behaviours.ICanSell;

public class SheetMusic implements ICanSell {

    private String name;
    private String composer;
    private double wholesalePrice;
    private double salePrice;

    public SheetMusic(String name, String composer, double wholesalePrice, double salePrice) {
        this.name = name;
        this.composer = composer;
        this.wholesalePrice = wholesalePrice;
        this.salePrice = salePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public double getWholesalePrice() {
        return wholesalePrice;
    }

    public void setWholesalePrice(double wholesalePrice) {
        this.wholesalePrice = wholesalePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    @Override
    public double calculateMarkUp() {
        return this.salePrice - this.wholesalePrice;
    }
}
