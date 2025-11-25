package IEmployeeService.mpl;

import constaint.Constaint;
import model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceempl implements IEmployeeService {
    public List<Employee> em ;

    public EmployeeServiceempl(List<Employee> em, Constaint ct, Scanner sc) {
        this.em = em;
        this.ct = ct;
        this.sc = sc;
    }

    public Constaint ct = new Constaint();
    public Scanner sc = new Scanner(System.in);
    public EmployeeServiceempl(){
        em = new ArrayList<>();
        em.add("01","Hoang",18,2000,("001","A1"));
        em.add("02","Hieu",18,3000,("002","A2"));
        em.add("03","Trung",19,4000,("003","A3"));
        em.add("04","Hoa",18,5000,("004","A4"));
        em.add("05","Nam",19,6000,("005","A5"));
    }
    @Override
    public List<Employee> getAllEmployess() {
        return em;
    }

    @Override
    public Employee getEmployeeByID(String id) {
        if(em != null){
            for ( int i = 0; i < em.size(); i++){
                if(em.get(i).getId().equals(id)){
                    return em.get(i);
                }
            }
        }
        System.out.println(ct.Mang);
        return null;
    }

    @Override
    public Employee getEmployeeByName(String name) {
        if(em != null){
            for ( int i = 0; i < em.size(); i++){
                if(em.get(i).getId().equals(name)){
                    return em.get(i);
                }
            }
        }
        return null;
    }
    public void Menu(){
        System.out.println("----- Menu -----\n" +
                "1. In ra danh sách tất cả các nhân viên\n" +
                "2. In ra thông tin nhiên viên theo ID\n" +
                "3. Lọc ra danh sách nhân viên theo Tên \n" +
                "4. Thoát\n" );
        System.out.print("Chon: ");
        int choice = sc.nextInt();

        do{
            System.out.print("Chon Lai: ");
             choice = sc.nextInt();
            if( choice == 1){
                System.out.println("In ra danh sách tất cả các nhân viên:");
                System.out.println(getAllEmployess());
            }
            else if (choice == 2) {
                System.out.println("In ra thông tin nhiên viên theo ID:");
                System.out.print("Nhap Ten SV NV can IN: ");
                String id = sc.nextLine();
                System.out.println(getEmployeeByID(id));
            }
            else if (choice == 3) {
                System.out.println(" Lọc ra danh sách nhân viên theo Tên:");
                String name = sc.nextLine();
                System.out.println(getEmployeeByName(name));

            }
            else if (choice == 4) {
                System.out.println(ct.out);
                break;
            }
        }while(choice < 4);


    }
}
