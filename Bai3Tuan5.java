/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3tuan5;
import java.util.Scanner;
/**
 *
 * @author My Le
 */
public class Bai3Tuan5 {

    public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so phan tu trong mang:");
        int n=scanner.nextInt();
        
        //khai bao mang
        int[] array = new int[n];
        
        //Nhap
        
        for(int i=0 ; i<n ; i++){
            System.out.print("Phan tu thu " +(i+1)+":");
            array[i] = scanner.nextInt();
    }
        sapxep(array);
        
        System.out.println("Mang sau khi sap xep:");
        xuat(array);
        
}
    //thuat toan sap xep
    static void sapxep(int[] array){
        int n=array.length;
        for(int i=0;i<n;i++)
            for(int j=0;j<n-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int tam=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tam;
                }
            }
    }
   static void xuat(int[] array){
       for(int i=0;i<array[i];i++){
           System.out.println(array[i]+" ");
       }
       System.out.println();
   }
}
