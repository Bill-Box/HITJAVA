import java.util.Scanner;

public class LopHIT {
    public static void main(String[] args) {
        float n;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Moi nhap n: ");
        n = sc.nextInt();
        if(n <= 3600 && n > 0){
           float a = n / 60 ;
           float b = n % 60;
            System.out.println("" + a + " phut va " + b + " giay");
        }
        else if (n <= 86400 && n > 3600){
            float c = n / 3600;
            float d = n / 3600;
            float e = d / 60;
            System.out.println("" + c + " tieng va " + e + " phut va " + d + "giay");
        }
    }
}
