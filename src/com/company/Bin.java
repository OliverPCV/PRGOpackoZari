package com.company;

import java.util.Scanner;

public class Bin {
    public static void main(String[] args) {
        int number;
        int index = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej cislo");
        number = sc.nextInt();

        int arrOfBinNumbers[] = new int[number];

        while(number > 0){
            arrOfBinNumbers[index++] = number % 2;
            number = number / 2;
        }

        for (int i = index-1; i >= 0; i--){
            System.out.print(arrOfBinNumbers[i]);
        }


    }
}
