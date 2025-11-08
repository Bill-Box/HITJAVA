package shipment;
import Parccell.Parcel;

public class Shipment {
    public static final int n = 200;
    private int count = 0;
    private Parcel[] pc = new Parcel[n];

    public Shipment() {
    }

    public Shipment(int cout, Parcel[] pc) {
        this.count = cout;
        this.pc = pc;
    }

    public int getCount() {
        return count;
    }

    public void setCout(int count) {
        this.count = count;
    }

    public Parcel[] getPc() {
        return pc;
    }

    public void setPc(Parcel[] pc) {
        this.pc = pc;
    }
    public void add(Parcel p){
        if(count != n) {
            for (int i = 0; i < pc.length; i++) {
                Parcel pc = new Parcel();
                if(pc[i] == null){
                    pc[i] = p;
                    break;
                }
            }
        }
    }
}
