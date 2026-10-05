package com.fpoly.lab4;

import java.util.Scanner;

public class KhoiTaoSinhVien {
    public static void main(String[] args) {
        // Yêu cầu 2.1: Tạo sv1 bằng hàm tạo có tham số với dữ liệu cố định
        Student sv1 = new Student("PS001", "Nguyen Van An", 19, 8.25);
        System.out.println("--- THONG TIN SV1 (Truyen san tham so) ---");
        sv1.output();

        // Yêu cầu 2.2: Tạo sv2 bằng hàm tạo không tham số
        Student sv2 = new Student();
        System.out.println("\n--- THONG TIN SV2 (Gia tri mac dinh khi chua nhap) ---");
        // Gọi output() ngay để quan sát giá trị mặc định (null và 0)
        sv2.output(); 

        // Sau đó gọi input() để nhập từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- NHAP THONG TIN CHO SV2 ---");
        sv2.input(sc);

        // Gọi output() lần nữa để xem sau khi nhập
        System.out.println("\n--- THONG TIN SV2 (Sau khi nhap) ---");
        sv2.output();
        
        /*
         * Lưu ý kỹ thuật (Thử nghiệm): 
         * Nếu trong Student.java, bạn xóa chữ "this." đi (ví dụ viết name = name;)
         * thì tham số cục bộ sẽ che khuất (shadow) thuộc tính của lớp.
         * Kết quả là thuộc tính không nhận được giá trị và vẫn in ra null.
         */
    }
}