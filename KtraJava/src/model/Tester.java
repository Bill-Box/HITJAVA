package model;

import IEmployeeService.mpl.EmployeeServiceempl;

public class Tester extends Employee implements IWorkable  {
    private int bugsDetectedCount;
    public EmployeeServiceempl ie ;

    public Tester(String id, String name, int age, double basicSalary, Device device, int bugsDetectedCount,EmployeeServiceempl ie) {
        super(id, name, age, basicSalary, device);
        this.bugsDetectedCount = bugsDetectedCount;
        this.ie= ie;
    }


    public int getBugsDetectedCount() {
        return bugsDetectedCount;
    }

    public void setBugsDetectedCount(int bugsDetectedCount) {
        this.bugsDetectedCount = bugsDetectedCount;
    }

    @Override
    public void work(){
        System.out.println("Toi co the lam viec Tester");
    }

    @Override
    public int EmployeeCount() {
        int count = 0;
        StringBuilder td = new StringBuilder();
        for (int i = 0; i < ie.getAllEmployess().size(); i++) {
            if (ie.getAllEmployess().get(i) instanceof Tester) {
                td.append(ie.getAllEmployess().get(i));
                count++;
            }
        }
        System.out.println(td.toString());
        System.out.print("So luong Nhan Vien Tester: ");
        if (td.length() > 0) {
            return count;
        }
        return 0;
    }
}
