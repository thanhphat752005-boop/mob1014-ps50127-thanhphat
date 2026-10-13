package com.fpoly.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimKiemLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();

        // Khởi tạo danh sách từ dữ liệu mẫu
        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));

        // Yêu cầu 1: Lọc theo khoảng giá
        System.out.print("Nhap gia min: ");
        double min = sc.nextDouble();
        System.out.print("Nhap gia max: ");
        double max = sc.nextDouble();

        if (min > max) {
            System.out.println("Khoang gia khong hop le");
        } else {
            System.out.printf("=== LAPTOP GIA TU %.0f DEN %.0f ===\n", min, max);
            boolean timThayGia = false; // Biến cờ để kiểm tra có tìm thấy hay không
            
            for (Laptop laptop : list) {
                if (laptop.getPrice() >= min && laptop.getPrice() <= max) {
                    laptop.output();
                    timThayGia = true;
                }
            }
            
            if (!timThayGia) {
                System.out.println("Khong tim thay laptop nao");
            }
        }

        // Xử lý trôi lệnh sau khi nhập số (nextDouble) để có thể nhập chuỗi (nextLine)
        sc.nextLine();

        // Yêu cầu 2: Tìm kiếm theo từ khóa
        System.out.print("Nhap tu khoa tim kiem: ");
        String keyword = sc.nextLine();

        System.out.printf("=== KET QUA TIM KIEM \"%s\" ===\n", keyword);
        boolean timThayTuKhoa = false; // Biến cờ để kiểm tra có tìm thấy hay không
        
        for (Laptop laptop : list) {
            // So sánh ID (bỏ qua hoa thường) HOẶC tên có chứa từ khóa (đưa cả 2 về chữ thường để so sánh)
            if (laptop.getId().equalsIgnoreCase(keyword) || 
                laptop.getName().toLowerCase().contains(keyword.toLowerCase())) {
                laptop.output();
                timThayTuKhoa = true;
            }
        }
        
        if (!timThayTuKhoa) {
            System.out.println("Khong tim thay laptop nao");
        }
    }
}