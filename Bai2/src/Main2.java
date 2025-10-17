package com.example;
class sv {
    private String name;
    private int birht;
    private String as;
    private float poit1;
    private float poit2;
    private float KP;
    private int rl;
    public sv ( String name, int birht, String as, float poit1, float poit2, float KP, int rl){
        this.name = name;
        this.as = as;
        this.rl = rl;
        this.KP = KP;
        this.birht = birht;
        this.poit1 = poit1;
        this.poit2 = poit2;
    }
    public String getName(){
        return name;
    }
    public  String getas(){
        return as;
    }
    public int getrl(){
        return rl;
    }
    public int getbirth(){
        return birht;
    }

    public float getpoit1() {
        return poit1;
    }
    public float getpoit2() {
        return poit2;
    }
    public float getKP() {
        return KP;
    }
    public double GPA(){
        return poit1 * 0.2 + poit2 * 0.3 + KP * 0.5;
    }

}
public class Main2 {
    public static void main(String[] args) {
        sv[] svs = new sv[5];
        svs[0] = new sv("Long", 2003, "HN", 8, 9, 9, 10);
        svs[1] = new sv("Hung", 2002, "SG", 10, 9, 5, 3);
        svs[2] = new sv("Duc", 2001, "TN", 8, 9, 9, 4);
        svs[3] = new sv("Phuc", 2004, "BK", 8, 6, 9, 5);
        svs[4] = new sv("Dung", 2003, "DH", 7, 9, 8, 0);

        System.out.printf("%-15s%-10s%-15s%-12s%-12s%-15s%-10s%-12s\n",
                "Tên", "Tuổi", "Địa chỉ", "Điểm TX1", "Điểm TX2", "Điểm KTHP", "GPA", "Số tiết nghỉ");
        for ( sv s : svs ){
            System.out.printf("%-15s%-10d%-15s%-12.2f%-12.2f%-15.2f%-10.2f%-12d\n",
                    s.getName(), s.getbirth(), s.getas(),
                    s.getpoit1(), s.getpoit2(), s.getKP(), s.GPA(), s.getrl());
        }
    }
}