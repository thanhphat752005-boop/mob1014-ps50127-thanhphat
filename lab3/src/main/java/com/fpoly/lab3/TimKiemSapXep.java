package com.fpoly.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiemSapXep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        // Nhập số phần tử n (n > 0)
        System.out.print("Nhap so phan tu n: ");
        do {
            n = sc.nextInt();
            if (n <= 0) {
                System.out.print("Nhap lai n (> 0): ");
            }
        } while (n <= 0);
        
        // Khai báo và nhập giá trị cho mảng
        int[] a = new int[n];
        System.out.println("Nhap gia tri cho " + n + " phan tu:");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        
        // Tạo bản sao của mảng ban đầu trước khi sắp xếp để dùng cho Arrays.sort() ở câu 3
        int[] b = Arrays.copyOf(a, a.length);
        
        // 1. Nhập giá trị x và tìm kiếm tuyến tính (phải thực hiện TRƯỚC khi sắp xếp)
        System.out.print("Nhap gia tri x can tim: ");
        int x = sc.nextInt();
        
        StringBuilder viTri = new StringBuilder();
        boolean timThay = false; // Dùng cờ để kiểm tra có tìm thấy hay không
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                viTri.append(i).append(" ");
                timThay = true;
            }
        }
        
        // Không dùng break để in ra tất cả các vị trí xuất hiện
        if (!timThay) {
            System.out.println("Vi tri cua " + x + " trong mang: Khong tim thay");
        } else {
            System.out.println("Vi tri cua " + x + " trong mang: " + viTri.toString().trim());
        }
        
        // 2. Tự viết thuật toán Bubble Sort để sắp xếp mảng a giảm dần
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) { // Đổi chỗ nếu phần tử trước nhỏ hơn phần tử sau (giảm dần)
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Mang giam dan (Bubble Sort): " + Arrays.toString(a));
        
        // 3. Dùng Arrays.sort() trên bản sao b của mảng ban đầu để sắp xếp tăng dần
        Arrays.sort(b);
        System.out.println("Mang tang dan (Arrays.sort): " + Arrays.toString(b));
        
        sc.close();
    }
}