package banking5_2;

import java.util.Objects;

public class Customer {
  private String FirstName;
  private String LastName;
  private SavingAccount savingAccount = null; // 储蓄账户
  private CheckingAccount checkingAccount = null; // 信用卡账户

  public Customer(String _firsName, String _lastName){
    FirstName = _firsName;
    LastName = _lastName;
  }
  public String getFirstName(){
    return FirstName;
  }

  public String getLastName(){
    return LastName;
  }

  public SavingAccount getSaving() {
    return savingAccount;
  }

  public void setSaving(SavingAccount savingAccount) {
    this.savingAccount = savingAccount;
  }

  public CheckingAccount getChecking() {
    return checkingAccount;
  }

  public void setChecking(CheckingAccount checkingAccount) {
    this.checkingAccount = checkingAccount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Customer)) return false;
    Customer customer = (Customer) o;
    return Objects.equals(FirstName, customer.FirstName) &&
            Objects.equals(LastName, customer.LastName) &&
            Objects.equals(savingAccount, customer.savingAccount) &&
            Objects.equals(checkingAccount, customer.checkingAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FirstName, LastName, savingAccount, checkingAccount);
  }
}
