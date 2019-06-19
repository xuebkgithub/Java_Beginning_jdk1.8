package BanKing.banking8.domain;
/*
储蓄账户
 */
public class AccountSaving extends Account{
  protected double interestRate;

  public AccountSaving(double init_balance, double interestRate){
    super(init_balance, "AccountSaving");
    this.setInterestRate(interestRate);
  }

  public double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }
}
