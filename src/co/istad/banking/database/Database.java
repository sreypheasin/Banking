package co.istad.banking.database;

import co.istad.banking.CreditCard;
import co.istad.banking.SavingAccount;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {
    public static CreditCard creditCard(){
      CreditCard  creditCard = new CreditCard(11112222,"Odinn",1000.0);
        creditCard.setLimitAmount(1000.0);
        creditCard.setPin(1234);
        creditCard.setThruDate(LocalDate.now().plus(1, ChronoUnit.DAYS));
        return creditCard;
    }
    public static SavingAccount savingAccount(){
        SavingAccount savingAccount = new SavingAccount(11112222,"Odinn",200.0);
        return savingAccount;
    }
}

