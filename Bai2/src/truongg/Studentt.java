package truongg;

import javax.xml.namespace.QName;

public class Studentt extends Factuly {
    private String clas;
    private int poin;
    private Factuly y;

    public Studentt(String name, String date, Schooll x, String clas, int poin, Factuly y) {
        super(name, date, x);
        this.clas = clas;
        this.poin = poin;
        this.y =y;
    }

    @Override
    public String toString() {
        return  " lop " + clas + " Diem: " + poin + " .. " + y;
    }
}
