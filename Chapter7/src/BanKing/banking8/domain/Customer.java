package BanKing.banking8.domain;

import java.util.Arrays;
import java.util.Objects;

public class Customer {
  private String FirstName;
  private String LastName;
  private Account[] Account;
  private int NumOfAccount;

  public Customer(String _firsName, String _lastName){
    FirstName = _firsName;
    LastName = _lastName;
    Account = new Account[5];
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

//    // TODO 这里是否可以这样进行 编写
//    /*
//      因: 需要动态获取 getAccount
//      目前写法. 这里 进行一个空值进行赋值.这里是否能有更好的写法?
//     */
//    int[] _nums = new int[1];
//    if (Num.length != 0 ){
//      _nums = Num;
//    }
    return this.Account[index];
  }

  public Account getAccount(){
    return this.Account[0];
  }

  public int setAccount(Account _account){
    if(this.NumOfAccount >=5) {
      System.out.println("超过最大长度");
    }
    this.Account[this.NumOfAccount] = _account;
    this.NumOfAccount++ ;
    return this.NumOfAccount;
  }
  public int addAccount(Account _account){
    return this.setAccount(_account);
  }
  public int getNumOfAccounts(){
    return this.NumOfAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Customer customer = (Customer) o;
    return NumOfAccount == customer.NumOfAccount &&
            Objects.equals(FirstName, customer.FirstName) &&
            Objects.equals(LastName, customer.LastName) &&
            Arrays.equals(Account, customer.Account);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(FirstName, LastName, NumOfAccount);
    result = 31 * result + Arrays.hashCode(Account);
    return result;
  }
}
