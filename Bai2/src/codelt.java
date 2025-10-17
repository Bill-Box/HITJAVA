import java.util.*;

public class codelt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println(" Nhap so n: " );
        int n = sc.nextInt();
        ArrayList<Integer> ls1 = new ArrayList<>(n);
        for ( int i = 0 ; i < n; i++){
            int c = rd.nextInt(50,100);
            ls1.add(c);
        }
        System.out.println(" Mang sau khi rd: " + ls1);
        int cout = 0;
        System.out.println(" Cac so < 80 Va vi tri: " );
        for ( int i = 0 ; i < n ; i++){
            if ( ls1.get(i) < 80){
                System.out.print(i + " ");
                cout++;
            }
        } System.out.println(" Nho < 80 : " + cout);

    }
}
