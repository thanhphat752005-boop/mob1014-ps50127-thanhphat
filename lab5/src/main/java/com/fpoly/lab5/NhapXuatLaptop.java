package com.fpoly.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhapXuatLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();
        String tiepTuc;

        // Vòng lặp nhập danh sách laptop
        do {
            Laptop laptop = new Laptop(); // Khởi tạo đối tượng bên trong vòng lặp
            laptop.input(sc);
            list.add(laptop);

            System.out.print("Tiep tuc nhap? (y/n): ");
            tiepTuc = sc.nextLine();
        } while (tiepTuc.equalsIgnoreCase("y")); // Dừng vòng lặp nếu nhập khác "y" hoặc "Y"

        // Xuất số lượng và danh sách laptop bằng vòng lặp for-each
        System.out.println();
        System.out.printf("=== DANH SACH LAPTOP (%d may) ===\n", list.size());
        for (Laptop laptop : list) {
            laptop.output();
        }
    }
}