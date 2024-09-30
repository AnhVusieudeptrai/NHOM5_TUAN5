/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai4tuan5;
import java.util.Scanner;
/**
 *
 * @author My Le
 */
public class Bai4Tuan5 {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu cua mang:");
        int n = scanner.nextInt();
        int[] mang = new int[n];

        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < n; i++) {
            mang[i] = scanner.nextInt();
        }

        int phanTuNhieuNhat = timPhanTuNhieuNhat(mang);
        System.out.println("phan tu xuat hien nhieu nhat la: " + phanTuNhieuNhat);
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
