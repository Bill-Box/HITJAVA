import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Moi nhap n: ");
        n = sc.nextInt();
        if(n <= 3600 && n > 0){
            int a = n / 60 ;
            int b = n % 60;
            System.out.println("" + a + " phut va " + b + " giay");
        }
        else if (n <= 86400 && n > 3600){
            int c = n / 3600;
            int d = n % 3600;
            int e = d / 60;
            System.out.println("" + c + " tieng va " + e + " phut va " + d + "giay");
            System.out.println("ok");
        }
    }
}