public class Product {
    private  String id;
    private String name;
    private double price;
   private String cateryId;

    public Product(String id, String name, double price, String cateryId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.cateryId = cateryId;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCateryId() {
        return cateryId;
    }

    public void setCateryId(String cateryId) {
        this.cateryId = cateryId;
    }
}
