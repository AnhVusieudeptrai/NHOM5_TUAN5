package bai1;
import java.util.Scanner;
public class bai1 {
	static int [] A;
	static int n;
	static Scanner sc; 
	static void Nhap(int n) {
		for (int i=0;i<n;i++)
		{
			System.out.println("Nhap phan tu thu "+i+": ");
			A[i]=sc.nextInt();
		}
	}
	static int ketqua() {
		int s=0;
		for(int i=0;i<n;i++) {
			s=s+A[i];
		}
		return s;
	}
	public static void main (String[] args) {
			sc = new Scanner(System.in);
			System.out.println("Nhap so phan tu ");
			n=sc.nextInt();
			A=new int[n];
			Nhap(n);
			System.out.println("Ket qua la " + ketqua());
	}
}