package lv.javaguru.demo.lecture5;

import java.util.Random;

import java.util.Scanner;

public class bumbinas {

    public static void main(String[] args) {
        Random random = new Random();
        int random_number;
        random_number = random.nextInt(3) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lūdzu izvēlies krūzīti no 1 līdz 3!");

        int number;
        do {
            number = scanner.nextInt();
            if (number == random_number) {
                System.out.println("Tu izvēlējies " + random_number);
            } else {
                System.out.println("Tu izvēlējies " + number + " un neuzminēji!");
            }
        } while (number != random_number);
    }
}