import java.util.HashMap;

public class Bai29 {
    public static void main(String[] args) {
        HashMap< Integer, String> hs = new HashMap<>();
        HashMap< Integer, String> hs1 = new HashMap<>();
        hs.put(1,"DUng");
        hs.put(2,"Manh");
        hs.put(3,"Thang");
        System.out.println(hs.get(1));
        boolean check = hs.containsKey(1);
        boolean chek = hs.containsValue("Manh");
        System.out.println(check);
        System.out.println(chek);
        hs.remove(2);
        System.out.println(hs.get(2));
    }
}
