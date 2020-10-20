public class Product {
    private String name;
    private String description;
    private double priceNetto;
    private int category;


    public Product(String name, String description, double priceNetto, int category) {
        this.name = name;
        this.description = description;
        this.priceNetto = priceNetto;
        this.category = category;
    }


    public double getPriceNetto() {
        return priceNetto;
    }

    public int getCategory() {
        return category;
    }
}
