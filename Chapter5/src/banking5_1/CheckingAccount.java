package banking5_1;
/*
储蓄账户
 */
public class CheckingAccount extends Account{
  protected double overdraftProtection;

  public CheckingAccount(double init_balance){
    super(init_balance, "CheckingAccount");
  }
  public CheckingAccount(double init_balance, double overdraftProtection){
    super(init_balance, "CheckingAccount");
    this.setoverdraftProtection(overdraftProtection);
  }

  public double getoverdraftProtection() {
    return overdraftProtection;
  }

  public void setoverdraftProtection(double overdraftProtection) {
    this.overdraftProtection = overdraftProtection;
  }

  protected boolean Checkingwithdraw(double atm){
    // 私有 信用卡账户减钱方案
    if ( this.overdraftProtection >= atm - this.getBalance()){
      this.overdraftProtection -= ( atm - this.getBalance());
      this.setBalance(0);
      return true;
    }
//    System.out.println("余额小于您要取得钱");
    return false;
  }

  public boolean withdraw(double atm){
    boolean _withdraw = super.withdraw(atm);
    if (_withdraw){
      return _withdraw;
    }
    return this.Checkingwithdraw(atm);
  }
}
