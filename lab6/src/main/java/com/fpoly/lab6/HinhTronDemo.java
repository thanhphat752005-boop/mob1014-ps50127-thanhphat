package com.fpoly.lab6;

public class HinhTronDemo {
    public static void main(String[] args) {
        // 1. Tạo c1 bằng hàm tạo không tham số, c2 bằng hàm tạo có tham số
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5, "Do");

        // 2. In cả hai bằng System.out.println() (không gọi toString() tường minh)
        System.out.println(c1);
        System.out.println(c2);

        // 3. Gọi c2.setRadius(-3) rồi in lại c2
        c2.setRadius(-3);
        System.out.println(c2);
    }
}