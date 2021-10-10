package instruments;

public abstract class Instrument {

    private double wholeSalePrice;
    private double salePrice;
    String category;
    String brand;
    String model;

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

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Instrument(double wholeSalePrice, double salePrice, String category, String brand, String model) {
        this.wholeSalePrice = wholeSalePrice;
        this.salePrice = salePrice;
        this.category = category;
        this.brand = brand;
        this.model = model;


    }

}
