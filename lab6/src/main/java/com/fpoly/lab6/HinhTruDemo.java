package com.fpoly.lab6;

public class HinhTruDemo {
    public static void main(String[] args) {
        // Tạo Cylinder cy = new Cylinder(2, "Xanh", 3)
        Cylinder cy = new Cylinder(2.0, "Xanh", 3.0);
        
        // In cy
        System.out.println(cy);
        
        // Gọi cy.setHeight(0) và in lại cy
        cy.setHeight(0);
        System.out.println(cy);
    }
}