package com.fpoly.lab3;

import java.util.Scanner;

public class NhapSoHopLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so;
        int soLanNhap = 0; // Biến đếm số lần đã nhập
        
        // Dùng vòng lặp do...while vì lệnh nhập phải chạy ít nhất một lần
        do {
            // Không dùng println ở đây để người dùng nhập trên cùng 1 dòng
            System.out.print("Nhap so: "); 
            so = sc.nextInt();
            soLanNhap++; // Tăng biến đếm số lần nhập lên 1
            
            // Điều kiện hợp lệ: so > 0 && so % 3 == 0 && so % 5 == 0
            // Nếu không thỏa mãn thì in thông báo yêu cầu nhập lại
            if (!(so > 0 && so % 3 == 0 && so % 5 == 0)) {
                System.out.println("So khong hop le, moi nhap lai!");
            }
            
        // Điều kiện lặp là phủ định của điều kiện hợp lệ (áp dụng định luật De Morgan)
        } while (so <= 0 || so % 3 != 0 || so % 5 != 0); 
        
        // In ra màn hình khi số nhập vào là hợp lệ
        System.out.println("So hop le: " + so + " (sau " + soLanNhap + " lan nhap)");
        
        sc.close();
    }
}