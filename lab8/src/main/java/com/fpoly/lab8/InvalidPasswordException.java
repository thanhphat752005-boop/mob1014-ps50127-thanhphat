package com.fpoly.lab8;

// Yêu cầu 1: Khai báo lớp ngoại lệ tự định nghĩa
public class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}