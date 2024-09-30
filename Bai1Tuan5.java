/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1tuan5;
import java.util.Scanner;
/**
 *
 * @author My Le
 */
public class Bai1Tuan5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang:");
        int n=scanner.nextInt();
        int[] array = new int[n];
        for(int i=0 ; i<n ; i++){
            System.out.print("Phan tu thu " +(i+1)+":");
            array[i] = scanner.nextInt();
    }
    int sum=0;
    for ( int i=0;i<n;i++){
    sum+=array[i];
}
    //in ket qua
    System.out.println("Tong cac phan tu la:"+sum);
    scanner.close();
}
}
