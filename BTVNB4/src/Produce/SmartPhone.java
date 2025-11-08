package Produce;

import java.util.ArrayList;

public class SmartPhone extends Produces{
    private boolean has5G;

    public SmartPhone(boolean has5G) {
        this.has5G = has5G;
    }

    public SmartPhone(String name, String description, double price, boolean has5G) {
        super(name, description, price);
        this.has5G = has5G;
    }

    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}
