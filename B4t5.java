/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b4t5;
 import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author OS
 */
public class B4t5 {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng:");
        int n = scanner.nextInt();
        int[] mang = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }

        int phanTuNhieuNhat = timPhanTuNhieuNhat(mang);
        System.out.println("Phần tử xuất hiện nhiều nhất là: " + phanTuNhieuNhat);
    }

    public static int timPhanTuNhieuNhat(int[] mang) {
        HashMap<Integer, Integer> tanSuatMap = new HashMap<>();
        for (int so : mang) {
            tanSuatMap.put(so, tanSuatMap.getOrDefault(so, 0) + 1);
        }

        int maxTanSuat = 0;
        int phanTuNhieuNhat = -1;
        for (Map.Entry<Integer, Integer> entry : tanSuatMap.entrySet()) {
            if (entry.getValue() > maxTanSuat) {
                maxTanSuat = entry.getValue();
                phanTuNhieuNhat = entry.getKey();
            }
        }

        return phanTuNhieuNhat;
    }
}

    