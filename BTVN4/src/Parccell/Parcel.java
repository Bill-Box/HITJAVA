package Parccell;

public class Parcel {
    private String id;
     private  String receiver;
     private double weightkg;
     private int distancekm;

    public Parcel() {
    }

    public Parcel(String receiver, double weightkg, int distancekm) {
        this.receiver = receiver;
        this.weightkg = weightkg;
        this.distancekm = distancekm;
    }

    public String getId() {
        return id;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public double getWeightkg() {
        return weightkg;
    }

    public void setWeightkg(double weightkg) {
        this.weightkg = weightkg;
    }

    public int getDistancekm() {
        return distancekm;
    }

    public void setDistancekm(int distancekm) {
        this.distancekm = distancekm;
    }
}

