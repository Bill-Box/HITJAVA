package Building;

public class Technician extends Employee{
    private String techSkil;

    public Technician() {
        super();
    }

    public Technician(int id, String name, String country, double salary, String techSkil) {
        super(id, name, country, salary);
        this.techSkil = techSkil;
    }

    public String getTechSkil() {
        return techSkil;
    }

    public void setTechSkil(String techSkil) {
        this.techSkil = techSkil;
    }
}
