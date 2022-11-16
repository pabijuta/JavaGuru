package lv.javaguru.demo.lecture5;

import java.util.Scanner;

public class bumbinas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Izvēlies krūzīti no 1 līdz 3");

        int number;
        do {
            number = scanner.nextInt();
            System.out.println("Tu izvēlējies krūzīti Nr.: " + number);
        } while (number != 3);
    }

}
