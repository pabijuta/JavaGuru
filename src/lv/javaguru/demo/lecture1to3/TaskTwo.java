package lv.javaguru.demo.lecture1to3;

import java.util.Random;

public class TaskTwo {
    public static void main(String[] args) {
        Random generator = new Random();
        int randomInt = generator.nextInt(101);
        System.out.println("Random skaitlis: " + randomInt);
    }
}