package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        if (x > 0) {
            x = x + 1;
            System.out.println("Наше число больше нуля, результат " + x);
        } else if (x < 0) {
            x = x - 1;
            System.out.println("Наше число меньше нуля, результат " + x);
        } else {
            x = x + 10;
            System.out.println("Наше число нуль, результат " + x);
        }

    }
}
