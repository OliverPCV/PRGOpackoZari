package com.company;

import java.util.Scanner;

public class Ciselnyvzor {
    public static void main(String[] args) {
        String number;

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cislo");
        number = sc.nextLine();
        System.out.println(number);

        for (int i = 0; i < number.length(); i++){
            System.out.println(number.substring(0, number.length() - i));
        }
    }
}