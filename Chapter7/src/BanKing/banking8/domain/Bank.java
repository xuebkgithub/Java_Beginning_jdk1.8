package BanKing.banking8.domain;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  private List<Customer> customers = new ArrayList<Customer>(); // 这里指定了.只能存储 Customer 类型的列表.

  private static Bank bank = new Bank();

  public static Bank getBanking() {
    return bank;
  }

  public void addCustomer(String _firsName, String _lastName){
    if(customers.size() >=5) {
      System.out.println("超过最大长度");
    }
    Customer cust = new Customer(_firsName, _lastName);
    customers.add(cust);
  }
  public int getNumOfCustomers(){
    return customers.size();
  }

  public Customer getCustomer(int index){
    return customers.get(index);
  }

}
