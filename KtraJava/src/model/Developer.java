package model;

import IEmployeeService.mpl.EmployeeServiceempl;

public class Developer extends Employee implements IDebuggable,IWorkable {
    private int overtimeHours;
    public EmployeeServiceempl ee ;

    public Developer(String id, String name, int age, double basicSalary, Device device,int overtimeHours, EmployeeServiceempl ee) {
        super(id, name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
        this.ee = ee;
    }

    public Developer(String id, String name, int age, double basicSalary, Device device, int overtimeHours) {
        super(id, name, age, basicSalary, device);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public int EmployeeCount() {
        int count = 0;
        StringBuilder td = new StringBuilder();
        for(int i = 0; i < ee.getAllEmployess().size(); i++){
            if(ee.getAllEmployess().get(i) instanceof Developer){
                td.append(ee.getAllEmployess().get(i));
                count++;
            }
        }
        System.out.println(td.toString());
        System.out.print("So luong Nhan Vien DeVerLop: ");
        if(td.length() > 0){
            return count;
        }
        return 0;
    }

    public double caculateSalary(){
        System.out.print(" Tong Luong: ");
        return getBasicSalary() + Base_Selery_Rate * overtimeHours;
    }

    @Override
    public double fixBug() {
        return 0;
    }

    @Override
    public void work() {
        System.out.println("I can work");
    }
}
