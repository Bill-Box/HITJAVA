package coverride;

public class Sanpham implements Comparable<Sanpham>{
    private String name;
    private int age;

    public Sanpham(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "Ten: " + name + " " + age + "Kg:";
    }
    @Override
    public int compareTo(Sanpham o) {
       return this.name.compareToIgnoreCase(o.name);
    }
}
