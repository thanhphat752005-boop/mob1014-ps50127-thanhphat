package com.fpoly.lab7;

public class CardPayment implements Payment {
    @Override
    public double pay(double amount) {
        // Thẻ = (amount * 0.95) + (amount * 0.95) * TAX[cite: 6]
        return (amount * 0.95) + ((amount * 0.95) * TAX);
    }
}