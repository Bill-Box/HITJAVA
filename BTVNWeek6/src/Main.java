import service.impl.IBookService;
import service.impl.IBookServicelmpl;

public class Main {
    public static void main(String[] args) {
        IBookServicelmpl IB = new IBookServicelmpl();
        IB.Menu();
    }
}