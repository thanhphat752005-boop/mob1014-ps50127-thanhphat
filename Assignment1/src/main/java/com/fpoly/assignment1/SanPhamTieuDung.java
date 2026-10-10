package com.fpoly.assignment1;

import java.util.Scanner;

public class SanPhamTieuDung extends SanPham {
    private Double giamGia;
    private String hanSuDung;

    public SanPhamTieuDung() {
    }

    @Override
    public void Nhap() {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap han su dung: ");
        hanSuDung = sc.nextLine();
        System.out.print("Nhap so tien giam gia: ");
        giamGia = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("   -> Han su dung: " + hanSuDung + " | Giam gia: " + giamGia + " | Thanh tien thuc te: " + getThanhTien());
    }

    public double getThanhTien() {
        return super.thanhTien() - (giamGia != null ? giamGia : 0);
    }
}