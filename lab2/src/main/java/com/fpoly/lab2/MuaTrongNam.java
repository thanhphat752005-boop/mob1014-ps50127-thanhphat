package com.fpoly.lab2;

import java.util.Scanner;

public class MuaTrongNam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập vào tháng (số nguyên)
        int thang = sc.nextInt();
        
        // Dùng switch...case với kỹ thuật gộp case
        switch (thang) {
            case 1: case 2: case 3:
                System.out.println("Thang " + thang + ": Mua xuan");
                break;
            case 4: case 5: case 6:
                System.out.println("Thang " + thang + ": Mua ha");
                break;
            case 7: case 8: case 9:
                System.out.println("Thang " + thang + ": Mua thu");
                break;
            case 10: case 11: case 12:
                System.out.println("Thang " + thang + ": Mua dong");
                break;
            default:
                System.out.println("Thang khong hop le");
                // Khối default xử lý mọi giá trị ngoài khoảng 1-12
        }
        
        sc.close();
    }
}