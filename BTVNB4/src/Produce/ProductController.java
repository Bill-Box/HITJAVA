package Produce;

import Constain.ConStain;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController extends Produces  {
    public ArrayList<Produces> pr;
    public ProductController(){
        pr = new ArrayList<>();
        pr.add(new Laptop(1, "Asus", "Laptop OLED", 17000, "16GB", "i5"));
        pr.add(new SmartPhone(2, "Samsung", "Galaxy S23", 13000, true));
    }
    public void add(Produces produces){
        pr.add(produces);
    }
    public static  ConStain cs = new ConStain();
    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Them san pham:\n" +
                "Chon 1 de them laptop. \n" +
                "Chon 2 de them SamrePhone.\n" +
                "Chon: ");
        int type = sc.nextInt();
        sc.nextLine();
        switch (type) {
            case 1: {
                System.out.println("Moi thong tin laptop:");
                System.out.print("ID: ");
                int id = sc.nextInt();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Decription: ");
                String decription = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Ram: ");
                String ram = sc.nextLine();
                System.out.print("CPU: ");
                String cpu = sc.nextLine();
                pr.add(new Laptop(id,name, decription, price, ram, cpu));
                break;
            }
            case 2 :{
                System.out.println("Moi nhap thong tin SmartPhone!");
                System.out.print("ID: ");
                int id = sc.nextInt();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Decription: ");
                String decription = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("5G SmatrPhone: ");
                boolean has5G = sc.nextBoolean();
                pr.add(new SmartPhone(id,name, decription, price, has5G));
                break;
            }
            default:
                System.out.println(cs.W_Common);
        }
    }
    public void remove(String  id){
        id = null;
    }
    public void getById(int id){
        boolean fout = false;
        for(int i = 0; i < pr.size(); i++){
            if(pr.get(i).getId() == id) {
                pr.get(i).getInfo();
                fout = true;
                break;
            }

        }if(!fout) System.out.println(cs.W_OutPut);

    }
    public  void getAllProduces() {
        for(int i = 0; i < pr.size(); i++){
            pr.get(i).getInfo();
        }
    }
}
