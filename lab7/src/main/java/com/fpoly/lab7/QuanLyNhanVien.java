package com.fpoly.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class QuanLyNhanVien {
    public static void main(String[] args) {
        // Khởi tạo danh sách nhân viên
        List<Employee> list = new ArrayList<>();
        
        // Thêm 5 nhân viên theo bảng dữ liệu mẫu
        list.add(new FullTimeEmployee("FT01", "Nguyen Van An", 12000000));
        list.add(new PartTimeEmployee("PT01", "Tran Thi Binh", 80, 50000));
        list.add(new FullTimeEmployee("FT02", "Le Van Cuong", 15500000));
        list.add(new PartTimeEmployee("PT02", "Pham Thi Dung", 120, 60000));
        list.add(new PartTimeEmployee("PT03", "Hoang Van Em", 200, 90000));

        System.out.println("=== DANH SACH NHAN VIEN ===");
        
        double tongQuyLuong = 0;
        Employee nhanVienLuongCaoNhat = list.get(0);

        // Duyệt danh sách, in thông tin, tính tổng quỹ lương và tìm nhân viên lương cao nhất
        for (Employee e : list) {
            double luong = e.getSalary();
            
            // In toString() và lương
            System.out.printf("%s -> Luong: %.0f\n", e.toString(), luong);
            
            // Cộng dồn vào tổng quỹ lương
            tongQuyLuong += luong;
            
            // Kiểm tra và cập nhật nhân viên có lương cao nhất
            if (luong > nhanVienLuongCaoNhat.getSalary()) {
                nhanVienLuongCaoNhat = e;
            }
        }

        // In tổng quỹ lương và nhân viên lương cao nhất[cite: 5]
        System.out.printf("Tong quy luong: %.0f\n", tongQuyLuong);
        System.out.printf("Nhan vien luong cao nhat: %s -> Luong: %.0f\n", 
                nhanVienLuongCaoNhat.toString(), nhanVienLuongCaoNhat.getSalary());

        // Sắp xếp danh sách theo lương giảm dần bằng Collections.sort() và Comparator[cite: 5]
        System.out.println("=== SAP XEP THEO LUONG GIAM DAN ===");
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee a, Employee b) {
                // Đảo tham số b và a để sắp xếp giảm dần[cite: 5]
                return Double.compare(b.getSalary(), a.getSalary()); 
            }
        });

        // Xuất lại danh sách sau khi đã sắp xếp
        for (Employee e : list) {
            System.out.printf("%s -> Luong: %.0f\n", e.toString(), e.getSalary());
        }
    }
}