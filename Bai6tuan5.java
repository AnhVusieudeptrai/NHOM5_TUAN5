/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai6tuan5;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author OS
 */
public class Bai6tuan5 {
    public static void main(String[] args) {
       ArrayList<Integer> danhsach = new ArrayList<>();
      Scanner sc=new Scanner(System.in);
      System.out.print("Nhap so luong phan tu:");
      int n=sc.nextInt();
      
      //khai bao mang
      int array[]=new int[n];
      //nhap
      
      for(int i=0;i<n;i++){
          System.out.print("Phan tu thu"+(i+1)+":");
          array[i]=sc.nextInt();
          danhsach.add(array[i]);
      }
      //xuat truoc khi thay doi va xoa
        System.out.println("Danh sach sau khi nhap:"+danhsach);
      
      
      //Them phan tu tai vi tri chi dinh
      System.out.print("Nhap vi tri phan tu muon them: ");
      int vtrithem=sc.nextInt();
      System.out.print("Nhap gia tri phan tu muon them: ");
      int gtrithem=sc.nextInt();
      danhsach.add(vtrithem,gtrithem);
      System.out.println("Danh sach sau khi them: "+danhsach);
      
      //Xoa
      System.out.print("Nhap vi tri muon xoa:");
      int vtrixoa=sc.nextInt();
      danhsach.remove(vtrixoa);
      System.out.println("Danh sach sau khi xoa"+danhsach);
              
          
    }
    }

