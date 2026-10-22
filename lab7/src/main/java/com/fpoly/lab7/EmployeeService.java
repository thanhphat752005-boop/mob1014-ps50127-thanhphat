package com.fpoly.lab7;

import java.util.List;

public interface EmployeeService {
    boolean add(Employee e);
    Employee findById(String id);
    List<Employee> getAll();
    double getTotalSalary();
}