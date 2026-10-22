package com.fpoly.lab7;

public class PartTimeEmployee extends Employee {
    private int workHours;
    private double salaryPerHour;

    // Hàm tạo (Constructor)
    public PartTimeEmployee(String id, String name, int workHours, double salaryPerHour) {
        super(id, name);
        this.workHours = workHours;
        this.salaryPerHour = salaryPerHour;
    }

    // Getter và Setter
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    // Ghi đè phương thức tính lương (Lương bán thời gian = workHours * salaryPerHour)
    @Override
    public double getSalary() {
        return this.workHours * this.salaryPerHour;
    }

    // Ghi đè phương thức toString hiển thị thông tin
    @Override
    public String toString() {
        return String.format("[Ban thoi gian] ID: %s | Ho ten: %s | So gio: %d | Luong/gio: %.0f", 
                getId(), getName(), this.workHours, this.salaryPerHour);
    }
}