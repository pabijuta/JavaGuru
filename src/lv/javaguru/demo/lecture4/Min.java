package lv.javaguru.demo.lecture4;

import java.util.Arrays;

public class Min {

    public static void main(String[] args) {
        int[] numbers = {17, 3, 55, 34, 85};
        System.out.println("Array:" + Arrays.toString(numbers));
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Mazākais ir " + min);
    }
}