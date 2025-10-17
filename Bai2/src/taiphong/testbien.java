package taiphong;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testbien {
    public static void main(String[] args) {
        bien2[] b = new bien2[3];
        Scanner sc = new Scanner(System.in);
        System.out.println(" Moi nhap thong tin:");
        for (int i = 0; i < b.length; i++){
            System.out.println(" Thong tin people " + i + ":");
            b[i] = new bien2("", 0, 0);
            System.out.print("Ten: ");
            b[i].setName(sc.nextLine()) ;
            System.out.print("Tuoi: ");
            b[i].setAge(sc.nextInt()) ;
            sc.nextLine();
            System.out.print(" Ma sv: ");
            b[i].setMasv(sc.nextInt()) ;
            sc.nextLine();
        }
        System.out.println(" Thong tin sv :");
        for(bien2 i: b){
            System.out.println(i);
        }

    }
}
