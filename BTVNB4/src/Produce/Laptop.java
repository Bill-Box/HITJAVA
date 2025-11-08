package Produce;

import java.util.ArrayList;

public class Laptop extends  Produces {
    private String ram;
    private  String cpu;

    public Laptop(String ram, String cpu) {
        this.ram = ram;
        this.cpu = cpu;
    }

    public Laptop(int id,String name, String description, double price, String ram, String cpu) {
        super(id, name, description, price);
        this.ram = ram;
        this.cpu = cpu;
    }

    public Laptop(int id, String name, String description, double price) {
        super(id, name, description, price);

    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(" Ram: " + this.ram + " CPU: " + this.cpu);
    }

}
