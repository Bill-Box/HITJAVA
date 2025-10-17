package Enum;

public class testenum {
    private String name;
    private int age;
    private int poin;
    private Newenum loai;
    public testenum(String name, int age, int poin){
        this.name = name;
        this.age = age;
        this.poin = poin;
        this.loai = getLoai();
    }
    public Newenum getLoai(){
        if(this.poin > 8) {
            loai = Newenum.Gioi;
        } else if (this.poin > 7) {
            loai = Newenum.Kha;
        } else if (this.poin > 4 ) {
            loai = Newenum.Tb;
        }
        else {
            loai = Newenum.Yeu;
        }
        return loai;

    }
    public  String toString(){
        return name + " " + age + " tuoi loai: " + this.loai;
    }

}
