package com.fpoly.assignment1;

import java.util.Scanner;

public class SanPhamDienTu extends SanPham {
    private String ngayBaoHanh; 

    public SanPhamDienTu() {
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh: ");
        ngayBaoHanh = sc.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("   -> Bao hanh: " + getBaoHanh());
    }

    public String getBaoHanh() {
        return ngayBaoHanh;
    }
}