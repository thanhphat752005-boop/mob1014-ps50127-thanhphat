package com.fpoly.assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<SanPham> danhSachSP = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n--- Y10: MENU CHUONG TRINH ---");
            System.out.println("1. Nhap thong tin san pham (Y1 & Y5)");
            System.out.println("2. Hien thi thong tin san pham (Y2 & Y3)");
            System.out.println("3. Cap nhat thong tin san pham (Y4)");
            System.out.println("4. Tim kiem san pham (Y6)");
            System.out.println("5. Xoa san pham trong danh sach (Y7)");
            System.out.println("6. Sap xep danh sach san pham theo ten (Y8)");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    System.out.print("Nhap loai san pham (1: Dien tu, 2: Tieu dung, Khac: Mac dinh): ");
                    int loai = Integer.parseInt(sc.nextLine());
                    SanPham sp;
                    if (loai == 1) {
                        sp = new SanPhamDienTu();
                    } else if (loai == 2) {
                        sp = new SanPhamTieuDung();
                    } else {
                        sp = new SanPham();
                    }
                    sp.Nhap();
                    danhSachSP.add(sp);
                    break;

                case 2:
                    System.out.println("--- DANH SACH SAN PHAM ---");
                    for (SanPham s : danhSachSP) {
                        s.Xuat();
                    }
                    break;

                case 3:
                    System.out.print("Nhap ma san pham can cap nhat: ");
                    String maCN = sc.nextLine();
                    boolean foundCN = false;
                    for (SanPham s : danhSachSP) {
                        if (s.getMaSP().equalsIgnoreCase(maCN)) {
                            s.capNhat();
                            foundCN = true;
                            break;
                        }
                    }
                    if (!foundCN) System.out.println("Khong tim thay san pham!");
                    break;

                case 4:
                    System.out.print("Nhap ten san pham can tim: ");
                    String tenTimKiem = sc.nextLine();
                    boolean foundTK = false;
                    for (SanPham s : danhSachSP) {
                        if (s.getTenSP().toLowerCase().contains(tenTimKiem.toLowerCase())) {
                            s.Xuat();
                            foundTK = true;
                        }
                    }
                    if (!foundTK) System.out.println("Khong tim thay san pham phu hop.");
                    break;

                case 5:
                    System.out.print("Nhap ma san pham can xoa: ");
                    String maXoa = sc.nextLine();
                    boolean removed = danhSachSP.removeIf(s -> s.getMaSP().equalsIgnoreCase(maXoa));
                    if (removed) {
                        System.out.println("Da xoa san pham thanh cong!");
                    } else {
                        System.out.println("Khong tim thay ma san pham de xoa!");
                    }
                    break;

                case 6:
                    Collections.sort(danhSachSP, new Comparator<SanPham>() {
                        @Override
                        public int compare(SanPham sp1, SanPham sp2) {
                            return sp1.getTenSP().compareToIgnoreCase(sp2.getTenSP());
                        }
                    });
                    System.out.println("Da sap xep danh sach theo ten!");
                    break;

                case 0:
                    System.out.println("Dang thoat chuong trinh...");
                    break;

                default:
                    System.out.println("Chuc nang khong hop le!");
            }
        } while (chon != 0);
    }
}