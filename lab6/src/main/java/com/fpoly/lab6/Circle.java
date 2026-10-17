package com.fpoly.lab6;

public class Circle {
    // Khai báo hai thuộc tính có đặc tả protected
    protected double radius;
    protected String color;

    // Hàm tạo không tham số gán mặc định
    public Circle() {
        this.radius = 1.0;
        this.color = "Trang";
    }

    // Hàm tạo có tham số
    public Circle(double radius, String color) {
        this.color = color;
        // Gọi setRadius() để kiểm tra dữ liệu
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    // Chỉ nhận radius > 0, ngược lại in thông báo và giữ nguyên giá trị cũ
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Ban kinh khong hop le");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Trả về chu vi
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Trả về diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Ghi đè toString() dùng String.format để làm tròn 2 chữ số thập phân
    @Override
    public String toString() {
        return String.format("Hinh tron [ban kinh=%.2f, mau=%s, chu vi=%.2f, dien tich=%.2f]", 
                             radius, color, getPerimeter(), getArea());
    }
}