import IEmployeeService.mpl.EmployeeServiceempl;
import model.Developer;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.util.RandomAccess;
import java.util.logging.ErrorManager;

public class Main {
    public static void main(String[] args) {
        EmployeeServiceempl emp = new EmployeeServiceempl();
        emp.Menu();
        emp.inme();

    }
}