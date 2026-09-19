package com.mycompany.lab1;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Khai báo hằng số PI (theo đúng nguyên văn yêu cầu đề bài)
        final double PI = 3.14159;
        
        // 1. Nhập chiều dài, chiều rộng
        System.out.print("Nhập chiều dài: ");
        double chieuDai = sc.nextDouble();
        
        System.out.print("Nhập chiều rộng: ");
        double chieuRong = sc.nextDouble();
        
        // 2. Tính chu vi và diện tích
        double chuVi = 2 * (chieuDai + chieuRong);
        double dienTich = chieuDai * chieuRong;
        
        // 3. In kết quả ra màn hình theo đúng định dạng
        System.out.println("Chu vi hinh chu nhat: " + chuVi);
        System.out.println("Dien tich hinh chu nhat: " + dienTich);
        
        sc.close();
    }
}