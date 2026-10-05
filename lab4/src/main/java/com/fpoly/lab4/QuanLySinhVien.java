package com.fpoly.lab4;

import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        // Nhập số lượng sinh viên n (bắt buộc > 0)
        do {
            System.out.print("Nhap so luong sinh vien: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("So luong phai lon hon 0. Vui long nhap lai!");
            }
        } while (n <= 0);
        
        // Xử lý trôi lệnh sau khi nhập số n trước khi gọi input() của Student
        sc.nextLine(); 

        // Khai báo mảng đối tượng
        Student[] ds = new Student[n];

        // Tạo và nhập thông tin cho từng sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("--- Nhap thong tin sinh vien thu " + (i + 1) + " ---");
            // BẮT BUỘC KHỞI TẠO ĐỐI TƯỢNG TRƯỚC KHI NHẬP để tránh NullPointerException
            ds[i] = new Student(); 
            ds[i].input(sc);
        }

        // 1. Xuất danh sách sinh viên vừa nhập
        System.out.println("\n=== DANH SACH SINH VIEN ===");
        for (int i = 0; i < n; i++) {
            ds[i].output();
        }

        // 2. Tìm và xuất sinh viên có GPA cao nhất
        // Giả sử sinh viên đầu tiên có GPA cao nhất
        Student maxSv = ds[0]; 
        for (int i = 1; i < n; i++) {
            // Chỉ cập nhật khi gặp GPA lớn hơn hẳn (>) để giữ sinh viên xuất hiện đầu tiên
            if (ds[i].getGpa() > maxSv.getGpa()) {
                maxSv = ds[i];
            }
        }
        System.out.println("\n=== SINH VIEN CO GPA CAO NHAT ===");
        maxSv.output();

        // 3. Sắp xếp danh sách theo GPA giảm dần bằng Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Dùng getGpa() để so sánh vì thuộc tính gpa đang là private
                if (ds[i].getGpa() < ds[j].getGpa()) {
                    // Hoán đổi tham chiếu của hai phần tử
                    Student tmp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = tmp;
                }
            }
        }

        System.out.println("\n=== DANH SACH SAU KHI SAP XEP GIAM DAN THEO GPA ===");
        for (int i = 0; i < n; i++) {
            ds[i].output();
        }
        
        /*
         * Lưu ý kỹ thuật quay video: 
         * Bạn hãy thử comment (ẩn) dòng "ds[i] = new Student();" trong vòng lặp nhập đi, 
         * chương trình sẽ báo lỗi NullPointerException khi chạy đến ds[i].input(sc) 
         * vì mảng lúc này chỉ mới tạo ra các ô chứa tham chiếu rỗng (null), chưa có đối tượng thực sự.
         */
    }
}