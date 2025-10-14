package Chung;

import java.util.ArrayList;

public class run {
    public static void main(String[] args) {
        System.out.println(SV.gioi.ordinal());
        ArrayList<svn> sv = new ArrayList<>();
        svn sv1 = new svn(1,"cuong", 9);
        svn sv2 = new svn(2, "Dung", 9);
        svn sv3 = new svn(3, "Hoang", 6);
        sv.add(sv1);
        sv.add(sv2);
        sv.add(sv3);

        for (svn i : sv ){
            System.out.println(i);
        }
    }
}
