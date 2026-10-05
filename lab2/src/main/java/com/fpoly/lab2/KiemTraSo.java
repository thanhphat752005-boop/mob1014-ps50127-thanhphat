package com.fpoly.lab2;

import java.util.Scanner;

public class KiemTraSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập vào số nguyên n
        int n = sc.nextInt();
        
        // 1. Kiểm tra số chẵn/lẻ
        if (n % 2 == 0) {
            System.out.println(n + " la so chan");
        } else {
            System.out.println(n + " la so le");
        }
        
        // 2. Kiểm tra số âm/dương hay bằng 0
        if (n > 0) {
            System.out.println(n + " la so duong");
        } else if (n < 0) {
            System.out.println(n + " la so am");
        } else {
            System.out.println(n + " bang 0");
        }
        
        sc.close();
    }
}