/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.b7t5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class b7t5 {
    private String maSV;
    private String ten;
    private double diemTB;

    public b7t5(String maSV, String ten, double diemTB) {
        this.maSV = maSV;
        this.ten = ten;
        this.diemTB = diemTB;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTen() {
        return ten;
    }

    public double getDiemTB() {
        return diemTB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSV='" + maSV + '\'' +
                ", ten='" + ten + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }
}

public class QuanLySinhVien {
    private ArrayList<Student> danhSachSinhVien = new ArrayList<>();

    public void themSinhVien(Student sv) {
        danhSachSinhVien.add(sv);
    }

    public void xoaSinhVien(String maSV) {
        danhSachSinhVien.removeIf(sv -> sv.getMaSV().equals(maSV));
    }

    public Student timKiemSinhVien(String maSV) {
        for (Student sv : danhSachSinhVien) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }

    public void sapXepSinhVienTheoDiem() {
        Collections.sort(danhSachSinhVien, Comparator.comparingDouble(Student::getDiemTB));
    }

    public void hienThiDanhSachSinhVien() {
        for (Student sv : danhSachSinhVien) {
            System.out.println(sv);
        }
    }

    public static void main(String[] args) {
        QuanLySinhVien qlsv = new QuanLySinhVien();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo mã");
            System.out.println("4. Sắp xếp sinh viên theo điểm");
            System.out.println("5. Hiển thị danh sách sinh viên");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sinh viên: ");
                    String maSV = scanner.nextLine();
                    System.out.print("Nhập tên sinh viên: ");
                    String ten = scanner.nextLine();
                    System.out.print("Nhập điểm trung bình: ");
                    double diemTB = scanner.nextDouble();
                    Student sv = new Student(maSV, ten, diemTB);
                    qlsv.themSinhVien(sv);
                    break;
                case 2:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    maSV = scanner.nextLine();
                    qlsv.xoaSinhVien(maSV);
                    break;
                case 3:
                    System.out.print("Nhập mã sinh viên cần tìm: ");
                    maSV = scanner.nextLine();
                    Student found = qlsv.timKiemSinhVien(maSV);
                    if (found != null) {
                        System.out.println("Thông tin sinh viên: " + found);
                    } else {
                        System.out.println("Không tìm thấy sinh viên với mã " + maSV);
                    }
                    break;
                case 4:
                    qlsv.sapXepSinhVienTheoDiem();
                    System.out.println("Danh sách sinh viên sau khi sắp xếp:");
                    qlsv.hienThiDanhSachSinhVien();
                    break;
                case 5:
                    qlsv.hienThiDanhSachSinhVien();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
