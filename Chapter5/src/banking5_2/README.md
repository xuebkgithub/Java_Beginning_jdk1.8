 实验题目：5_续2 


 实现更为复杂的透支保护机制
注释-这是练习1的选择练习。它包括了更为复杂的透支保护机制模型。它使用客户储蓄。它使用客户储蓄账户完成透支保护。本练习必须在完成上述两个练习后进行。
实验目的：
继承、多态、方法的重写。
说明：
修改SavingAccount类
1.仿照练习1“Account类的两个子类”一节实现SavingsAccount类。
2.SavingAccount类必须扩展Account类。
3.该类必须包含一个类型为double的interestRate属性
4.该类必须包括一个带有两个参数（balance和interest_rate）的公有构造器。该构造器必须通过调用super（balance）来将balance参数传递给父类构造器

修改CheckingAccount类
1.仿照练习1“Account类的两个子类”一节实现CheckingAccount类。
2.CheckingAccount类必须扩展Account类
3.该类必须包括一个关联属性，称作protectedBy，表示透支保护。该属性的类型为SavingAccount，缺省值必须是null。除此之外该类没有其他的数据属性。
4.该类必须包括一个带有参数（balance）的公有构造器，该构造器必须通过调用super(balance)将balance参数传递到父类构造器。
5.修改构造器为CheckingAccount(double balance,SavingAccount protect)构造器。该构造器必须通过调用super（balance）将balance参数传递给父类构造器。
6. CheckingAccount类必须覆盖withdraw方法。该类必须执行下面的检查：如果当前余额足够弥补取款amount，
则正常进行。如果不够弥补但是存在透支保护则尝试用储蓄账户来弥补这个差值（balance-amount）。如果后一个交易失败，则整个交易一定失败，但余额未受影响。

修改Customer类，使其拥有两个账户：一个储蓄账户和一个支票账户：两个都是可选的。
1.在练习5_续1修改，原来的Customer类包含一个称作account的关联属性，可用该属性控制一个Account对象。重写这个类，使其包含两个关联属性：
savingAccount和checkingAccount，这两个属性的缺省值是null
2.包含两个访问方法：getSaving和getChecking，这两个方法分别返回储蓄和支票总数。
3. 包含两个相反的方法：SetSaving和setChecking，这两个方法分别为savingAccount和checkingAccount这两个关联属性赋值。
完成TestBanking程序
Customer [Simms, Jane] has a checking balance of 200.0 and a savings balance of
500.0
Checking Acct [Jane Simms] : withdraw 150.00 succeeds? true
Checking Acct [Jane Simms] : deposit 22.50 succeeds? true
Checking Acct [Jane Simms] : withdraw 147.62 succeeds? true
Customer [Simms, Jane] has a checking balance of 0.0 and a savings balance of 424.88
Customer [Bryant, Owen] has a checking balance of 200.0
Checking Acct [Owen Bryant] : withdraw 100.00 succeeds? true
Checking Acct [Owen Bryant] : deposit 25.00 succeeds? true
Checking Acct [Owen Bryant] : withdraw 175.00 succeeds? false
Customer [Bryant, Owen] has a checking balance of 125.0




//TestBanking程序
/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */


import banking.*;


public class TestBanking {


  public static void main(String[] args) {
    Bank bank = new Bank();
    Customer customer;
    Account account;


    // Create two customers and their accounts
    bank.addCustomer("Jane", "Simms");
    customer = bank.getCustomer(0);
account = customer.getChecking();
    customer.setSavings(new SavingsAccount(500.00, 0.05));
    customer.setChecking(new CheckingAccount(200.00, customer.getSavings()));
    
bank.addCustomer("Owen", "Bryant");
    customer = bank.getCustomer(1);
    customer.setChecking(new CheckingAccount(200.00));


    // Test the checking account of Jane Simms (with overdraft protection)
    customer = bank.getCustomer(0);
    System.out.println("Customer [" + customer.getLastName()
      + ", " + customer.getFirstName() + "]"
      + " has a checking balance of "
      + customer.getChecking().getBalance()
      + " and a savings balance of "
      + customer.getSavings().getBalance());
    System.out.println("Checking Acct [Jane Simms] : withdraw 150.00 succeeds? "
      + account.withdraw(150.00));
    System.out.println("Checking Acct [Jane Simms] : deposit 22.50 succeeds? "
      + account.deposit(22.50));
    System.out.println("Checking Acct [Jane Simms] : withdraw 147.62 succeeds? "
      + account.withdraw(147.62));
    System.out.println("Customer [" + customer.getLastName()
      + ", " + customer.getFirstName() + "]"
      + " has a checking balance of "
      + account.getBalance()
      + " and a savings balance of "
      + customer.getSavings().getBalance());
    System.out.println();


    // Test the checking account of Owen Bryant (without overdraft protection)
    customer = bank.getCustomer(1);
    account = customer.getChecking();
    System.out.println("Customer [" + customer.getLastName()
      + ", " + customer.getFirstName() + "]"
      + " has a checking balance of "
      + account.getBalance());
    System.out.println("Checking Acct [Owen Bryant] : withdraw 100.00 succeeds? "
      + account.withdraw(100.00));
    System.out.println("Checking Acct [Owen Bryant] : deposit 25.00 succeeds? "
      + account.deposit(25.00));
    System.out.println("Checking Acct [Owen Bryant] : withdraw 175.00 succeeds? "
      + account.withdraw(175.00));
    System.out.println("Customer [" + customer.getLastName()
      + ", " + customer.getFirstName() + "]"
      + " has a checking balance of "
      + account.getBalance());
    System.out.println();
  }
}





