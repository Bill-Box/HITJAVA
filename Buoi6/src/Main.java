import model.Student;
import service.Studentservice;

public class Main {
    public static void main(String[] args) {
        Studentservice stdsv = new Studentservice();
        Student st1 = new Student("Phong", 20,"Lop12");
        stdsv.add(st1);
        stdsv.seachname("Phong");
        stdsv.repair(st1);
        stdsv.seachname("Phong");
    }
}