package Produce;
import java.util.ArrayList;

public class Produces {
    private int id;
    private String name;
    private String description;
    private double price;

    public Produces() {
        super();
    }

    public Produces(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
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
        System.out.println("Produces " +
                "ID = " + id + " " +
                ", name= " + name + " " +
                ", description= " + description +" " +
                ", price= " + price
                 );
    }


}
