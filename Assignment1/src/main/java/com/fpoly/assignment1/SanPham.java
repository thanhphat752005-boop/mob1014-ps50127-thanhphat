package com.fpoly.assignment1;

import java.util.Scanner;

public class SanPham {
    protected String maSP;
    protected String tenSP;
    protected double donGia;
    protected int soLuong;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap ma san pham (Dinh dang SPXXX): ");
            maSP = sc.nextLine();
            if (maSP.matches("SP\\d{3}")) {
                break;
            } else {
                System.out.println("Loi: Ma san pham phai bat dau bang 'SP' va theo sau la 3 so (VD: SP001).");
            }
        }
        
        System.out.print("Nhap ten san pham: ");
        tenSP = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
    }

    public void Xuat() {
        System.out.printf("Ma SP: %s | Ten SP: %s | Don gia: %.2f | So luong: %d | Thanh tien: %.2f\n", 
                          maSP, tenSP, donGia, soLuong, thanhTien());
    }

    public double thanhTien() {
        return soLuong * donGia;
    }

    public void capNhat() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham moi: ");
        this.tenSP = sc.nextLine();
        System.out.print("Nhap don gia moi: ");
        this.donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong moi: ");
        this.soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Cap nhat thanh cong!");
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }
}