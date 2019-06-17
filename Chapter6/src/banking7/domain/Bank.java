package banking7.domain;

public class Bank {
  private Customer[] customers;
  private int NumOfCustomers;

  private Bank(){
    customers = new Customer[5];
  }

  private static Bank bank = new Bank();

  public static Bank getBanking() {
    return bank;
  }

  public void addCustomer(String _firsName, String _lastName){
    if(NumOfCustomers >=5) {
      System.out.println("超过最大长度");
    }
    Customer cust = new Customer(_firsName, _lastName);
    customers[NumOfCustomers] = cust;
    NumOfCustomers++ ;
  }
  public int getNumOfCustomers(){
    return NumOfCustomers;
  }

  public Customer getCustomer(int index){
    return customers[index];
  }

}
