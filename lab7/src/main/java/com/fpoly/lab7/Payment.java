package com.fpoly.lab7;

public interface Payment {
    // Hằng số ngầm định là public static final
    double TAX = 0.1; 
    
    // Phương thức ngầm định là public abstract
    double pay(double amount); 
}