import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Sellable> stock;
    private double totalSales;

    public Shop(String name, ArrayList<Sellable> stock, double totalSales) {
        this.name = name;
        this.stock = stock;
        this.totalSales = totalSales;
    }

    public String getName() {
        return name;
    }

    public double getTotalSales() {
        return totalSales;
    }
}