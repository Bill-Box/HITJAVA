import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, x;
        System.out.print("Nhap so phan tu: ");
        n = sc.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        // a. Tìm kiếm phần tử x trong mảng
        System.out.print("Nhap x can tim: ");
        x = sc.nextInt();
        boolean found = false;
        for (i = 0; i < n; i++) {
            if (a[i] == x) {
                System.out.println("Tim thay tai vi tri: " + i);
                found = true;
            }
        }
        if (!found) System.out.println("Khong tim thay!");

        // b. Chèn phần tử vào mảng (giữ thứ tự tăng dần)
        System.out.print("Nhap so can chen: ");
        x = sc.nextInt();
        int[] b = new int[n + 1];
        i = 0;
        while (i < n && a[i] < x) {
            b[i] = a[i];
            i++;
        }
        b[i] = x;
        for (j = i; j < n; j++) b[j + 1] = a[j];
        System.out.print("Mang sau khi chen: ");
        for (i = 0; i < n + 1; i++) System.out.print(b[i] + " ");
        System.out.println();

        // c. Tìm các dãy con có tổng = T
        System.out.print("Nhap tong T: ");
        int T = sc.nextInt();
        for (i = 0; i < n; i++) {
            int s = 0;
            for (j = i; j < n; j++) {
                s += a[j];
                if (s == T) {
                    System.out.print("Day con tu " + i + " den " + j + ": ");
                    for (int k = i; k <= j; k++) System.out.print(a[k] + " ");
                    System.out.println();
                }
            }
        }

        // d. Đưa các số nguyên tố lên đầu và sắp xếp tăng dần
        int[] c = new int[n];
        int count = 0;
        for (i = 0; i < n; i++) if (isPrime(a[i])) c[count++] = a[i];
        for (i = 0; i < n; i++) if (!isPrime(a[i])) c[count++] = a[i];
        for (i = 0; i < n - 1; i++)
            for (j = i + 1; j < n; j++)
                if (c[i] > c[j]) {
                    int t = c[i];
                    c[i] = c[j];
                    c[j] = t;
                }
        System.out.print("Mang sau khi sap xep: ");
        for (i = 0; i < n; i++) System.out.print(c[i] + " ");
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}

