package TestCricle;
/*
  *  编写一个类实现银行账户的概念.包含的属性有"账户", "密码", "存款余额", "利率", "最小余额", 定义封装这些编写类的.
  *  使用银行账户类 输入,输出 3 个储蓄账户上的信息
 */
public class TestAccount {
  public static void main(String[] args){
    Account a1 = new Account("123", 11);
    Account a2 = new Account("14", 0);
    Account a3 = new Account("51414", 12);
    Account a4 = new Account("1111 ", 14);

    System.out.println(a1.toString());
    System.out.println(a2.toString());
    System.out.println(a3.toString());
    System.out.println(a4.toString());

  }
}

class Account{
  private int Id; //账户 ID
  private String Password; // 密码
  private double Deposits; // 存款余额
  private static double Interest_rate=0.2; // 利率
  private static double Minimum_balance=1; // 最小余额
  private static int init_id=1000; //初始 id

  public Account(String password, double Deposits){
    this.Id = this.init_id++; //设定初始 ID
    this.setDeposits(Deposits); // 设定存款余额
    this.setPassword(password); // 设定密码
  }

  public String getPassword() {
    return Password;
  }

  public void setPassword(String password) {
    Password = password;
  }

  public double getDeposits() {
    return Deposits;
  }

  public void setDeposits(double deposits) {
    // 如果.设定的 费用.最小余额.则不成功
    if (deposits > this.Minimum_balance){
      Deposits = deposits;
    }
  }

  @Override
  public String toString() {
    return "Account{" +
            "Id=" + Id +
            ", Password='" + Password + '\'' +
            ", Deposits=" + Deposits +
            '}';
  }
}
