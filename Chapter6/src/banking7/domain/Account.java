package banking7.domain;

public class Account {
  protected double balance;
  protected String account_type;

  public Account(double init_balance){
    this.setBalance(init_balance);
  }
  public Account(double init_balance, String account_type){
    this.setBalance(init_balance);
    this.setAccount_type(account_type);
  }

  public double getBalance(){
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public boolean deposit(double atm){
    if(atm > 0){
      balance += atm;
      return true;
    }
    return false;
  }
  public void withdraw (double atm) throws OverdraftException {
    if(balance >= atm){
      balance -= atm;
    }else {
      throw new OverdraftException("储蓄 余额小于您要取得钱", atm - balance);
    }
  }

  public void setAccount_type(String account_type) {
    this.account_type = account_type;
  }

  public String getAccount_type() {
    return account_type;
  }
}
