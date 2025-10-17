import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class SinhVien {
    private String Tensv;
    private String DiaChi;
    private int masv;
    private int age;

    public SinhVien() {}

    public SinhVien(String Tensv, String DiaChi, int masv, int age){
        this.Tensv = Tensv;
        this.DiaChi = DiaChi;
        this.masv = masv;
        this.age = age;
    }

    public String getTensv(){
        return Tensv;
    }
    public String getDiaChi(){
        return DiaChi;
    }
    public int getmasv(){
        return masv;
    }
    public int getage(){
        return age;
    }

    public void setTensv(String Tensv){
        this.Tensv = Tensv;
    }
    public void setDiaChi(String DiaChi){
        this.DiaChi = DiaChi;
    }
    public void setmasv(int masv){
        this.masv = masv;
    }

    public void setAge(int age){
        if (age > 0)
            this.age = age;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your First Name: ");
        this.Tensv = sc.nextLine();
        System.out.print("Enter your Last Name:  ");
        this.DiaChi = sc.nextLine();
        System.out.print("Enter your Masv:        ");
        this.masv = sc.nextInt();
        System.out.print("Enter your Age:        ");
        this.age = sc.nextInt();
    }

    public void printSinhVien(){
        System.out.println(this.Tensv + " " + this.DiaChi + "\t" + this.masv + "\t" + this.age );
    }
}



class Main {
    public static void main(String[] args) {
        DateTimeFormatter DF = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        LocalDateTime dateTime = LocalDateTime.parse(sc.nextLine().trim(), DF);
        System.out.println("Ngay: " + dateTime.format(DF) );
        SinhVien sv1 = new SinhVien();
        sv1.input();
        sv1.printSinhVien();
    }
}