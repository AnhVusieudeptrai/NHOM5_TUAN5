package bai7;
import java.util.ArrayList;
import java.util.Scanner;

public class bai7 {
    static class Student {
        String masv;
        String ten;  
        double dtb;  
        public Student(String masv, String ten, double dtb) {
            this.masv = masv;
            this.ten = ten;
            this.dtb = dtb;
        }
        public void d() {
            System.out.println("Mã SV: " + masv + ", Tên: " + ten + ", GPA: " + dtb);
        }
    }
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void themhs() {
        System.out.print("Nhập mã sinh viên: ");
        String masv = sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        String ten = sc.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double dtb = sc.nextDouble();
        sc.nextLine(); // Clear buffer
        students.add(new Student(masv, ten, dtb));
        System.out.println("Đã thêm sinh viên.\n");
    }
    public static void sx() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = 0; j < students.size() - 1 - i; j++) {
                if (students.get(j).dtb > students.get(j + 1).dtb) {
                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }
        System.out.println("Danh sách sinh viên sau khi sắp xếp theo GPA:");
        for (Student student : students) {
            student.d();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sắp xếp sinh viên theo điểm trung bình");
            System.out.println("3. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    themhs();
                    break;
                case 2:
                   sx();
                    break;
                case 3:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 3);
    }
}
