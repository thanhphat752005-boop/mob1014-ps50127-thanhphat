package com.fpoly.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SapXepLaptop {
    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();

        // Khởi tạo danh sách từ dữ liệu mẫu
        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));

        // --------------------------------------------------------
        // Yêu cầu 1: Sắp xếp theo tên tăng dần bằng Bubble Sort
        // --------------------------------------------------------
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                String name1 = list.get(j).getName();
                String name2 = list.get(j + 1).getName();
                
                // So sánh tên (không phân biệt hoa thường), nếu name1 > name2 thì hoán đổi
                if (name1.compareToIgnoreCase(name2) > 0) {
                    // Dùng Collections.swap để hoán đổi 2 phần tử trong ArrayList
                    Collections.swap(list, j, j + 1);
                    
                    // Cách 2 (Dùng get và set với biến tạm):
                    // Laptop temp = list.get(j);
                    // list.set(j, list.get(j + 1));
                    // list.set(j + 1, temp);
                }
            }
        }

        System.out.println("=== SAP XEP THEO TEN (A-Z) ===");
        for (Laptop laptop : list) {
            laptop.output();
        }

        // --------------------------------------------------------
        // Yêu cầu 2: Sắp xếp theo giá giảm dần bằng Collections
        // --------------------------------------------------------
        // Bước 1: Khởi tạo Comparator so sánh giá TĂNG dần
        Comparator<Laptop> comp = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop l1, Laptop l2) {
                // Dùng Double.compare để so sánh 2 số thực
                return Double.compare(l1.getPrice(), l2.getPrice());
            }
        };

        // Bước 2: Sắp xếp mảng theo giá tăng dần
        Collections.sort(list, comp);
        
        // Bước 3: Đảo ngược danh sách để thành giá GIẢM dần
        Collections.reverse(list);

        System.out.println("=== SAP XEP THEO GIA GIAM DAN ===");
        for (Laptop laptop : list) {
            laptop.output();
        }
    }
}