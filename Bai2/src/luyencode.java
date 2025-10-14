import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
public class luyencode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Moi nhap b: ");
       int b = sc.nextInt();
        int[] a = new int[5] ;
        System.out.println("Moi nhap mang A:");
        for ( int i = 0 ; i < b ; i ++){
            a[i] = sc.nextInt();
        }
        System.out.println( " Chuoi sau khi nhap:");
        for ( int i = 0; i < b; i ++){
            System.out.print(a[i] + " ");
    }*/
        //Bai 2:
        /*System.out.println(" Bang cuu chuong: ");
        int t = 0;
        while(t <= 5){
            t++;
            if ( t >=6)
                break;
            else {
                System.out.println(" Bang " + t);
                for (int i = 1; i <= b; i++) {
                    System.out.println(t + " * " + i + " = " + (t * i));
                }
            }
        }*/
        // Bai 3:sv
        /*System.out.println(" Moi nhap so luong sv: ");
        int n = sc.nextInt();
        sc.nextLine();
        Student  [] sl = new Student[n];
        for (int i =0 ; i < n; i ++){
            sl[i] = new Student();
            System.out.println(" Sinh vien thu " + ( i + 1) + ":");
            System.out.print(" Ten: ");
            sl[i].name = sc.nextLine();
            System.out.print("Age: ");
            sl[i].age = sc.nextInt();
            System.out.print(" Weight: ");
            sl[i].weight= sc.nextInt();
            sc.nextLine();
        }
        sc.close();;*/
        // Bai 4:
        /*String ch = " D:Luonglailaptrinh/music/remix.mp3";
        System.out.println(" Ban dau: " + ch);
        int ch1 = ch.lastIndexOf("/");
        String filename = ch.substring(ch1 + 1);

        System.out.println(" Tach: " + filename);
        int index2 = filename.lastIndexOf(".");
        String name = filename.substring(0, index2);
        System.out.println(" Tach name: " + name);*/
        // Bai 5;
        /*System.out.println(" Moi ban nhap chuoi: ");
        String ch = sc.nextLine();
        String[] ch1 = ch.split("");
        String newc = "";
        for(int i = ch.length() - 1; i >= 0; i--){
            char c = ch.charAt(i);
            newc += c;
        }
        System.out.println(" Chuoi moi: " + newc);
        if(ch.equalsIgnoreCase(newc))
            System.out.println(" La chuoi canas");
        else
            System.out.println(" Khong la chuoia cacns");
        /*int check =ch.compareTo(newc);
        if ( check == 0){
            System.out.println(" Hia chuoi giong nhua:");
        }
        else System.out.println(" khac nhua");*/
        /*String chd = new StringBuilder(ch).reverse().toString();
        if(ch.equalsIgnoreCase(chd))
            System.out.println("chuoi paraco");
        else
            System.out.println(" Khong phai chuoi paraco");*/

        // Bai 6:
        /*String ch = "        toi dang lap    trinh     ";
        System.out.println(" Chuoi ban dua: " + ch);
        String ch1 =ch.trim();
        System.out.println(" Chuoi sau sua: " + ch1);
        String [] ch2 = ch1.split("\\s+");
        for ( int i = 0; i < ch2.length; i++){
            ch2[i]= ch2[i].toLowerCase();
            String cn = ch2[i].substring(0,1);
            cn = cn.toUpperCase();
            ch2[i] = cn + ch2[i].substring(1);
        }
        System.out.println(" Chuoi HT: " + String.join(" ", ch2));*/

        // Bai 7:
        /*System.out.print(" Nhap n: ");
        int n = sc.nextInt();
        sc.nextLine();
        String [] mang = new String[n];
        System.out.println("Nhap Mang: ");
        for ( int i =0 ; i < mang.length; i++){
            mang[i]= sc.nextLine();
        }
        System.out.println(" Mang sau khi nhap: ");
        for ( String i: mang){
            System.out.println(i + " ");
        }
        int[] a = new int []{ 2,3,1,6,9,7,4,8};
        Arrays.sort(a);
        System.out.println(" Mang sau sap xep: ");
        for ( int i = 0; i < a.length; i++){
            System.out.println(a[i] + " ");
        }
        for ( int i = 0, j = a.length - 1;i < j; i ++, j --){
            int tm = a[i];
            a[i] = a[j];
            a[j] = tm;
        }
        System.out.println(" Mang dao ngc: ");
        for ( int i = 0; i < a.length - 1; i++){
            System.out.print( a[i] + " ");
        }
        System.out.println(" Nhap x: ");
        int x = sc.nextInt();
        int vitri = 0;
        boolean check = false;
        for ( int i = 0; i < 8; i++){
            if ( a[i] == x) {
                vitri += i;
                check = true;
            }


        }
        if ( check == true) {
            System.out.println(" Co vi tri trong mang: ");
            System.out.println(" so " + x + " co vi tri trog mang la " + vitri);
        }
        else
        System.out.println("Khong co trong mang!");*/
        /*System.out.println(" Moi ban nhap MK: ");
        while (true){
            String n = sc.nextLine();
            if(Check(n)) {
                System.out.println(" MK hop le: " + n);
                break;
            }
            else
                System.out.println(" MK ko hop le!");

        }*/
        //Hashmap
        HashMap <String, String> uses = new HashMap<>();
        uses.put("Hello", "12345");
        uses.put("Ho", "6789");
        uses.put("abc", "23425");
        uses.put("abcd", "2523");
        System.out.print(" Moi nhap Usingname: ");
        String ten = sc.nextLine();
        System.out.print("Nhap Passwork: ");
        String pass = sc.nextLine();
        if(!uses.containsKey(ten)){
            System.out.println(" Use khong ton tai!");
        }
        else if (!uses.get(ten).equals(pass)) {
            System.out.println(" Sai MK!!");

        }
        else {
            System.out.println(" Dang nhap Thanh Cong!");
        }

    }
    static  boolean Check( String passwork){
        if (passwork.length() < 6)
            return false;
        boolean hasdigit = false;
        for ( int i = 0; i < passwork.length(); i++){
            char c = passwork.charAt(i);
            if (Character.isDigit(c)){
                hasdigit = true;
            }
        }
        if (!hasdigit)
            return false;
        boolean hasLetter = false;
        for (  int i = 0; i < passwork.length(); i++) {
            char c = passwork.charAt(i);
            if (Character.isLetter(c)) {
                hasLetter = true;
            }
        }
        if(!hasLetter)
            return false;
        return true;
    }
}
