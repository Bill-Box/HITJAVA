import java.lang.invoke.StringConcatFactory;
import java.util.Calendar;

public class Hàm {
    public static void main(String[] args){
        int hieu = hieu(8,5);
        tong(7,8);
        System.out.println(hieu);
        gt("male");
        int a = 10;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(" c = " + c);
        }
        catch (ArithmeticException ex){
            System.out.println(" Co loi toan hoc!");
            ex.printStackTrace();
        }
        catch (Exception ex){
            System.out.println(" Da co loi!");
            ex.printStackTrace();
        }
        finally {
            System.out.println(" luon in ra man hinh");

        }
    }
    public static void tong(int x, int y){
        System.out.println(x + y);
    }
    public static int hieu(int x, int y){
    return x - y;
    }
    public static void gt( String gioitinh){
        if (gioitinh.equals("female"))
            System.out.println(" Toi la nv nu!");
        else if ( gioitinh.equals("male"))
            System.out.println(" Toi la nv nam!");
    }


}
