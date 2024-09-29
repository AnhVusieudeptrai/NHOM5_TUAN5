/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai5tuan5;
import java.util.Scanner;
/**
 *
 * @author OS
 */
public class Bai5tuan5 {


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Nhap so luong phan tu:");
    int n=sc.nextInt();
    
    //khai bao mang
    int array[] = new int[n];
    
    //nhap
    for(int i=0;i<n;i++){
    System.out.print("Nhap phan tu thu :"+(i+1)+":");
    array[i]=sc.nextInt();
    }
    //xuat
    System.out.println("Cac phan tu nguyen cua danh sach la:");
    for( int i=0;i<n;i++){
        System.out.print(array[i]+"");
    }
}
}

   

