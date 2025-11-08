package Building;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Manager  {
    private ArrayList<SaleDtaff> saleDtaff;
    private Technician technician;

    public Manager() {
    }

    public ArrayList<SaleDtaff> getSaleDtaff() {
        return saleDtaff;
    }

    public void setSaleDtaff(ArrayList<SaleDtaff> saleDtaff) {
        this.saleDtaff = saleDtaff;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }
}
