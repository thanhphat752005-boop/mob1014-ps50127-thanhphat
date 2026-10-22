package com.fpoly.lab8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KiemTraSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id, name, phone, email;

        // 1. Nhập và kiểm tra Mã SV
        do {
            System.out.print("Nhap Ma SV: ");
            id = sc.nextLine();
            if (!id.matches("^SV[0-9]{3}$")) {
                System.out.println("Ma SV phai co dang SVxxx (x la chu so)");
            }
        } while (!id.matches("^SV[0-9]{3}$"));

        // 2. Nhập và kiểm tra Họ tên
        do {
            System.out.print("Nhap Ho ten: ");
            name = sc.nextLine();
            if (!name.matches("^[a-zA-Z ]+$")) {
                System.out.println("Ho ten chi duoc chua chu cai va khoang trang");
            }
        } while (!name.matches("^[a-zA-Z ]+$"));

        // 3. Nhập và kiểm tra Số điện thoại (sử dụng Pattern và Matcher)
        Pattern phonePattern = Pattern.compile("^0[0-9]{9}$");
        Matcher phoneMatcher;
        do {
            System.out.print("Nhap So dien thoai: ");
            phone = sc.nextLine();
            phoneMatcher = phonePattern.matcher(phone);
            if (!phoneMatcher.matches()) {
                System.out.println("So dien thoai phai bat dau bang 0 va co 10 chu so");
            }
        } while (!phoneMatcher.matches());

        // 4. Nhập và kiểm tra Email
        do {
            System.out.print("Nhap Email: ");
            email = sc.nextLine();
            if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                System.out.println("Email khong dung dinh dang");
            }
        } while (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"));

        // Xuất thông tin hợp lệ
        System.out.println("\n=== THONG TIN SINH VIEN HOP LE ===");
        System.out.println("Ma SV: " + id);
        System.out.println("Ho ten: " + name);
        System.out.println("So dien thoai: " + phone);
        System.out.println("Email: " + email);
    }
}