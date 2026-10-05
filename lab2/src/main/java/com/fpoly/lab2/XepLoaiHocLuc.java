package com.fpoly.lab2;

import java.util.Scanner;

public class XepLoaiHocLuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập lần lượt điểm 3 môn Toán, Lý, Hóa
        double toan = sc.nextDouble();
        double ly = sc.nextDouble();
        double hoa = sc.nextDouble();
        
        // Kiểm tra dữ liệu hợp lệ
        if (toan < 0 || toan > 10 || ly < 0 || ly > 10 || hoa < 0 || hoa > 10) {
            System.out.println("Diem khong hop le");
            return; // Kết thúc chương trình
        }
        
        // Tính điểm trung bình (Toán nhân hệ số 2, chia cho 4)
        double dtb = (toan * 2 + ly + hoa) / 4;
        
        // In điểm trung bình làm tròn 2 chữ số thập phân
        System.out.printf("Diem trung binh: %.2f\n", dtb);
        
        // Xếp loại học lực
        System.out.print("Xep loai: ");
        if (dtb >= 8.0) {
            System.out.println("Gioi");
        } else if (dtb >= 6.5) {
            System.out.println("Kha");
        } else if (dtb >= 5.0) {
            System.out.println("Trung binh");
        } else {
            System.out.println("Yeu");
        }
        
        sc.close();
    }
}