package com.fpoly.lab7;

public class FullTimeEmployee extends Employee {
    private double basicSalary;

    // Hàm tạo (Constructor)
    public FullTimeEmployee(String id, String name, double basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }

    // Getter và Setter cho basicSalary
    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Ghi đè phương thức tính lương (Lương chính thức = basicSalary)
    @Override
    public double getSalary() {
        return this.basicSalary;
    }

    // Ghi đè phương thức toString hiển thị thông tin
    @Override
    public String toString() {
        return String.format("[Chinh thuc] ID: %s | Ho ten: %s | Luong co ban: %.0f", 
                getId(), getName(), this.basicSalary);
    }
}