package com.company;

import java.util.Scanner;

public class Cara {
    public static void main(String[] args) {
        int line;

        Scanner sc = new Scanner(System.in);

        System.out.println("Jak dlouhou chces caru? :)");
        line = sc.nextInt();

        for (int i = 0; i < line; i++){
            System.out.print(".");
        }
    }
}
