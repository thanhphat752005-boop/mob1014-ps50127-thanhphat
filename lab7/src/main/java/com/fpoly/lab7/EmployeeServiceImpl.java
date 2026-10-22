package com.fpoly.lab7;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    // Thuộc tính list để private, khởi tạo bằng ArrayList[cite: 8]
    private List<Employee> list = new ArrayList<>();

    @Override
    public boolean add(Employee e) {
        // Kiểm tra xem ID đã tồn tại chưa (không phân biệt hoa thường)[cite: 8]
        if (findById(e.getId()) != null) {
            return false; // Trùng ID thì không thêm và trả về false[cite: 8]
        }
        list.add(e);
        return true; // Thêm vào danh sách và trả về true[cite: 8]
    }

    @Override
    public Employee findById(String id) {
        for (Employee e : list) {
            // So sánh ID không phân biệt hoa thường[cite: 8]
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null; // Không tìm thấy thì trả về null[cite: 8]
    }

    @Override
    public List<Employee> getAll() {
        return list; // Trả về danh sách nhân viên[cite: 8]
    }

    @Override
    public double getTotalSalary() {
        double total = 0;
        for (Employee e : list) {
            total += e.getSalary();
        }
        return total; // Trả về tổng lương của toàn bộ nhân viên[cite: 8]
    }
}