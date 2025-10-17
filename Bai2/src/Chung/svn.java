package Chung;

import javax.naming.Name;

public class svn {
    private String name;
    private  int ma;
    private double TB ;
    private SV loai ;

    public svn(int ma, String name, double TB){
        this.ma = ma;
        this.name = name;
        this.TB = TB;
        this.loai = getLoai();
    }

    public SV getLoai() {
        if (this.TB >= 9 )
            loai = SV.gioi;
        else if (this.TB >=8 )
           loai = SV.tot;
        else if (this.TB >= 5)
            loai = SV.kha;
        else if (this.TB >3)
            loai = SV.TB;
        else
            loai = SV.duoihoc;
            return  loai;
    }

    @Override
    public String toString() {
        return ma + " " + name + " loai " + loai;
            
        }
}
