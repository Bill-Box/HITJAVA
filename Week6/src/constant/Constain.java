package constant;

import model.Animal;
import servicee.IAnimalService;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Constain {
    public void Menu(){
        System.out.println(" ---Menu --- ");
        System.out.println("1. Các con vật có thể bơi\n" +
        "2. Các con vật có thể bay\n" +
        "3. Xóa con vật có thể bơi\n" +
        "4. Xóa con vật vừa có thể bơi vừa có thể bay\n");
        System.out.print("Chon: ");
        IAnimalService ia = new IAnimalService();
        Scanner sc = new Scanner(System.in);
        Constain cs = new Constain();
        int choice = sc.nextInt();
        switch (choice){
            case 1:{
                System.out.println("Các con vật có thể bơi:\n");
                System.out.println(ia.animalsSwimmable(ia.animals));
                break;
            }
            case 2:{
                System.out.println("Các con vật có thể bay:\n");
                System.out.println(ia.animalsFlyable(ia.animals));
                break;
            }
            case 3:{
                System.out.println("Xóa con vật có thể bơi\n");
                if(ia.deteleAnimalsSwimmable(ia.animals)){
                    System.out.println(ia.animals.toString());
                }
                System.out.println("Xoa Thanh Cong!");
                break;
            }
            case 4:{
                System.out.println("Xóa con vật vừa có thể bơi vừa có thể bay\n");
                if(ia.deleteAnimalsSwimmableAndFlyable(ia.animals)){
                    System.out.println(ia.animals.toString());
                }
                System.out.println("Xoa Thanh Cong!");
                break;
            }
            default:
                System.out.println("Loi Truy Cap!");
        }
    }
}
