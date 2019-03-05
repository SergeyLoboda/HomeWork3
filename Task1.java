package com.epam.homework;

public class Task1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 10; i >= 0; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


