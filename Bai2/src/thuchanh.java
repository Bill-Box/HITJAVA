import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Date;

public class thuchanh  {
    public int Max(int a, int b){
        if(a > b) return a;
        else return b;
    }
    public int giaithua( int n){
        int gt = 1;
        if( n < 0) return -1;
        else {
            gt *= n;
            return gt * (n - 1);
        }
    }
}
class chay{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime ngay = LocalDateTime.now();
        System.out.println(" Ngay now: " + ngay.format(DF));
        thuchanh th = new thuchanh();
        int c = th.Max(4,5);
        System.out.println(" Max = " + c);
        int nn = th.giaithua(3);
        System.out.println(" GT : " + nn);
    }
}
