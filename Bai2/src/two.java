public class two {
    public static void main(String[] args) {
        sv sv1 = new sv();
        System.out.println(sv1.ol(2,4));
        sv sv2 = new sv();
        System.out.println(sv2.ol(3,5,7));
        sv sv3 = new sv();
        double t = sv3.rd(2,3,5,7,9,6,4);
        System.out.println("Paratter: " + t);
    }
}
class sv {

    private double sv;
    private double so;

    public void gan(double sv, double so) {
        this.sv = sv;
        this.so = so;
    }

    public double ol(double sv, double so) {
        return ((sv + so) / 2);
    }

    public double ol(double sv, double so, double ma) {
        return ((sv + so + ma) / 3);
    }
    public double rd(double ... arr){
        double tong = 0.0;
        for ( double i : arr){
            tong += i;
        }
        return tong;
    }
}