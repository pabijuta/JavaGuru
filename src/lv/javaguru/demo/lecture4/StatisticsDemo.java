package lv.javaguru.demo.lecture4;

import java.util.Arrays;

public class StatisticsDemo {

    public static void main(String[] args) {
        Statistics statistika = new Statistics();

        int[] numbers = {17, 3, 55, 34, 85};
        int sum = 0;

        statistika.min = numbers[0];
        statistika.max = numbers[0];
        System.out.println("Array:" + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < statistika.min) {
                statistika.min = numbers[i];
            }
                if (numbers[i] > statistika.max) {
                    statistika.max = numbers[i];
                }
                    sum+=numbers[i];
            }
                statistika.average = sum / numbers.length;


                System.out.println("Mazākais ir " + statistika.min);
                System.out.println("Lielākais ir " + statistika.max);
                System.out.println("Vidējais ir " + statistika.average);

            }
        }

