package com.mycompany.lab1;

import java.util.Scanner;

public class NhapHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập họ tên
        System.out.print("Nhập họ tên: ");
        String hoTen = sc.nextLine();

        // 2. Nhập năm sinh
        System.out.print("Nhập năm sinh: ");
        int namSinh = sc.nextInt();

        // 3. Tính tuổi
        int tuoi = 2026 - namSinh;

        // 4. In kết quả ra màn hình theo đúng định dạng
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
    }
}