package co.istad.banking;

import co.istad.banking.database.Database;

import java.time.LocalDate;

public class BankProgram {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        creditCard.setNumber(11112222);
        creditCard.setPin(1234);
        if (Database.creditCard().getNumber().equals(creditCard.getNumber())) {
            creditCard = Database.creditCard();
        } else {
            System.out.println("Invalid Card...!");
            return;
        }
        creditCard.showBalane();
        SavingAccount mySaving = Database.savingAccount();
        if (mySaving.getNumber().equals(Database.savingAccount().getNumber())) {
            mySaving = Database.savingAccount();
        }
        mySaving.setInterestI(new DollarRate());
        mySaving.calculateInterest();
        mySaving.showBalane();
    }
}
