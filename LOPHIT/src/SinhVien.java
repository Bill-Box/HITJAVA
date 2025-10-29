class Student{
    public String id;
    public String name;
    public double[] scores = new double[3];
    public Student(String id, String name, double m1, double m2, double m3){
        this.id = id;
        this.name = name;
        this.scores[0] = m1;
        this.scores[1] = m2;
        this.scores[2] = m3;
    }
    public double average(){
        return ( scores[0] + scores[1] + scores[2]) / 3;
    }
    public String rank(){
        double ag = average();
        if(ag >= 8) return "Gioi";
        else if(ag >= 6.5 && ag < 8) return "Kha";
        else return "TB";
    }
    public String toString(){
        return id + " - " + name + ": " + scores[0] + " " + scores[1] + " "
                + scores[2] + " | avg=" + average() + " | " + rank();
    }
}
class Room{
    public Student[] student = new Student[50];
    public int count;
    public void add(String id, String name, double m1, double m2, double m3){
        if (count < 50){
            student[count++] =new Student(id, name, m1, m2,m3);
        }
    }
    public Student top1B(){
        if (count == 0) return null;
        Student top = student[0];
        for (int  i = 0; i < count; i++){
            if (top.average() < student[i].average()){
                top = student[i];

            }
        }
        return top;
    }


}

public class SinhVien
{
    public static void main(String[] args) {
        Room c = new Room();
        c.add("S02", "Binh", 9.0, 8.5, 9.2);
        c.add("S03", "Cuong", 5.0, 6.0, 5.5);
        System.out.println("=== Danh sách sinh viên ===");
        for (int i = 0; i < c.count; i++) {
            System.out.println(c.student[i]);
        }
        System.out.println("\nTop 1:");
        System.out.println(c.top1B());
    }
}
