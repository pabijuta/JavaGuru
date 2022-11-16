package lv.javaguru.demo.lecture1to3;

import lv.javaguru.demo.lecture1to3.BankImproved;

public class Main {
    public static void main(String[] args) {

        BankImproved bank = new BankImproved();
        bank.deposit (1000);
        bank.withdraw(100);
        bank.deposit(1000);
        bank.checkBalance();
        bank.withdraw(400);
        bank.checkBalance();


       }}