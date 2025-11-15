package service;

import model.Student;
import constant.Information;

import java.util.ArrayList;
import java.util.Scanner;

public class Studentservice {
    public static ArrayList<Student> st = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static Information ifmt = new Information();

    public void add(Student st1) {
        if (st1 != null) {
            st.add(st1);
        }
    }

    public void remove(Student st2) {
        st.remove(st2);
    }

    public void repair(Student st3) {
        System.out.println("Chon phan ban muon sua:");
        System.out.print("1. Sua Ten.\n" +
                "2. Sua tuoi.\n" + "3. Sua lop.\n"
                + "4. Sua tat ca thong tin.\n " + "Chon: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                for (int i = 0; i < st.size(); i++) {
                    System.out.print(" Nhap ten can sua: ");
                    String name = sc.nextLine();
                    st.get(i).setName(name);
                }
                System.out.println(Information.TB.Succes_Name);
                break;

            case 2:
                for (int i = 0; i < st.size(); i++) {
                    System.out.print("Nhap tuoi can sua: ");
                    int age = sc.nextInt();
                    st.get(i).setAge(age);
                }
                System.out.println(Information.TB.Succes_Age);
                break;

            case 3:
                for (int i = 0; i < st.size(); i++) {
                    System.out.print(" Nhap lop can sua: ");
                    String lop = sc.nextLine();
                    st.get(i).setLop(lop);
                }
                System.out.println(Information.TB.Succes_Lop);
                break;

            case 4:
                for (int i = 0; i < st.size(); i++) {
                    System.out.print("Sua ten: ");
                    String name = sc.nextLine();
                    st.get(i).setName(name);
                    System.out.print("Sua tuoi: ");
                    int age = sc.nextInt();
                    st.get(i).setAge(age);
                    sc.nextLine();
                    System.out.print("Sua lop: ");
                    String lop = sc.nextLine();
                    st.get(i).setLop(lop);
                    System.out.println(Information.TB.Succes_All);
                    System.out.println(st.get(i).toString());
                }
                break;

            default:
                System.out.println(Information.TB.Succes_UnAll);
                break;

        }


    }

    public void seachname(String name) {
        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).getName().equals(name)) {
                System.out.println(st.get(i).toString());
                break;
            }
        }
    }

    public void seachlop(String lop) {
        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).getName().equals(lop)) {
                System.out.println(st.get(i).toString());
                break;
            }
        }
    }

}
