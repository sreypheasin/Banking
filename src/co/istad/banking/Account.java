package co.istad.banking;

public abstract class Account {
    private Integer number;
    private String name;
    private Double balance;
    // todo default construct
    public Account (){}
    // todo constructor
    public Account(Integer number, String name, Double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }
    // todo geter & seter
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    private void setBalance(Double balance) {
        this.balance = balance;
    }
    // todo operation methods
    protected void deposit(double amount){
        if(amount< 0){
            System.out.println("Are you kidding me?");
            return;
        }
        if(amount == 0){
            System.out.println("You cannot deposit Zero balance.");
            return;
        }
        balance +=amount;
    }
    protected void withdrawal(double amount){
        if(amount< 0){
            System.out.println("Are you kidding me?");
            return;
        }
        if (amount == 0){
            System.out.println("You cannot withdrawal");
            return;
        }
        if(amount >balance){
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
    }
    protected abstract void showBalane();
}
