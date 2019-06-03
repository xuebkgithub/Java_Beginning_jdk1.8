package banking2;

public class Account {
  private double balance;
  public Account(double init_balance){
    balance=init_balance;
  }
  public double getBalance(){
    return balance;
  }
  public void deposit(double atm){
    if(atm > 0){
      balance += atm;
    }
  }
  public void withdraw(double atm){
    if(balance >= atm){
      balance -= atm;
    }else {
      System.out.println("余额小于您要取得钱");
    }
  }
}
