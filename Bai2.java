import java.util.Scanner;

public class Bai2 {
	  public static void daonguoc(int[] a) {
	        int l=0;
	        int r=a.length-1;
	        while (l<r) {
	            int p=a[l];
	            a[l]=a[r];
	            a[r]=p;
	            l++;
	            r--;
	        }
	    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Nhập số phần tử của mảng: ");
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
			    System.out.print("Nhập phần tử thứ " + i + ": ");
			    a[i] = sc.nextInt();
			}
			daonguoc(a);
			System.out.println("Mảng sau khi đảo ngược: ");
			for (int i = 0; i < n; i++) {
			    System.out.print(a[i] + " ");
			}
		}
    }
}
