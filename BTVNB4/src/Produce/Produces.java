package Produce;
import java.util.ArrayList;
import java.util.UUID;

public class Produces {
    private String id;
    private String name;
    private String description;
    private double price;

    public Produces() {
        super();
    }

    public Produces( String name, String description, double price) {
        this.id =UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void getInfo(){
        System.out.println("Produces{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}' );
    }


}
