package sample;

public class Product {

    public Product(String name, Double price, String currency) {

        this.currency = currency;

        this.name = name;

        this.price = price;
    }

    private String currency;

    private String name;

    private Double price;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
