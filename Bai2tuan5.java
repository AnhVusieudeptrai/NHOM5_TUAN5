/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2tuan5;
import java.util.Scanner;
/**
 *
 * @author OS
 */
public class Bai2tuan5 {

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

    //dao nguoc cac phan tu
    //n/2:den nua kich thuot mang
    
    for(int i=0;i<n/2;i++){
    int tam = array[i];
    array[i] = array[n-1-i];
    array[n-1-i] = tam;
    }
    //in ket qua
    System.out.println("Mang sau khi dao nguoc:");
    for(int i=0;i<n;i++){
        System.out.println(array[i]+" ");
    }
    scanner.close();
}
}

