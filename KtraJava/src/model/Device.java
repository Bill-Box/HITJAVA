package model;

import IEmployeeService.mpl.EmployeeServiceempl;

public class Device  {
    private String model;
    private String id;

    public Device(String model, String id) {
        this.model = model;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", id='" + id + '\''
                ;
    }
}
