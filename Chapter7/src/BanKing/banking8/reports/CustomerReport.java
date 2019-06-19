package BanKing.banking8.reports;

import BanKing.banking8.domain.*;

import java.text.NumberFormat;
import java.util.Iterator;

public class CustomerReport {
  Bank bank = Bank.getBanking();
  Customer customer;
  NumberFormat currency_format = NumberFormat.getCurrencyInstance();

  public void generateReport(){
    // Generate a report
    System.out.println("\t\t\tCUSTOMERS REPORT");
    System.out.println("\t\t\t================");

//    for (int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++) {
//      customer = bank.getCustomer(cust_idx);
//
//      System.out.println();
//      System.out.println("Customer: " + customer.getLastName() + ", "
//              + customer.getFirstName() + ", NumOfAccounts: " + customer.getNumOfAccounts());
//
//      for (int acct_idx = 0; acct_idx < customer.getNumOfAccounts(); acct_idx++) {
//        Account account = customer.getAccount(acct_idx);
//        System.out.println(account.getAccount_type() + ": current balance is "
//                + currency_format.format(account.getBalance()));
//      }
//    }
    // 使用 iterator 实现用户的迭代
    Iterator<Customer> Customers = bank.getCustomers();
    while (Customers.hasNext()){
      customer = Customers.next();
      System.out.println();
      System.out.println("Customer: " + customer.getLastName() + ", "
              + customer.getFirstName() + ", NumOfAccounts: " + customer.getNumOfAccounts());
      Iterator<Account> Accounts = customer.getAccounts();
      while (Accounts.hasNext()){
        Account account = Accounts.next();
        System.out.println(account.getAccount_type() + ": current balance is "
                + currency_format.format(account.getBalance()));
      }
    }
  }
}
