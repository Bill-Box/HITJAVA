package model;

import IEmployeeService.mpl.EmployeeServiceempl;

public class Device extends Employee  {
    private String model;

    public Device(String id, String name, int age, double basicSalary, Device device, String model, EmployeeServiceempl en) {
        super(id, name, age, basicSalary, device);
        this.model = model;
        this.en = en;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EmployeeServiceempl getEn() {
        return en;
    }

    public void setEn(EmployeeServiceempl en) {
        this.en = en;
    }

    public EmployeeServiceempl en = new EmployeeServiceempl();

    @Override
    public int EmployeeCount() {
        return en.getAllEmployess().size();
    }
}
