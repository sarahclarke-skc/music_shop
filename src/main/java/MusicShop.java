import behaviours.ICanSell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private double till;
    private ArrayList<ICanSell> stock;

    public MusicShop(String name, double till) {
        this.name = name;
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public int getStock() {
        return stock.size();
    }

    public void addItem(ICanSell item) {
        this.stock.add(item);
    }

    public void removeItem(ICanSell item) {
        this.stock.remove(item);
    }

    public double calculateProfit() {
        double totalProfit = 0;
        for (ICanSell item: stock) {
            totalProfit += item.calculateMarkUp();
        }
        return totalProfit;
    }
}
