package bai4;
import java.util.Scanner;
public class bai4 {
	 public static int tim(int[] a) {
	        int demmax=0;
	        int c=a[0];
	        for (int i=0;i<a.length; i++) {
	            int dem = 0;
	            for (int j=0;j<a.length;j++) {
	                if (a[i]==a[j]) {
	                    dem++; 
	                }
	            }
	            if (dem>demmax) {
	                demmax=dem;
	                c=a[i];
	            }
	        }
	        return c;
	    }
	    public static void main(String[] args) {
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Nhập số phần tử của mảng: ");
				int n = sc.nextInt();

				int[] a = new int[n];
				for (int i=0;i<n;i++) {
				    System.out.print("Nhập phần tử thứ " + i + ": ");
				    a[i] = sc.nextInt();
				}
				int m = tim(a);
				System.out.println("Phần tử xuất hiện nhiều nhất trong mảng: " + m);
			}
	    }
	  
	}
