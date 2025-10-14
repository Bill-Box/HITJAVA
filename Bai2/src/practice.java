import java.util.Calendar;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println(" Moi nhap MK:");
            String a = sc.nextLine();
            if (Check(a) ) {
                System.out.println(" Dang nhap Thanh Cong! MK : " + a);
                break;
            }
            else if (!Check(a))
                System.out.println("Moi ban nhap lai MK:");
        }
    }
    public static boolean Check( String passwork){
        if (passwork.length() < 6 )
            return false;
        boolean hasgit = false;
        for ( char c: passwork.toCharArray() ){
           if(Character.isDigit(c)){
               hasgit = true;
               break;
            }
        }
        if(!hasgit)
            return false;
        boolean hasletter = false;
        for ( char c: passwork.toCharArray() ){
            if(Character.isLetter(c)){
                hasletter = true;
                break;
            }
        }
        if(!hasletter)
            return false;
        return true;
    }
}

