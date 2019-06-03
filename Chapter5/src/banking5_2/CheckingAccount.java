package banking5_2;

/*
信用卡 账户
 */
public class CheckingAccount extends Account {
  protected SavingAccount protectedBy;

  public CheckingAccount(double balance){
    super(balance, "CheckingAccount");
    this.setProtectedBy(
      new SavingAccount(0, 0)
    );
  }
  public CheckingAccount(double balance,SavingAccount protect){
    super(balance, "CheckingAccount");
    this.setProtectedBy(protect);
  }

  public SavingAccount getProtectedBy() {
    return protectedBy;
  }

  public void setProtectedBy(SavingAccount protectedBy) {
    this.protectedBy = protectedBy;
  }

  protected boolean Checkingwithdraw(double atm){
    // 私有 信用卡账户减钱方案
    if ( this.getProtectedBy().getBalance() >= (atm - this.getBalance())){
      this.getProtectedBy().withdraw(atm - this.getBalance());
      this.setBalance(0);
      return true;
    }
    // System.out.println("余额小于您要取得钱");
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
