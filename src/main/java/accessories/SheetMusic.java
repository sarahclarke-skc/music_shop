package accessories;

import behaviours.ICanSell;

public class SheetMusic extends ShopItems implements ICanSell {

    private String name;
    private String composer;

    public SheetMusic(String name, String composer, double wholesalePrice, double salePrice) {
        super(wholesalePrice, salePrice);
        this.name = name;
        this.composer = composer;
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

    @Override
    public double calculateMarkUp() {
        return this.getSalePrice() - this.getWholeSalePrice();
    }

}
