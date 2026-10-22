package com.fpoly.lab7;

public class CashPayment implements Payment {
    @Override
    public double pay(double amount) {
        // Tiền mặt = amount + amount * TAX
        return amount + (amount * TAX);
    }
}