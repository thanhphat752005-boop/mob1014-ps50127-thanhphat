package com.fpoly.lab7;

import java.util.ArrayList;
import java.util.List;

public class ThanhToanDemo {
    public static void main(String[] args) {
        // 1. Khai báo mảng giá trị đơn hàng[cite: 7]
        double[] donHang = {100000, 250000, 1000000};
        
        // 2. Khai báo danh sách các hình thức thanh toán[cite: 7]
        List<Payment> methods = new ArrayList<>();
        methods.add(new CashPayment());
        methods.add(new CardPayment());
        
        // 3. Với mỗi đơn hàng, tính số tiền và in ra đúng định dạng[cite: 7]
        for (double giaTri : donHang) {
            // Lấy kết quả thanh toán từ từng phương thức trong danh sách
            double tienMat = methods.get(0).pay(giaTri);
            double the = methods.get(1).pay(giaTri);
            
            // In kết quả sử dụng printf với %.0f để bỏ phần thập phân tránh sai số[cite: 7]
            System.out.printf("Don hang %.0f: Tien mat = %.0f | The = %.0f\n", 
                    giaTri, tienMat, the);
        }
    }
}