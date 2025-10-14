package oppxlclass;

public class Sieupham implements  Comparable<Sieupham>{
    private  String name;
    private int ma;
    private int gia;
    public Sieupham(String name, int ma, int gia){
        this.name = name;
        this.ma = ma;
         this.gia = gia;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getName() {
        return name;
    }

    public int getMa() {
        return ma;
    }

    public int getGia() {
        return gia;
    }
    public String toString(){
        return name + " ma " + " gia: " + gia;
    }

    @Override
    public int compareTo(Sieupham o) {
        return this.name.compareToIgnoreCase(o.name);
    }
}
