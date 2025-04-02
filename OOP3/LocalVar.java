class BankAccount {
  public double amt;
  public double rate;

  public void showBalance() {
    double newAmt = amt + (rate / 100) * amt;
    System.out.println("Your balance is: " + newAmt);
  }

}

public class LocalVar {
  public static void main(String[] args) {
    BankAccount myAccount = new BankAccount();
    myAccount.amt = 1000;
    myAccount.rate = 5;
    double newAmt = 800;
    myAccount.showBalance();
    System.out.println("Your balance is: " + newAmt);
  }
}
