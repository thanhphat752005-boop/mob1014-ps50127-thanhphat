package com.fpoly.lab3;

import java.util.Scanner;

public class XuLyMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        // Nhập số phần tử n, dùng do...while bắt nhập lại nếu n <= 0
        do {
            n = sc.nextInt();
        } while (n <= 0);
        
        // Khai báo mảng
        int[] a = new int[n];
        
        // Dùng vòng lặp for nhập giá trị cho từng phần tử
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        
        // 1. Xuất toàn bộ mảng bằng vòng lặp for-each
        System.out.print("Mang vua nhap: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        // 2. Xuất các phần tử có giá trị chẵn
        System.out.print("Cac phan tu chan: ");
        boolean coPhanTuChan = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                continue; // Dùng continue để bỏ qua phần tử lẻ
            }
            System.out.print(a[i] + " ");
            coPhanTuChan = true;
        }
        if (!coPhanTuChan) {
            System.out.print("Khong co phan tu chan");
        }
        System.out.println();
        
        // 3. Tính tổng các phần tử chia hết cho 4
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 4 == 0) {
                tong += a[i];
            }
        }
        System.out.println("Tong cac so chia het cho 4: " + tong);
        
        // 4. Tìm giá trị lớn nhất trong mảng
        int max = a[0]; 
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Gia tri lon nhat: " + max);
        
        sc.close();
    }
}