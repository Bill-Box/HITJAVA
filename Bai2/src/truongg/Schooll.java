package truongg;

import java.util.Date;

public class Schooll {
    private String name;
    private String date;
    public Schooll(String name, String date){
        this.name = name;
        this.date = date;
    }
    @Override
    public String toString() {
        return "Truong " + name + " " + " Ngay " + date;
    }

}
