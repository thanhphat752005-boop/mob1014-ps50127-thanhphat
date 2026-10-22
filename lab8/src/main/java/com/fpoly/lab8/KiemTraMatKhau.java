package com.fpoly.lab8;

import java.util.Scanner;

public class KiemTraMatKhau {

    // Phương thức static kiemTra ném InvalidPasswordException
    public static void kiemTra(String pw) throws InvalidPasswordException {
        // Quy tắc 1: Tối thiểu 8 ký tự
        if (pw.length() < 8) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 8 ky tu");
        }

        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        int countSpecial = 0;

        // Dùng MỘT vòng lặp duyệt từng ký tự của mật khẩu
        for (int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);
            
            if (Character.isUpperCase(c)) {
                countUpper++;
            } else if (Character.isLowerCase(c)) {
                countLower++;
            } else if (Character.isDigit(c)) {
                countDigit++;
            } else if ("!@#$%^&*".indexOf(c) >= 0) { // Kiểm tra ký tự đặc biệt theo lưu ý kỹ thuật
                countSpecial++;
            }
        }

        // Kiểm tra các quy tắc còn lại theo đúng thứ tự ưu tiên
        // Quy tắc 2: Ít nhất 2 chữ hoa
        if (countUpper < 2) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 2 chu hoa");
        }
        // Quy tắc 3: Ít nhất 2 chữ thường
        if (countLower < 2) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 2 chu thuong");
        }
        // Quy tắc 4: Ít nhất 3 chữ số
        if (countDigit < 3) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 3 chu so");
        }
        // Quy tắc 5: Ít nhất 1 ký tự đặc biệt
        if (countSpecial < 1) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 1 ky tu dac biet (!@#$%^&*)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;

        // Vòng lặp bắt nhập mật khẩu cho đến khi hợp lệ
        while (true) {
            System.out.print("Nhap mat khau: ");
            password = sc.nextLine();
            
            try {
                // Gọi phương thức kiemTra()
                kiemTra(password);
                
                // Nếu không có ngoại lệ bị ném ra, mật khẩu hợp lệ
                System.out.println("Mat khau hop le!");
                break; // Thoát vòng lặp
                
            } catch (InvalidPasswordException e) {
                // Bắt ngoại lệ và in ra thông báo lỗi
                System.out.println("Loi: " + e.getMessage());
            }
        }
        sc.close();
    }
}