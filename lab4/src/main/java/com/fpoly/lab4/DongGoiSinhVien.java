package com.fpoly.lab4;

public class DongGoiSinhVien {
    public static void main(String[] args) {
        // 1. Tạo đối tượng sv
        Student sv = new Student("PS002", "Tran Thi Binh", 20, 7.0);

        // 2. Thử gán GPA sai và in ra GPA hiện tại
        sv.setGpa(12);
        System.out.printf("GPA hien tai: %.2f\n", sv.getGpa());

        // 3. Gán lại GPA đúng và xuất thông tin
        sv.setGpa(9.2);
        sv.output();
        
        /* 
         * Lưu ý kỹ thuật cho video: 
         * Nếu bạn gõ "sv.gpa = 15;" tại đây, chương trình sẽ báo lỗi biên dịch
         * "gpa has private access in Student" vì thuộc tính gpa đã bị giấu đi (private), 
         * không cho phép can thiệp trực tiếp từ bên ngoài mà bắt buộc phải qua setGpa().
         */
    }
}