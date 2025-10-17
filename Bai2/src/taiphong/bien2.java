package taiphong;

public class bien2 extends bien1{
    private int masv;
    public bien2(String name, int age,int masv) {
        super(name, age);
        this.masv = 0;
    }


    public void setMasv(int masv) {
        this.masv = masv;
    }

    public int getMasv() {
        return masv;
    }
    public String toString() {
        return "Tên: " + getName() + ", Tuổi: " + getAge() + ", Mã SV: " + masv;
    }
}
