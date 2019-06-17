package banking7.domain;

public class OverdraftException extends Exception{
  static final long serialVersionUID = -33875169931242248L;
  private double deficit ;
  public OverdraftException() {
  }

  public OverdraftException(String msg, double deficit) {
    super(msg);
    this.deficit = deficit;
  }

  public OverdraftException(String message) {
    super(message);
  }
  public double getDeficit(){
    return deficit;
  }
}
