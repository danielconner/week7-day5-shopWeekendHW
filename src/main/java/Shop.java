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

    public int stockSize(){
        return this.stock.size();
    }

    public void addStock(Sellable item){
        this.stock.add(item);
    }

    public void removeStock(Sellable item){
        this.stock.remove(item);
    }

    public double totalProfitStockValue(ArrayList<Sellable> stock){
        double totalMarkup = 0;
        for (Sellable items : stock ){
           totalMarkup += (items.calculateMarkup());
        }
        return totalMarkup;
    }

    public double addToTotalSales(double saleprice){
        return this.totalSales + saleprice;
    }

}