package com.fpoly.lab3;

import java.util.Scanner;

public class TrungBinhChia3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập vào số nguyên dương n
        int n = sc.nextInt();
        
        // Kiểm tra n <= 0
        if (n <= 0) {
            System.out.println("n phai la so nguyen duong");
            sc.close();
            return; // Kết thúc chương trình
        }
        
        int tong = 0;
        int dem = 0;
        StringBuilder dsSo = new StringBuilder();
        
        // Duyệt các số từ 1 đến n
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                dsSo.append(i).append(" "); // Lưu danh sách các số
                tong += i;                  // Cộng dồn vào tổng
                dem++;                      // Tăng biến đếm
            }
        }
        
        // Kiểm tra xem có số nào chia hết cho 3 không để tránh lỗi chia cho 0
        if (dem == 0) {
            System.out.println("Khong co so nao chia het cho 3");
        } else {
            // In kết quả
            System.out.println("Cac so chia het cho 3: " + dsSo.toString().trim());
            System.out.println("Tong: " + tong);
            
            // Ép kiểu sang double trước khi chia và làm tròn 2 chữ số thập phân
            double trungBinh = (double) tong / dem;
            System.out.printf("Trung binh cong: %.2f\n", trungBinh);
        }
        
        sc.close();
    }
}