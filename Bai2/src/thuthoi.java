import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class thuthoi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add(2,"c");
        for(String i: list){
            System.out.println(i);
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Hello");
        sb.append("Chao");
        sb.charAt(0);
        int a = sb.compareTo(sb1);
        sb1.delete(4,5);
        String nc = sb.substring(2,4);
        System.out.println(" Sau dele: " + sb1);
        boolean c = sb1.equals(sb);
        System.out.println(sb.toString());
        System.out.println("Check " + a + " " + c);
        System.out.println(" Chuoi new: " + nc);
        List<Listt> L = new ArrayList<>();
        Node P;
        P = new Node();
        SinhVienIT elem = new SinhVienIT("TRuong", 18);
        elem.name = " Truong";
        elem.age = 18;
        P.infor = elem;

       // if(!L.isEmpty()){
           // P.next = L.;
        //}
       // L = P;

    }

}
class SinhVienIT{
    public String name;
    public int age;
    SinhVienIT(String name, int age){
        this.name =name;
        this.age= age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
 class Listt{
    int cout;
    SinhVienIT e;
    Listt(int cout, SinhVienIT e){
        this.cout = cout;
        SinhVienIT e1 = this.e;
        this.e = e;
    }
     public int empty(Listt L){
         return L.cout = -1;
     }
     public int full(Listt L){
         return L.cout = L.cout - 1;
     }
}
class Node{
    SinhVienIT infor;
    Node next;
}




