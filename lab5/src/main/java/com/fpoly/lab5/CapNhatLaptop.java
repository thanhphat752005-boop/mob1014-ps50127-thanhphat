package com.fpoly.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CapNhatLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();

        // Khởi tạo danh sách từ dữ liệu mẫu
        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));

        // Yêu cầu 1: Cập nhật tên theo ID
        System.out.print("Nhap ID can sua: ");
        String idUpdate = sc.nextLine();
        System.out.print("Nhap ten moi: ");
        String newName = sc.nextLine();

        boolean found = false;
        for (Laptop laptop : list) {
            if (laptop.getId().equalsIgnoreCase(idUpdate)) {
                laptop.setName(newName);
                found = true;
                System.out.println("Da cap nhat laptop " + idUpdate);
                break; // Tìm thấy thì dừng vòng lặp vì ID là duy nhất
            }
        }

        if (!found) {
            System.out.println("Khong tim thay laptop co ID " + idUpdate);
        }

        // Yêu cầu 2: Xóa tất cả laptop đã hết hàng (quantity == 0)
        int deletedCount = 0;
        // Duyệt ngược để tránh lỗi bỏ sót phần tử kề nhau khi dồn index
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).getQuantity() == 0) {
                list.remove(i);
                deletedCount++;
            }
        }
        System.out.println("Da xoa " + deletedCount + " laptop het hang");

        // Yêu cầu 3: Xuất danh sách sau khi cập nhật và xóa
        System.out.printf("=== DANH SACH SAU CAP NHAT (%d may) ===\n", list.size());
        for (Laptop laptop : list) {
            laptop.output();
        }
    }
}