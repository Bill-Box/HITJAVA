package domain;

import Constans.ConStans;

import java.util.UUID;


public class User {
    private String name;
    private double balane;
    private String id;
    public User(){ };

    public User(String name, double balane) {
        this.name = name;
        this.balane = balane;
        this.id= UUID.randomUUID().toString();
    }
    public  void deposi(double amount){
        this.balane += amount;
        System.out.println(ConStans.Succesful.Give_Money + ": " + amount) ;
    }

    public void withDraw(double amount){
        if( amount > this.balane){
            System.out.println(ConStans.Warring.isValid_Accout);
        }
        else {
            this.balane -= amount;
            System.out.println(ConStans.Succesful.Out_Money + ": " + amount) ;
            return;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double balane) {
        this.balane  = balane;
    }

    public String getName() {
        return name;
    }

    public double getBalane() {
        return balane;
    }


}
