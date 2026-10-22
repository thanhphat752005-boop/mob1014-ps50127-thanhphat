package com.fpoly.lab7;

public class NhanVienDemo {
    public static void main(String[] args) {
        // Tạo đối tượng nhân viên FullTimeEmployee
        Employee nv1 = new FullTimeEmployee("FT01", "Nguyen Van An", 12000000);
        
        // Tạo đối tượng nhân viên PartTimeEmployee
        Employee nv2 = new PartTimeEmployee("PT01", "Tran Thi Binh", 80, 50000);

        // In thông tin của nhân viên thứ nhất (FullTime)
        System.out.println(nv1.toString());
        System.out.printf("Luong: %.0f\n", nv1.getSalary());

        // In thông tin của nhân viên thứ hai (PartTime)
        System.out.println(nv2.toString());
        System.out.printf("Luong: %.0f\n", nv2.getSalary());
    }
}