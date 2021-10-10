package accessories;

import behaviours.ICanSell;

public abstract class ShopItems implements ICanSell {

    private double wholeSalePrice;
    private double salePrice;

    public ShopItems(double wholeSalePrice, double salePrice) {
        this.wholeSalePrice = wholeSalePrice;
        this.salePrice = salePrice;
    }

    public double getWholeSalePrice() {
        return wholeSalePrice;
    }

    public void setWholeSalePrice(double wholeSalePrice) {
        this.wholeSalePrice = wholeSalePrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

}
