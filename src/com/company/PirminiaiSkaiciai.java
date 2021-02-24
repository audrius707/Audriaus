package com.company;

import java.util.Scanner;

public class PirminiaiSkaiciai {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Iveskite intervalo pradzia:");
        int first = scanner.nextInt();
        System.out.print("Iveskite intervalo pabaiga:");
        int last = scanner.nextInt();

        for (int i = first; i <= last; i++) {
            if (i == 1) {
                System.out.println(i + " nera nei pirminis nei sudetinis");
            } else {
                int dalSuma = 0;
                for (int j = 2; j < i; j++) {

                    if (i % j == 0) {
                        dalSuma++;
                        break;
                    }
                }
                if (dalSuma == 0) {
                    System.out.println(i + " yra pirminis.");

                } else {
                    System.out.println(i + " yra sudetinis");
                }
            }


        }
    }
}