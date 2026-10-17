package com.fpoly.lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyHinhTru {
    public static void main(String[] args) {
        // Khai báo List và thêm sẵn 5 hình trụ
        List<Cylinder> list = new ArrayList<>();
        list.add(new Cylinder(1.0, "Do", 2.0));
        list.add(new Cylinder(2.0, "Xanh", 3.0));
        list.add(new Cylinder(1.5, "Vang", 4.0));
        list.add(new Cylinder(3.0, "Do", 1.0));
        list.add(new Cylinder(2.5, "Xanh", 2.0));

        // 1. Xuất danh sách bằng vòng lặp for-each
        System.out.println("=== DANH SACH HINH TRU ===");
        for (Cylinder c : list) {
            System.out.println(c);
        }

        // 2. Tính tổng thể tích của tất cả các hình trụ
        double tongTheTich = 0;
        for (Cylinder c : list) {
            tongTheTich += c.getVolume();
        }
        System.out.printf("Tong the tich: %.2f\n", tongTheTich);

        // 3. Tìm và xuất hình trụ có thể tích lớn nhất
        Cylinder maxCylinder = list.get(0);
        for (Cylinder c : list) {
            // Hình trụ số 3 và 4 có cùng thể tích nhưng không ảnh hưởng vì chỉ cập nhật khi lớn hơn hẳn (>)
            if (c.getVolume() > maxCylinder.getVolume()) {
                maxCylinder = c;
            }
        }
        System.out.println("Hinh tru co the tich lon nhat:");
        System.out.println(maxCylinder);

        // 4. Nhập một màu, xuất các hình trụ có màu đó (không phân biệt hoa thường)
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mau can tim: ");
        String searchColor = sc.nextLine();
        
        System.out.println("=== HINH TRU MAU " + searchColor.toUpperCase() + " ===");
        boolean found = false;
        
        for (Cylinder c : list) {
            // Đối tượng Cylinder gọi được getColor() vì thừa hưởng từ lớp cha Circle
            if (c.getColor().equalsIgnoreCase(searchColor)) {
                System.out.println(c);
                found = true;
            }
        }
        
        // Nếu không có thì in thông báo lỗi
        if (!found) {
            System.out.println("Khong co hinh tru mau " + searchColor);
        }
        
        sc.close();
    }
}