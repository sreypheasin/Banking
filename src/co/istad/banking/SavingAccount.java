package co.istad.banking;

import co.istad.util.Interest;

public class SavingAccount extends Account implements Interest {
    private Double totalInterest;
    private Interest interestI;
    //todo create default interest for saving account
    static class DefaultInterest implements Interest {
        @Override
        public Double calculate(Double amount) {
            return amount * 0.03;
        }
    }
    // todo set new interest
    public SavingAccount(){
        setInterestI(new Interest() {
            @Override
            public Double calculate(Double amount) {
                return amount * 0.02;
            }
        });
    }
    // todo constructor
    public SavingAccount(Integer number, String name, Double balance) {
        super(number, name, balance);
    }

    public void setTotalInterest(Double totalInterest) {
        this.totalInterest = totalInterest;
    }

    public Double getTotalInterest() {
        return totalInterest;
    }
    public void setInterestI(Interest interestI) {
        this.interestI = interestI;
    }
    public Double calculate(Double amount) {
        return this.totalInterest*amount;
    }
    public void calculateInterest(){
        totalInterest = interestI.calculate(getBalance());
    }
    @Override
    protected void showBalane() {
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("Saving Act No: "+ getNumber());
        System.out.println("Saving Name: "+ getName());
        System.out.println("Total Interest: "+totalInterest+"$");
        System.out.println("=> Total Balance: "+ getBalance());
        System.out.println("+++++++++++++++++++++++++++++");
    }
}
