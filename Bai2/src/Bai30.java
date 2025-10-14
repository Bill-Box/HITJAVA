
 class Student{
    private String name;
    private int age;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public  void setAge(int age){
        this.age= age;
    }
    public String getName(){
        return name;
    }
    public  int getAge(){
        return  age;
    }
    public boolean ketqua(){
        return 24 > 26;
    }

}
public class Bai30 {
    public static void main(String[] args) {
        Student sv = new Student("Long", 19);
        System.out.println("Ten: " + sv.getName() + " " + sv.getAge() + " tuoi");
        sv.setAge(18);
        sv.setName("Vu");
        System.out.println("Ten new: " + sv.getName() + " " + sv.getAge() + " tuoi");
        System.out.println(sv.ketqua());
    }
}
