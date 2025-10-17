package company;

public  class ngansach extends ketoan{
    private int rd;

    public ngansach(String name, int age, int qr) {
        super(name, age, qr);
    }
    public ngansach(String name, int age, int qr, int rd) {
        super(name, age, qr);
        this.rd = rd;
    }

    @Override
    public double salary() {
        return sala;
    }
}
