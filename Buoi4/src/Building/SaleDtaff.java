package Building;

public class SaleDtaff extends Employee {
    private int numberOfSale;

    public SaleDtaff() {
        super();
    }

    public SaleDtaff(int id, String name, String country, double salary, int numberOfSale) {
        super(id, name, country, salary);
        this.numberOfSale = numberOfSale;
    }

    public int getNumberOfSale() {
        return numberOfSale;
    }

    public void setNumberOfSale(int numberOfSale) {
        this.numberOfSale = numberOfSale;
    }
}
