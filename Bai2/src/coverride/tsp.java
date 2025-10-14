package coverride;

import java.util.ArrayList;
import java.util.Collections;

public class tsp {
    public static void main(String[] args) {
        ArrayList<Sanpham> sp = new ArrayList<>();
        Sanpham sp1 = new Sanpham(" Hhai1", 30);
        Sanpham sp2 = new Sanpham(" Khai2", 40);
        Sanpham sp3 = new Sanpham(" Ahai3", 10);
            sp.add(sp1);
            sp.add(sp2);
            sp.add(sp3);
        Collections.sort(sp);
        for (Sanpham  i : sp){
            System.out.println(i);
        }
        System.out.println(" sau sap xep: ");
        for (Sanpham i: sp){
            System.out.println(i);
        }

    }
}
