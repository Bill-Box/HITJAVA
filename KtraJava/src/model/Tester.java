package model;

public class Tester extends Employee implements IWorkable  {
    private int bugsDetectedCount;

    public Tester(String id, String name, int age, double basicSalary, Device device, int bugsDetectedCount) {
        super(id, name, age, basicSalary, device);
        this.bugsDetectedCount = bugsDetectedCount;
    }
    

    public int getBugsDetectedCount() {
        return bugsDetectedCount;
    }

    public void setBugsDetectedCount(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

    @Override
    public void work(){
        System.out.println("Ten CV");
    }

    @Override
    public int EmployeeCount() {
        return 0;
    }
}
