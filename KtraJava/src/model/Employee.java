package model;

 public abstract class Employee {
    private String id;
    private String name;
    private int age;
    private double basicSalary;
    private Device device;


     public Employee(String id, String name, int age, double basicSalary, Device device) {
         this.id = id;
         this.name = name;
         this.age = age;
         this.basicSalary = basicSalary;
         this.device = device;
     }

     public double getBase_Selery_Rate() {
         return Base_Selery_Rate;
     }

     public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public  double getbasicSalary() {
        return basicSalary;
    }

    public  void setBase_Selery_Rate(double basicSalary) {
        this.basicSalary = basicSalary;;
    }

    @Override
    public String toString() {
        return
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", basicSalary=" + basicSalary +
                ", device=" + device  + "\n";
    }
     public abstract int EmployeeCount();

    public final double Base_Selery_Rate = 500000;

}
