package oppxlclass;

import java.util.ArrayList;

public class testsp {
    public static void main(String[] args) {
        ArrayList<Sieupham> spp = new ArrayList<>();
        Sieupham sp1  = new Sieupham("Dau GOi Dau ", 01, 200);
        Sieupham sp2  = new Sieupham("Dau Tam Sua ", 02, 150);
        Sieupham sp3  = new Sieupham("Dau Body ", 03, 250);
        spp.add(sp1);
        spp.add(sp2);
        spp.add(sp3);
        for ( Sieupham xsp : spp){
            System.out.println(xsp);
        }
    }
}
