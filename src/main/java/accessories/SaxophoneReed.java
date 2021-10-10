package accessories;

import behaviours.ICanSell;

public class SaxophoneReed extends ShopItems implements ICanSell {

    private String saxReedType;

    public SaxophoneReed(double wholeSalePrice, double salePrice, String saxReedType) {
        super(wholeSalePrice, salePrice);
        this.saxReedType = saxReedType;
    }

    public String getSaxReedType() {
        return saxReedType;
    }

    public void setSaxReedType(String saxReedType) {
        this.saxReedType = saxReedType;
    }

    @Override
    public double calculateMarkUp() {
        return this.getSalePrice() - this.getWholeSalePrice();
    }
}
