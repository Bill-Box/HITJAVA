import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        int ngay = cal.get(Calendar.MONDAY);
        int thang = cal.get(Calendar.DAY_OF_MONTH);
        int nam = cal.get(Calendar.YEAR);
        System.out.println(" Ngay " + ngay + "/" + thang + "/" + nam);
        SimpleDateFormat dinhdang =  new SimpleDateFormat(" dd/MM/yyyy hh/mm/ss a");
        Date tg = cal.getTime();
        String time = dinhdang.format(tg);
        System.out.println(" Ngay thang hien tai: \n" + time);
    }
}
