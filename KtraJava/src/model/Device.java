package model;

import IEmployeeService.mpl.EmployeeServiceempl;

public class Device extends Employee  {
    private String model;
    public Device(String id, String model){
        super(id);
        this.model = model;
    }
    public EmployeeServiceempl en = new EmployeeServiceempl();

    @Override
    public int EmployeeCount() {
        return en.getAllEmployess().size();
    }
}
