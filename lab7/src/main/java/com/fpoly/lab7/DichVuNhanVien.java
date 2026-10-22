package com.fpoly.lab7;

import java.util.List;

public class DichVuNhanVien {
    public static void main(String[] args) {
        // Khai báo service qua kiểu interface[cite: 9]
        EmployeeService service = new EmployeeServiceImpl();

        // 1. Thêm 4 nhân viên và in kết quả thành công/thất bại[cite: 9]
        Employee[] dsThem = {
            new FullTimeEmployee("FT01", "Nguyen Van An", 12000000),
            new PartTimeEmployee("PT01", "Tran Thi Binh", 80, 50000),
            new FullTimeEmployee("FT02", "Le Van Cuong", 15500000),
            new FullTimeEmployee("ft01", "Ngo Van Giang", 9000000)
        };

        for (Employee e : dsThem) {
            if (service.add(e)) {
                System.out.println("Them thanh cong: " + e.getId());
            } else {
                System.out.println("Them that bai, trung ID: " + e.getId());
            }
        }

        // 2. Tìm nhân viên có id pt01 và XX99, in kết quả[cite: 9]
        String[] dsTimKiem = {"pt01", "XX99"};
        for (String id : dsTimKiem) {
            Employee found = service.findById(id);
            if (found != null) {
                System.out.println("Tim thay: " + found.toString());
            } else {
                System.out.println("Khong tim thay nhan vien " + id);
            }
        }

        // 3. Xuất toàn bộ danh sách và tổng lương[cite: 9]
        System.out.println("=== DANH SACH NHAN VIEN ===");
        List<Employee> danhSach = service.getAll();
        for (Employee e : danhSach) {
            System.out.printf("%s -> Luong: %.0f\n", e.toString(), e.getSalary());
        }
        
        System.out.printf("Tong luong: %.0f\n", service.getTotalSalary());
    }
}