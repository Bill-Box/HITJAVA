import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Buoi3 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        /*int a = rd.nextInt(0, 100);
        int b = rd.nextInt(0,100);
        int c = rd.nextInt(0,200);
        System.out.println(" Moi ban du doan dap an dung or sai: ");
        System.out.println( a + " + " + b + " = " + c );
        System.out.print(" Cau tra loi: ");
        String tl = sc.nextLine();
        int s = a + b;
        if( s == c){
            if(tl.equals("Dung"))
                System.out.println(" Cau tra loi cua ban Dung!");
            else if ( tl.equals("Sai"))
                System.out.println(" Cau tra loi cau ban Sai!");
        }
        if( s != c){
            if(tl.equals("Dung"))
                System.out.println(" Cau tra loi cua ban Sai!");
            else if ( tl.equals("Sai"))
                System.out.println(" CAau tra loi cau ban Dung!");
        }
        System.out.println(" Dap an a + b = " + s);*/
       /* System.out.print(" Moi nhap n: ");
        int n = sc.nextInt();
        System.out.println(" De quy: ");
        fbrc(n);

    }
    public static void fbrc(int n){
        if( n > 0)
        {
            System.out.println(n + " ");
             fbrc((n - 1));

        }

    }*/ Scanner sc = new Scanner(System.in);
        System.out.println(" Moi nap chuoi: ");
        String chuoi = sc.nextLine();
        Check(chuoi);

        }
    public static void Check( String chuoi){
        StringBuilder sbd = new StringBuilder(chuoi);
        String dao = sbd.reverse().toString();
        System.out.println(" Chuoi ban dau: " + chuoi);
        System.out.println(" Chuoi dao: " + dao);
        String nn = "";
        String mm = "";
            if ( chuoi.equals(dao)){
                System.out.println(" Doi xung!");
                for ( char i : chuoi.toCharArray()){
                    char hoa = Character.toUpperCase(i);
                    nn += hoa;
                }
                System.out.println(" Chuoi hoa: " + nn);
            }
            else {
                for ( char i : chuoi.toCharArray()){
                    char hao = Character.toLowerCase(i);
                    mm += hao;
                }
                System.out.println(" Chuoi thuong: " + mm);
            }
            String ss = "abcdgh";
        System.out.println(" CHuoi trc khi dao ngc: " + ss);
            char[] list = ss.toCharArray();
        for ( int i = 0, j = list.length - 1; i < j ; i++, j--){
            char st = list[i];
            list[i] = list[j];
            list[j] = st;
        }
        StringBuilder newlist = new StringBuilder();
        for ( int i = 0; i < list.length - 1; i++){
            newlist.append(list[i]);
        }
        System.out.println(" CHuoi ss sau dao ngc: " + newlist);
    }
}

