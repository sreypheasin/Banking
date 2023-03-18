package co.istad.banking;

import co.istad.banking.database.Database;

import java.time.LocalDate;

public class CreditCard extends Account{
    Integer pin;
    Double limitAmount;
    LocalDate thruDate;
    // todo default constructor
    public CreditCard(){}
    // todo constructor
    public CreditCard(Integer number, String name, Double balance) {
        super(number, name, balance);
    }
    // todo setter and getter
    public Integer getPin() {
        return pin;
    }

    public void setPin(Integer pin) {
        this.pin = pin;
    }

    public Double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(Double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public LocalDate getThruDate() {
        return thruDate;
    }

    public void setThruDate(LocalDate thruDate) {
        this.thruDate = thruDate;
    }
    // todo checking date
    private boolean isExpired(LocalDate data){
        //what day is today
        LocalDate now = LocalDate.now();
        return now.isAfter(data);
    }
    // todo override processing
    @Override
    protected void withdrawal(double amount) {
        if (!pin.equals(Database.creditCard().getPin())) {
            System.out.println("Invalid PIN!!");
            return;
        }
        if (amount > limitAmount){
            System.out.println("Over the limit amount... ");
            return;
        }
        if(isExpired(thruDate)){
            System.out.println("Card is expired..!");
            return;
        }
        super.withdrawal(amount);
    }

    @Override
    protected void deposit(double amount) {
        if(isExpired(thruDate)){
            System.out.println("Card is expired..!");
            return;
        }
        super.deposit(amount);
    }
    @Override
    protected void showBalane() {
        System.out.println("******************************");
        System.out.println("Act No: "+ getNumber());
        System.out.println("Name: "+ getName());
        System.out.println("Balance: " + getBalance() + "$");
        System.out.println("PIN: "+ pin);
        System.out.println("ThruDate: "+ thruDate);
        System.out.println("******************************");
    }
}
