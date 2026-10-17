package com.fpoly.lab6;

// Khai báo lớp Cylinder kế thừa Circle
public class Cylinder extends Circle {
    // Bổ sung thuộc tính private
    private double height;

    // Hàm tạo gọi super(...) để khởi tạo phần thuộc tính của lớp cha
    public Cylinder(double radius, String color, double height) {
        super(radius, color); // Lệnh super(...) phải là câu lệnh đầu tiên
        setHeight(height);    // Gọi setHeight() để kiểm tra tính hợp lệ
    }

    public double getHeight() {
        return height;
    }

    // Chỉ nhận height > 0, ngược lại in thông báo lỗi và giữ nguyên giá trị
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Chieu cao khong hop le");
        }
    }

    // Ghi đè getArea() để trả về diện tích toàn phần của hình trụ
    @Override
    public double getArea() {
        // DienTichToanPhan = 2 * PI * radius * height + 2 * PI * radius * radius
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    // getVolume() trả về thể tích, bắt buộc phải dùng super.getArea() * height
    public double getVolume() {
        // super.getArea() gọi phiên bản diện tích đáy của Circle 
        // Thay vì gọi getArea() của Cylinder (diện tích toàn phần) sẽ cho kết quả sai
        return super.getArea() * height;
    }

    // Ghi đè toString() theo định dạng mẫu
    @Override
    public String toString() {
        // Cylinder truy cập trực tiếp được radius, color vì chúng là protected ở lớp cha
        return String.format("Hinh tru [ban kinh=%.2f, mau=%s, chieu cao=%.2f, dien tich toan phan=%.2f, the tich=%.2f]", 
                             radius, color, height, getArea(), getVolume());
    }
}