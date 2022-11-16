package lv.javaguru.demo.lecture1to3;

public class BankImproved {

int balance;

public BankImproved (){
    this.balance = 0;
}

public void deposit (int amount){
    this.balance = balance + amount;
    System.out.println("You have deposited: " + amount + "EUR");
}
    public void withdraw (int amount){
        this.balance = balance - amount;
        System.out.println("You have withdrawn: " + amount + "EUR");
    }
    public void checkBalance (){
        System.out.println("Your balance: " + balance + "EUR");
    }
    }
