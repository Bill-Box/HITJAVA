package company;

public class test {
    public static void main(String[] args) {
        ngansach ns = new ngansach("Dung", 20, 241467);
        System.out.println(" TTD2: " + ns.salary());
        ns.setName("Long");
        ns.setage(19);
        ns.setma(123);
        System.out.println("HTT Long: ");
        ns.hht();
        ns.salary();
        System.out.println(" tine luong thang: " + ns.salary());

    }
}
