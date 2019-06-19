package BanKing.banking8.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Customer {
  private String FirstName;
  private String LastName;
  private List<Account> Account = new ArrayList<Account>();

  public Customer(String _firsName, String _lastName){
    FirstName = _firsName;
    LastName = _lastName;
  }
  public String getFirstName(){
    return FirstName;
  }
  public void setFirstName(String _firsName){
    FirstName = _firsName ;
  }

  public String getLastName(){
    return LastName;
  }
  public void setLastName(String _lastName){
    LastName = _lastName;
  }

  public Account getAccount(int ... Num){
    int index = 0;

    if (Num != null && Num.length >= 1) {
      index = Num[0];
    }
    return this.Account.get(index);
  }

  public Account getAccount(){
    return this.Account.get(0);
  }

  public int setAccount(Account _account){
    if(this.Account.size() >=5) {
      System.out.println("超过最大长度");
    }
    this.Account.add(_account);
    return this.Account.size();
  }
  public int addAccount(Account _account){
    return this.setAccount(_account);
  }
  public int getNumOfAccounts(){
    return this.Account.size();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Customer)) return false;
    Customer customer = (Customer) o;
    return Objects.equals(FirstName, customer.FirstName) &&
            Objects.equals(LastName, customer.LastName) &&
            Objects.equals(Account, customer.Account);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FirstName, LastName, Account);
  }

  public Iterator<Account> getAccounts() {
    return this.Account.iterator();
  }
}
