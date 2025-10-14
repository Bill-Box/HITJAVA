import java.util.Comparator;
import java.util.Scanner;
public class chuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.println(" Moi ban nhap chu can dem: ");
        String d = sc.nextLine();
        int sum = 0;
        String s1 = " Toi ko biet Toi dang lam gi! Toi ko bt nx !";
        String[] ch =s1.split(" ");
        for ( String p: ch){
            System.out.println(p);
           boolean r = d.equals(p);
            if( r ){
                sum++;
            }
            else continue;
        }
        System.out.println(" Ky tu " + d + " Lap lai " + sum);*/
        System.out.println(" Moi ban nhap vao mot chuoi: ");
        String ch = sc.nextLine();
        StringBuilder c1 = new StringBuilder();
        StringBuilder c2 = new StringBuilder();
        String[] th = ch.split("");
        for ( int i = 0; i < ch.length(); i++){
            char c = ch.charAt(i);
            if(Character.isDigit(c)){
                c1.append(c);
            }
            if (Character.isLetter(c)){
                c2.append(c);
            }
        }

        System.out.println(" Hai chuoi sau tach: ");
        System.out.println(" Chuoi 1 : " + c1);
        System.out.println(" Chuoi 2 : "+ c2);
    }
}
