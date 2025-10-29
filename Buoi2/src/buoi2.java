import java.util.Scanner;

public class buoi2 {
    public  static Scanner sc = new Scanner(System.in);
    public static void input(int[] a, int n){

        for( int i  =0; i < n; i++){
            a[i] = sc.nextInt();
        }

    }
    public  static void total( int[] a , int n){
        int sum = 0;
        for( int i  =0; i < n; i++){
            sum += a[i];
        }
        System.out.println("Tong: " + sum);

    }
    public static void sx(int[] a, int n){
        for( int i  =0; i < n - 1; i++){
            for(int j = i+1 ; j < n ; j++){
                if(a[i] > a[j]){
                    int tm = a[i];
                    a[i] = a[j];
                    a[j] = tm;
                }
            }
        }
        System.out.println("Chieu tang dan:");
        for( int i  =0; i < n; i++){
            System.out.println("a[" + i +"]= " + a[i] );
        }
        System.out.println("Ptu max: " + a[n -1]);
        System.out.println("Ptu min: " + a[0]);
        int maxnt = -1;
        for( int i  =0; i < n ; i++){
            for(int j = 2; j < a[i]; j++){
                if(a[i] % j == 0 ){
                    continue;
                }
                else if(maxnt < a[i]) {
                    maxnt = a[i];
                }
            }
        }
        if(maxnt == -1){
            System.out.println(" Khong co! " );
        }
        else System.out.println(" So nguyen max to: " + maxnt);

    }

    public static void main(String[] args) {
        int n;
        do{
            System.out.print("Nhap n: ");
            n = sc.nextInt();
            if ( n < 0) System.out.println("Moi nhap lai n: ");

        }while (n < 0);
        int[] a = new int[100];
        input(a,n);
        total(a,n);
        sx(a,n);
    }
}
