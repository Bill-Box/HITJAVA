import java.text.SimpleDateFormat;
import com.sun.source.tree.WhileLoopTree;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/*public class biscu {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("c = " + c);
        } catch (ArithmeticException ex) {
            System.out.println(" Loi toan hoc!");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println(" Loi khc toan hoc!");
            ex.printStackTrace();
        } finally {
            System.out.println(" Dap an cua c....");
        }

        System.out.println(" Ban la ai?");
        String gt = "nam";
        if (gt.equals("nam"))
            System.out.println("Toi la nam!");
        else if (gt.equals("nu")) {
            System.out.println(" Toi la nu!");
        }
        System.out.println(" Moi ban nhap ky tu:");
        Scanner sc = new Scanner(System.in);
        String kytu = sc.nextLine();
        char n = kytu.charAt(0);
        System.out.println(n);
        System.out.println(" Kiem tra ky tu: ");
        System.out.println(Character.isDigit(n));
        System.out.println(Character.isLowerCase(n));
        System.out.println(Character.isUpperCase(n));
        System.out.println(Character.isWhitespace(n));
        System.out.println(Character.isLetter(n));

        String s1 = "             Toi la nguoi viet     ";
        System.out.println(s1);
        String s2 = " Toi la ai cung duoc ";
        StringBuffer sb = new StringBuffer();
        sb.append(" Helllo");
        sb.append("Ban nhe!");
        System.out.println(sb);
        sb.insert(15, " ola alo?");
        System.out.println(sb);
        sb.delete(15, 24);
        System.out.println(sb);
        boolean check = s1.contains(s2);
        if (check == true)
            System.out.println("S1 chua s2");
        else
            System.out.println(" S1 ko chua s2!");
        System.out.println(" S1 sau xoa cach");
        System.out.println(s1.trim());
        Calendar cal = Calendar.getInstance();
        Random rd = new Random();
        int ngayy = rd.nextInt(1, 30);
        int thangg = rd.nextInt(1, 12);
        int namm = rd.nextInt(1990, 2026);
        System.out.println(" Ngay thang sau khi random: " + ngayy + "/" + thangg + "/" + namm);
        SimpleDateFormat dinhdang = new SimpleDateFormat(" dd/MM/yyyy hh:mm:ss a");
        Date d = cal.getTime();
        String tg = dinhdang.format(d);
        System.out.println(" Ngay thang nam: ");
        System.out.println(tg);
        int t = 0;
        int cout = 0;
        String ss = " Toan = 24 Tieng aanh = 24 Van = 68 ";
        String[] parts = ss.split(" ");
        for (String pt : parts) {
            System.out.println(pt);
            try {
                int num = Integer.parseInt(pt);
                t += num;
                cout++;
            } catch (NumberFormatException e) {
                // bo qua
            }
        }
        double K = (double) (t / cout);
        System.out.println(" Tb = " + K);
        String pw ="";
        while(true){
            System.out.println("Moi nhap mk 6 ky tu:");
            String Newpassword = sc.nextLine();
            if(checkMk(Newpassword)){
                System.out.println("Mk da dc thiet lap:" + Newpassword);
                break;
            }

            else
                System.out.println(" Mk ko hop le!");
            `
        }
    }
    public static boolean checkMk(String password){
        if(password.length() < 6){
            return false;
        }
        boolean hasletter = false;
        for (char c :password.toCharArray()){
            if (Character.isLetter(c)) {
                hasletter = true;
                break;

            }
        }
        if (!hasletter)
            return false;
        boolean hasDigit = false;
        for (char d:password.toCharArray()) {
            if (Character.isDigit(d)) {
                hasDigit = true;
                break;
            }
        }
        if(!hasDigit)
            return false;
        return true;
        }


}*/
public class biscu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S1 = " Toan = 10  Tieng Anh = 20 Van = 30";
        String[] st = S1.split(" ");
        int sum = 0;
        int cout = 0;
        for (String p:st ){
            try{
                int c =Integer.parseInt(p);
                sum += c;
                cout++;
            }
            catch (NumberFormatException e){
                //sss
            }
        }
        System.out.print(" TB cong cac mon :" );
        double g = (double)(sum / cout);
        System.out.println(" TBC = " + g);
        System.out.println(" Moi ban nhap MK:");
        while(true){
            String MK = sc.nextLine();
            if(Check(MK)){
                System.out.println(" MK hop le: " + MK);
                break;
            }
            else
                System.out.println(" MK KO Hop Le!");

        }
        String s1 = "qwertyuiop";
        String s2 = "asdfghjklz";
        String output = "";
        System.out.println(" Moi ban nhap vao can ma hoa: ");
        String input = sc.nextLine();
        for (int i = 0; i <input.length();i++ ){
            char c = input.charAt(i);
            int index = s1.indexOf(c);
            if (index == -1){
                output += c;
            }
            else
            {
                output +=s2.charAt(index);
            }
        }
        System.out.println(" Sau khi ma hoa: " + output);


    }
    public static boolean Check( String Passwork){
        if ( Passwork.length() < 6){
            return false;
        }
        boolean hasDigit = false;
        for ( char i:Passwork.toCharArray()){
            if(Character.isDigit(i)){
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit){
            return false;
        }
        boolean hasLetter = false;
        for ( char d:Passwork.toCharArray()){
            if (Character.isLetter(d)){
                hasLetter = true;
                break;
            }
        }
        if ( !hasLetter){
            return false;
        }
        return  true;
    }
}


