package lv.javaguru.demo.lecture5;

import java.util.Scanner;

public class HomeWork5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lūdzu ievadi 10 skaitļus");

        Number [] number = new Number [10];
        {
            number [0] = scanner.nextInt();

            int min = number [0];
            for (int i = 0; i < number.length; i++) {
                if (number[i] < min) {
                    min = number[i];
                }
                System.out.println("Mazākais no 10 ir: " + min);
            }
        }
    }
    }
