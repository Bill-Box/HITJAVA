import java.util.*;

import java.util.zip.CheckedInputStream;

public class mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lst = new ArrayList<>(List.of(1,2,3,4,5,6));
        lst.add(3,8);
        System.out.println(" Sau khi them 8: " + lst);
        lst.remove(1);
        System.out.println(" Sau khi xoa vtr 1: " + lst);
        lst.set(5,9);
        System.out.println(" Sau khi thay the: " + lst);
        Collections.sort(lst);
        System.out.println(" Sau khi sx: " + lst);
        Collections.reverse(lst);
        System.out.println(" Sau kh dao ngc: " + lst);
        lst.remove(Integer.valueOf(4));
        System.out.println(" sau khi xoa 4: " + lst);
        boolean check =  lst.isEmpty();
        System.out.println("CHeckL rong " + check);

        System.out.println(" Moi nhap n: ");
        int n = sc.nextInt();
        sc.nextLine();
        String [] ch = new String [n];
        System.out.println(" Moi nhap chuoi:");
        for (int i  =0; i < n; i++ ){
            ch[i] = sc.nextLine();
        }
        System.out.println(" CHuoi saukhi nhap: ");
            System.out.println(Arrays.toString(ch));
        int [] so = new int[5];
        System.out.println(" MOi Nhap so:");
        for ( int i = 0; i < 5; i++){
            System.out.print("M[" + i + "] = " );
            so[i] = sc.nextInt();
        }
        System.out.println(" Chuoi so asu khi nhap:");
        System.out.println(Arrays.toString(so));
        Arrays.sort(so);
        System.out.println(" Mang Sau Dao ngc: " +  Arrays.toString(so));
        }


    }

