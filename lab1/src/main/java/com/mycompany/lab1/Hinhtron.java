package com.mycompany.lab1;

import java.util.Scanner;

public class Hinhtron { // Đã sửa chữ t thành viết thường cho khớp với tên file
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Khai báo hằng số PI
        final double PI = 3.14159;
        
        // 1. Nhập bán kính
        System.out.print("Nhập bán kính: ");
        double banKinh = sc.nextDouble();
        
        // 2. Tính toán chu vi và diện tích
        double chuVi = 2 * PI * banKinh;
        double dienTich = PI * banKinh * banKinh;
        
        // 3. In kết quả và làm tròn 2 chữ số thập phân bằng printf
        System.out.printf("Chu vi hinh tron: %.2f\n", chuVi);
        System.out.printf("Dien tich hinh tron: %.2f\n", dienTich);
    }
} // Đã bổ sung dấu ngoặc đóng class