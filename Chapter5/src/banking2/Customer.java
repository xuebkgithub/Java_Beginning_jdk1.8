package banking2;
import banking2.Account;

public class Customer {
  private String FirstName;
  private String LastName;
  private Account Account;

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

  public Account getAccount(){
    return Account;
  }
  public void setAccount(Account _account){
    Account = _account;
  }

}
