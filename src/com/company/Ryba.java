package com.company;

import java.util.Scanner;

public class Ryba {
    public static void main(String[] args) {
        int fish;

        Scanner sc = new Scanner(System.in);

        System.out.println("Kolik si das fishes? :)");
        fish = sc.nextInt();

        for (int i = 0; i < fish; i++){
            System.out.println("<° )))-<");
        }
    }
}
