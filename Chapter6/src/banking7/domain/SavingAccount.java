package banking7.domain;

/*
储蓄账户
 */
public class SavingAccount extends Account {
  protected double interestRate;

  public SavingAccount(double init_balance, double interestRate){
    super(init_balance, "SavingAccount");
    this.setInterestRate(interestRate);
  }

  public double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }
}
