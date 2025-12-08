package IEmployeeService.mpl;

import constaint.Constaint;
import model.Developer;
import model.Device;
import model.Employee;
import model.Tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeServiceempl implements IEmployeeService {
    public List<Employee> em  = new ArrayList<>();;

    public EmployeeServiceempl(List<Employee> em, Constaint ct, Scanner sc) {
        this.em = em;
        this.ct = ct;
        this.sc = sc;
    }

    public Constaint ct = new Constaint();
    public Scanner sc = new Scanner(System.in);
    public EmployeeServiceempl(){
        em.add(new Developer("01","Hoang",18,2000,new Device("001","A1"),12,this));
        em.add(new Tester("02","Hieu",18,3000,new Device("002","A2"),23,this));
        em.add(new Developer("03","Trung",19,4000,new Device("003","A3"),12,this));
        em.add(new Tester("04","Hoa",18,5000,new Device("004","A4"),14,this));
        em.add(new Developer("05","Nam",19,6000,new Device("005","A5"),16,this));
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
                if(em.get(i).getName().equals(name)){
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
        int choice ;

        do{
            System.out.print("Chon: ");
             choice = sc.nextInt();
            if( choice == 1){
                System.out.println("In ra danh sách tất cả các nhân viên:");
                System.out.println(getAllEmployess());
            }
            else if (choice == 2) {
                System.out.println("In ra thông tin nhiên viên theo ID:");
                sc.nextLine();
                System.out.print("Nhap ID SV NV can IN: ");
                String id = sc.nextLine();
                System.out.println(getEmployeeByID(id));
            }
            else if (choice == 3) {
                System.out.println(" Lọc ra danh sách nhân viên theo Tên:");
                sc.nextLine();
                System.out.print("Nhap Ten: ");
                String name = sc.nextLine();
                System.out.println(getEmployeeByName(name));

            }
            else if (choice == 4) {
                System.out.println(ct.out);
                break;
            }
        }while(choice < 4);
    }
    public void inme(){
        for(int i = 0; i < em.size(); i++){
            if(em.get(i) instanceof Developer){
                System.out.println(em.get(i).EmployeeCount());
                break;
            }
        }
    }
}
