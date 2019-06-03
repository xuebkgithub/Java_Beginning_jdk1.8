package banking4;

public class Bank {
  private Customer[] customers;
  private int NumOfCustomers;

  public Bank(){
    customers = new Customer[5];
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
