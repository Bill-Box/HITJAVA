package Enum;

import java.util.ArrayList;

public class teste {
    public static void main(String[] args) {
        ArrayList<testenum> sv = new ArrayList<>();
        testenum sv1 = new testenum("Dung", 18, 9);
        testenum sv2 = new testenum("Long", 19, 7);
        testenum sv3 = new testenum("Quang", 20, 4);
        sv.add(sv1);
        sv.add(sv2);
        sv.add(sv3);
        for (  testenum stt : sv ){
            System.out.println(stt);
        }
    }
}
