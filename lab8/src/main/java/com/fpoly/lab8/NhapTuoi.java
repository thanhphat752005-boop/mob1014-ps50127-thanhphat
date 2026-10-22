package com.fpoly.lab8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NhapTuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tuoi = 0;
        int k = 0; // Biến đếm số lần nhập

        while (true) {
            k++;
            try {
                System.out.print("Nhap tuoi: ");
                tuoi = sc.nextInt();
                
                if (tuoi <= 0) {
                    throw new IllegalArgumentException("Tuoi phai lon hon 0");
                }
                
                break;
                
            } catch (InputMismatchException e) {
                System.out.println("Loi: Tuoi phai la so nguyen!");
                sc.nextLine(); 
            } catch (IllegalArgumentException e) {
                System.out.println("Loi: " + e.getMessage());
            } finally {
                System.out.println("Da xu ly lan nhap thu " + k);
            }
        }

        System.out.println("Ket thuc qua trinh nhap du lieu. Tuoi hop le: " + tuoi);
        sc.close();
    }
}