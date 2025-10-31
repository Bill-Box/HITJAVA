package Run;

import Constans.ConStans;
import domain.User;
import Constans.ConStans;

import GiveMoney.giveMoney;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Dung", 10.0);
        User user2 = new User("Duc", 10050.0);
        giveMoney gv = new giveMoney();
        gv.Chuyen(user1,user2, 500.0);

        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap mang: ");
        String value = sc.nextLine().trim();
        String[] avlaue = value.split("\\s+");
        Integer[] rvalue = new Integer[avlaue.length];
        System.out.print("Moi Nhap m: ");
        int m = sc.nextInt();
        for( int i = 0; i < avlaue.length; i++){
            rvalue[i] = Integer.parseInt(avlaue[i]);
        }
        int[] xuat = gv.Discuss(rvalue,m);
        int total= 0;
        System.out.println(" Gia tien:");
        for (int i = 0; i < rvalue.length; i++){
            System.out.println(rvalue[i] + " : " + xuat[i]);
            total+= xuat[i];
        }

        
    }
}