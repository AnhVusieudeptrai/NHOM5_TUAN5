import java.util.ArrayList;
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        ArrayList<Integer> so = new ArrayList<>(); 
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập số lượng số nguyên: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số nguyên thứ " + (i + 1) + ": ");
            int s = sc.nextInt();
            so.add(s);
        }
        System.out.println("Danh sách các số nguyên đã nhập:");
        for (int n1 : so) {
            System.out.println(n1);
        }

        sc.close();
    }
}
