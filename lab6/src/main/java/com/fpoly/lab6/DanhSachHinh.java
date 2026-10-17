package com.fpoly.lab6;

import java.util.ArrayList;
import java.util.List;

public class DanhSachHinh {
    public static void main(String[] args) {
        // Khai báo một danh sách chứa lớp cha Circle
        List<Circle> shapes = new ArrayList<>();
        
        // Thêm lần lượt 4 đối tượng vào danh sách
        shapes.add(new Circle(1, "Do"));
        shapes.add(new Cylinder(1, "Do", 2));
        shapes.add(new Circle(2, "Trang"));
        shapes.add(new Cylinder(2, "Xanh", 3));
        
        int soHinhTron = 0;
        int soHinhTru = 0;
        double tongTheTichHinhTru = 0;

        // Duyệt danh sách
        for (Circle s : shapes) {
            // 1. In kết quả toString() và giá trị getArea()
            System.out.printf("%s -> getArea() = %.2f\n", s.toString(), s.getArea());
            
            // 2 & 3. Đếm số lượng và tính tổng thể tích
            // Lưu ý: Phải kiểm tra instanceof Cylinder trước vì mọi Cylinder đều là Circle
            if (s instanceof Cylinder) {
                soHinhTru++;
                // Phải ép kiểu (Cylinder) s để gọi được getVolume() vì biến s khai báo kiểu Circle
                tongTheTichHinhTru += ((Cylinder) s).getVolume();
            } else if (s instanceof Circle) {
                soHinhTron++;
            }
        }
        
        // In kết quả thống kê ra màn hình
        System.out.println("So hinh tron: " + soHinhTron);
        System.out.println("So hinh tru: " + soHinhTru);
        System.out.printf("Tong the tich cac hinh tru: %.2f\n", tongTheTichHinhTru);
    }
}