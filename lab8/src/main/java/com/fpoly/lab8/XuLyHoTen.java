package com.fpoly.lab8;

import java.util.Scanner;

public class XuLyHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen = sc.nextLine();

        // Kiểm tra chuỗi rỗng sau khi xóa khoảng trắng đầu/cuối
        if (hoTen.trim().isEmpty()) {
            System.out.println("Ho ten khong duoc de trong");
            return;
        }

        // 1. Xóa khoảng trắng đầu và cuối chuỗi
        hoTen = hoTen.trim();
        System.out.println("Sau trim: " + hoTen + " (" + hoTen.length() + " ky tu)");

        // 2. Chuẩn hóa khoảng trắng ở giữa các từ
        hoTen = hoTen.replaceAll("\\s+", " ");
        System.out.println("Chuan hoa khoang trang: " + hoTen);

        // 3. Chuyển toàn bộ sang in hoa
        String inHoa = hoTen.toUpperCase();
        System.out.println("In hoa: " + inHoa);

        // 4. Tách từ và đếm số lượng từ
        String[] words = hoTen.split(" ");
        System.out.println("So tu: " + words.length);

        // 5. Chuẩn hóa từng từ (chữ cái đầu in hoa, còn lại in thường)
        StringBuilder hoTenChuan = new StringBuilder();
        for (String w : words) {
            String wordChuan = w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase();
            hoTenChuan.append(wordChuan).append(" ");
        }
        
        System.out.println("Ho ten chuan: " + hoTenChuan.toString().trim());
    }
}