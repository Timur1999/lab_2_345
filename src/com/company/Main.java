package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sqrt();

    }

    private static void Sqrt() {
        System.out.println("Введите c:");
        int i = 0;
        int b = 1;
        int c;
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        for (i = 0; i < c; i++) {
            b = b * 2;

        }
        System.out.println(b);
    }
}