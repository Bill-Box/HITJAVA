
import com.sun.source.tree.WhileLoopTree;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
       /* System.out.println(" Bai 12: ");
        System.out.println("Moi nhap n:");
        int n = new Scanner(System.in).nextInt();
        System.out.println(" Su dung for:");
        int s = 1;
        for ( int i = 1; i <= n ; i++){
            s *= i;
        }
        System.out.println( " s = " + s);
        System.out.println("Su dung while:");
        int a = 1;
        int gt = 1;
        while(  a <= n){

            gt = gt*a;
            a++;
        }
        System.out.println(" a = " + gt);
        System.out.println(" Bai 13:");
        System.out.println(" Moi nhap not so x: ");
        int x = new Scanner(System.in).nextInt();
        if ( x % 2 == 0){
            int t = 0;
            for ( int i = 0; i <=x ; i++){
                if ( i % 2 == 0)
                    t += i;

            }
            System.out.println(" Tong Cac so chan tu 0 -> a : " + t);

        }
        else
            System.out.println(" khong so le!");
        System.out.println(" Bai 14:");
        System.out.println("Moi ban nhap mot so:");
        int x = new Scanner(System.in).nextInt();
        int t = 0;
        for ( int i = 1; i <= x; i++){
            if (i == 3)
                continue;
             if ( i % 2 != 0)
                t += i;
        }
        System.out.println(" Tong cac so le: " + t);
        System.out.println("Bai 15:");
        System.out.println(" Cac so chia het cho 3:");
        for ( int i = 10 ; i <=50 ; i++){
            if(i % 3 == 0)
                System.out.println(i);
            else continue;
        }
        System.out.println("Bai 16:");
        int t = 1;
        int s = 0;
        for ( int i = 1; i <= 10 ; i ++){
            System.out.println(t);
            t =  t*i;
            s = s + t;
        }
        System.out.println("Tong giai thua: " + s);
        System.out.println("Bai 17:");
        System.out.println(" Cac so hoan hao tu 1 -> 1000:");
        for ( int i = 1; i <= 1000; i++){
            int s = 0;
            for ( int j = 1; j < i; j++){

                if ( i % j == 0 ){
                    s += j;
                }
                else
                    continue;
            }
            if ( i == s)
                System.out.println(i);
        }
        System.out.println("Bai 18:");
        System.out.println(" So nguyen to nhap tu ban phim");
        int n = new Scanner(System.in).nextInt();
        int t = 0;
        for ( int i = 2; i < n ; i++){

            if ( n % i == 0){
                t++;
            }
        }
        if ( t > 0){
            System.out.println(" KLSNT " + n);
        }
        else if(t == 0){
            System.out.println( "SNT " + n) ;
        }
        System.out.print("Nhap n:");
        int n = new Scanner (System.in).nextInt();
        for ( int i = 1; i <= n; i++){
            for ( int j = 1 ; j <= n; j++){
                if ( j <=i){
                    System.out.print(i +""+ j + " ");

                }
                else
                    System.out.print("   ");
            }
            System.out.println("\n");
        }
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
            System.out.println(" c = " + c);
        }
        catch (ArithmeticException ex){
            System.out.println(" Co loi toan!!");
            ex.printStackTrace();
        }
        catch(Exception ex){
            System.out.println(" Co loi !!");
            ex.printStackTrace();
        }
        finally {
            System.out.println(" tiep tuc in!");
        }
        System.out.println(" code sau .....");
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONDAY);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(" Nam : " + nam);
        System.out.println(" thang : " + (thang + 1));
        System.out.println(" Ngay : "+ ngay);
        // ngay thang theo y muon
        cal.set(Calendar.YEAR,1989);
        cal.set(Calendar.MONDAY,10);
        cal.set(Calendar.DAY_OF_MONTH,24);
        int namsinh = cal.get(Calendar.YEAR);
        int thangs = cal.get(Calendar.MONDAY);
        int ngaysih = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(" Ngyay thang nam sinh: " + ngaysih + "/" + thangs + "/" + namsinh);
        SimpleDateFormat dinhdang = new SimpleDateFormat( "dd/MM/yyyy hh:mm:ss a");
        Date d = cal.getTime();
        String s = dinhdang.format(d);
        System.out.println(s);
        Calendar cal = Calendar.getInstance();
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        int thang = cal.get(Calendar.MONDAY);
        int nam = cal.get(Calendar.YEAR);
        SimpleDateFormat dinhdang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        Date d = cal.getTime();
        String s = dinhdang.format(d);
        System.out.println(s);


        // nhap chuoi ngay thang
        Scanner sc = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        Random rd = new Random();
        int ngay = rd.nextInt(0,30);
        int thang = rd.nextInt(1,12);
        int nam = rd.nextInt(1990, 2025);
        SimpleDateFormat dinhdang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        Date d = cal.getTime();
        String s =dinhdang.format(d);
        System.out.println(" Ngay thang nam ngua nhien: " + s);
        System.out.print("Moi ban nhap kys tu bk: ");
        String input = sc.nextLine();
        char a =input.charAt(0);
        System.out.println(" So a: " + a);
        System.out.println("Check a:");
        System.out.println(Character.isLetter(a));
        System.out.println(Character.isWhitespace(a));
        System.out.println(Character.isLowerCase(a));
        System.out.println(Character.isUpperCase(a));
        System.out.println(Character.isDigit(a));
        StringBuffer sb = new StringBuffer();
        // dung apppend ghi vao cuoi dong
        sb.append("Hello Ban");
        sb.append(" Nha !");
        System.out.println(sb);
        // dung insert de ghi chen
        // vi tri 0 can chen
        sb.insert(0, " Holle ");
        System.out.println(sb);
        // dung delete de xoa chu mik muon
        // xoa tu vi tri 0 den 7
        sb.delete(0,7);
        System.out.println(sb);
        System.out.println(" Do dai chuoi la: " + sb.length());
        System.out.println(" Ket qua ss: " + Character.compare('a', 'A'));*/

        // kiem tra tap con
       /* String s1 = " Hello e";
        String s2 = " Hello";
        boolean check =s1.contains(s2);
        if (check == true){
            System.out.println("  S1 chua S2");
        }
        else
            System.out.println("S1 khong chua S2");
        // xac dinh vi tri chu trong chuoi:
        // neu co thi in ra vi tri, lo thif in ra -1
        System.out.print(" Vi tri chu He: ");
        System.out.println(s1.indexOf("He"));
        System.out.print("Vi tri chu e: ");
        System.out.println(s1.lastIndexOf("e"));
        // lay so ky tu tu 1 chuoi tu 1 vi tri
        String s3 = " haillo ban!";
        String s4 = s3.substring(6);
        System.out.println(" chuoi s3: " + s3);
        System.out.println(" chuoi s4: " + s4);
        // trim xoa khonag trong truoc va sau trong chuôi
        String s5 = "    Toi la trai dep     ";
        String s6 =s5.trim();
        String s7 = s5.replaceAll("\\s+$","");
        String s8 = s5.replaceFirst("\\^s+","");
        System.out.println(" Chuoi cu: " + s5);
        System.out.println("CHuoio xoa mot ben: " + s7);
        System.out.println(" xoa o truoc: " + s8);
        System.out.println(" CHuoi moi: " + s6);
        String s10 = "      to la luong     ";
        while(s10.endsWith("")){
            s10 = s10.substring(0,s10.length()-1);
        }
        System.out.println("chuoi 10: "+ s10);*/




    }
}
/*import java.util.Scanner;
String = sc = new Scanner(System.in).nextLine();
import java.util.Scanner;
String sc= new Scanner(System.in).nextLine();*/
