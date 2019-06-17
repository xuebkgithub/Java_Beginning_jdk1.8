package test2.Employee;

public class MyDate implements Comparable{
  private Integer day;
  private Integer month;
  private Integer year;

  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public MyDate(Integer day, Integer month, Integer year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  @Override
  public String toString() {
    return "MyDate{" +
            "day=" + day +
            ", month=" + month +
            ", year=" + year +
            '}';
  }

  @Override
  public int compareTo(Object o) {
    // 目前按照 年月日 进行排序
    // 这里优化了.不是这个项目
    if (!(o instanceof MyDate)){
      return 0;
    }
    // 这里对传入的 Object 进行初始化
    MyDate obj = (MyDate) o ;
    int i = 0;
    i = this.getYear().compareTo(obj.getYear());
    if ( i != 0 ){
      return i;
    }
    i = this.getMonth().compareTo(obj.getMonth());
    if ( i != 0 ){
      return i;
    }
    i = this.getDay().compareTo(obj.getDay());
    if ( i != 0 ){
      return i;
    }
    return i;
  }
}
