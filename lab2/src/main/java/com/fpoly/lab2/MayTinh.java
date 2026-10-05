package com.fpoly.lab2;

import java.util.Scanner;

public class MayTinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập lần lượt số thực a, số thực b và ký tự phép toán op
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);
        
        switch (op) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f\n", a, b, a + b);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f\n", a, b, a - b);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f\n", a, b, a * b);
                break;
            case '/':
                // Kiểm tra chia cho 0 trước khi thực hiện phép tính
                if (b == 0) {
                    System.out.println("Khong the chia cho 0");
                } else {
                    System.out.printf("%.2f / %.2f = %.2f\n", a, b, a / b);
                }
                break;
            default:
                // Ký tự khác 4 phép toán trên
                System.out.println("Phep toan khong hop le");
        }
        
        sc.close();
    }
}