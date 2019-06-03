package banking4;

public class Account {
  private double balance;
  public Account(double init_balance){
    balance=init_balance;
  }
  public double getBalance(){
    return balance;
  }
  public boolean deposit(double atm){
    if(atm > 0){
      balance += atm;
      return true;
    }
    return false;
  }
  public boolean withdraw(double atm){
    if(balance >= atm){
      balance -= atm;
      return true;
    }
    System.out.println("余额小于您要取得钱");
    return false;
  }
}
