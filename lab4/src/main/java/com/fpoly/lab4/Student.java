package com.fpoly.lab4;

import java.util.Scanner;

public class Student {
    // Đổi toàn bộ thuộc tính sang private
    private String id;
    private String name;
    private int age;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        // Gọi setter để kiểm soát dữ liệu ngay từ lúc khởi tạo
        setAge(age);
        setGpa(gpa);
    }

    // --- GETTER & SETTER ---
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Kiểm tra điều kiện tuổi
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuoi khong hop le");
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        // Kiểm tra điều kiện điểm
        if (gpa >= 0 && gpa <= 10) {
            this.gpa = gpa;
        } else {
            System.out.println("GPA khong hop le");
        }
    }

    // --- CÁC PHƯƠNG THỨC CŨ (Giữ nguyên) ---
    // Vì input, output, rank nằm bên trong lớp nên vẫn truy cập trực tiếp được id, name, age, gpa
    public void input(Scanner sc) {
        System.out.print("Nhap ID: ");
        id = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.print("Nhap GPA: ");
        gpa = sc.nextDouble();
        sc.nextLine(); 
    }

    public String rank() {
        if (gpa >= 9.0) return "Excellent";
        else if (gpa >= 8.0) return "Very Good";
        else if (gpa >= 6.5) return "Good";
        else if (gpa >= 5.0) return "Average";
        else return "Fail";
    }

    public void output() {
        System.out.printf("ID: %s | Ho ten: %s | Tuoi: %d | GPA: %.2f | Xep loai: %s\n", 
                id, name, age, gpa, rank());
    }
}