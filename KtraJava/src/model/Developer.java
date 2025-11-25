package model;

public class Developer extends Employee implements IDebuggable,IWorkable {
    private int overtimeHours;

    public Developer(String id) {
        super(id);
    }

    @Override
    public int EmployeeCount() {
        return 0;
    }

    public double caculateSalary(){
        return getBasicSalary() + Base_Selery_Rate * overtimeHours;
    }

    @Override
    public double fixBug() {
        return 0;
    }

    @Override
    public void work() {

    }
}
