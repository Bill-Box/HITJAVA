package company;

import java.io.LineNumberReader;

public abstract class ketoan {
    protected String name;
    protected int age;
    protected int ma;
    protected double sala = 850;
    public ketoan(String name, int age, int ma){
        this.name = name;
        this.age= age;
        this.ma = ma;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setma(int ma){
        this.ma = ma;
    }
    public String getName(){
        return name;
    }
    public  int getage(){
        return age;
    }
    public double getma(){
        return  ma;
    }
    // khong co phan than va ko khoi tao new (abstruct)
    public abstract double salary();
    public void hht(){
        System.out.println("Ten: " + name + " " + age + " Ma sv: " + ma);
    }

}
