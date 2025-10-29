package DongVat;

import java.util.UUID;

public class DongVat1 {
    private String name;
    private String id;
    private double balance;
    public DongVat1(){};

    public DongVat1(String name) {
        this.name = name;
    }

    public DongVat1(String name,  double balance) {
        this.name = name;
        this.balance = balance;
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit( double amuont){
        this.balance += amuont;
        System.out.println(" Ban da nap " + amuont + " vao tai khoan!");
    }
    public void withDraw( double amount){
        if(amount > getBalance()){
            System.out.println(" So Du Khong Du!");
        }
        else {
            this.balance -= amount;
            System.out.println("Ban da rut " + amount);
            System.out.println("So du con lai: " + this.balance);
        }
    }

    @Override
    public String toString() {
        return "DongVat1{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", balance=" + this.balance +
                '}';
    }

    public static void main(String[] args) {
        DongVat1 dv = new DongVat1("Lon", 0);
        dv.deposit(100);
        dv.withDraw(50);
        System.out.println(dv.toString());


    }
}
