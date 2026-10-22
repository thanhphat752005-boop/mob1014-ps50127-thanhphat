package com.fpoly.lab7;

public abstract class Employee {
    protected String id;
    protected String name;

    // Hàm tạo (Constructor)
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter và Setter cho id, name
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

    // Phương thức trừu tượng tính lương
    public abstract double getSalary();

    // Phương thức trừu tượng chuyển đổi thành chuỗi
    @Override
    public abstract String toString();
}