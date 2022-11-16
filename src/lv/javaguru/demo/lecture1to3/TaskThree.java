package lv.javaguru.demo.lecture1to3;

import java.util.Random;

public class TaskThree {
    public static void main(String[] args) {
        Random generator = new Random();
        int randomInt1 = generator.nextInt(101);
        int randomInt2 = generator.nextInt(101);
        int result = randomInt1+randomInt2;
        System.out.println("Random skaitļu summa: " + result);
    }
}
