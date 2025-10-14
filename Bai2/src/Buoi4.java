package com.exaple;
class Student{
    private String name;
    private  String from;
    private  int age;
    private float point1;
    private float point2;
    private float KTHP;
    public Student(String name ,String from, int age, float point1, float point2 , float KTHP){
        this. name = name;
        this.from = from;
         this. age = age;
         this.point1 = point1;
         this.point2 = point2;
         this.KTHP = KTHP;
    }
    public String getName (){
        return  name;
    }
    public String getFrom(){
        return  from;
    }
    public  int getAge(){
        return  age;
    }
    public  float getPoint1(){
        return point1;
    }

    public float getPoint2() {
        return point2;
    }

    public float getKTHP() {
        return KTHP;
    }
    public double GPA(){
        return point1 * 0.2 + point2 * 0.3 + KTHP * 0.5;
    }
    public void hienThiThongTin() {
        System.out.printf("%-10s %-12s %-8d %-12.2f %-12.2f %-13.2f %-9.2f\n",
                getName(), getFrom(), getAge(), getPoint1(), getPoint2(), getKTHP(), GPA());
    }
}
public class Buoi4 {
    public static void main(String[] args) {
       Student[] sv = new Student[5];
       sv[0] = new Student("Hung"," HN ", 19, 9,8,9);
       sv[1] = new Student("Hoang", " SL ", 18, 8,8,9);
       sv[2] = new Student("Ha", " LC ", 23, 9,9,9);
       sv[3] = new Student("Dung", " SG ", 20, 7,8,95);
       sv[4] = new Student("Manh", " BN ", 17, 9,10,9);
        System.out.println("              Xuat Danh Sach: ");
        System.out.printf("%-10s %-12s %-8s %-12s %-12s %-13s %-9s\n",
                "Tên", "Địa chỉ", "Tuổi", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "GPA");
        System.out.println("-----------------------------------------------------------------------------------------------");
        for (Student i: sv){
            i.hienThiThongTin();
        }
    }
}