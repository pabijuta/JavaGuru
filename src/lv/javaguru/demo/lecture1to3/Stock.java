package lv.javaguru.demo.lecture1to3;

public class Stock {


    public static void main(String[] args) {

        StockNew newStock = new StockNew();
        newStock.setCompanyName("Misters Burgers");

        int[] burgersStock = {newStock.updatePrice(20)};

        newStock.min = burgersStock [0];
        newStock.max = burgersStock [0];

        for (int i = 0; i < burgersStock.length; i++) {
            if (burgersStock[i] < newStock.min) {
                newStock.min = burgersStock[i];
            }
            if (burgersStock[i] > newStock.max) {
                newStock.max = burgersStock[i];
            }
        }
        System.out.println("Name of Company" + newStock.getCompanyName());
        System.out.println("Minimum stock price value " + newStock.min);
        System.out.println("Maximum stock price value " + newStock.max);
    }
}