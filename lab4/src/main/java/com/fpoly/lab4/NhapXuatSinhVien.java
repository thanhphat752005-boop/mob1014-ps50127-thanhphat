package com.fpoly.lab4;

import java.util.Scanner;

public class NhapXuatSinhVien {
    public static void main(String[] args) {
        // Chỉ dùng một đối tượng Scanner duy nhất trong chương trình
        Scanner sc = new Scanner(System.in);

        // Tạo 2 đối tượng sv1, sv2
        Student sv1 = new Student();
        Student sv2 = new Student();

        System.out.println("--- NHAP THONG TIN SINH VIEN 1 ---");
        sv1.input(sc);

        System.out.println("--- NHAP THONG TIN SINH VIEN 2 ---");
        sv2.input(sc);

        System.out.println("\n--- THONG TIN 2 SINH VIEN ---");
        sv1.output();
        sv2.output();

        // -----------------------------------------
        // Phần lưu ý kỹ thuật: Test biến tham chiếu
        // -----------------------------------------
        System.out.println("\n--- TEST BIEN THAM CHIEU ---");
        Student sv3 = sv1; // sv3 trỏ tới cùng vùng nhớ với sv1
        sv3.name = "Test"; // Thay đổi tên qua sv3
        
        // Gọi sv1 xuất ra để quan sát
        System.out.print("Thong tin sv1 sau khi sv3 doi ten: ");
        sv1.output(); 
        
        /* 
         * Giải thích cho video của bạn: 
         * Khi gán sv3 = sv1, ta không tạo ra một sinh viên mới, mà sv3 chỉ là 
         * một "tên gọi khác" trỏ vào cùng một ô nhớ chứa dữ liệu của sv1. 
         * Do đó, khi thay đổi sv3.name thì thực chất dữ liệu gốc bị đổi, 
         * dẫn đến sv1 cũng hiển thị tên là "Test".
         */
    }
}