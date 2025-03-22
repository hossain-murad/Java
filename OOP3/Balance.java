import java.util.*;


public class Balance {
  public static final double PENALTY = 8.00;
  public static final double INTEREST = 0.02;
  public static void main(String[] args) {

    double balance;
    System.out.println("Enter the balance: ");
    Scanner sc = new Scanner(System.in);
    balance = sc.nextDouble();
    if (balance > 0) {
      balance = balance + (INTEREST*balance)/12;
    } else {
          balance = balance - PENALTY;    }

    System.out.println("After 1 month, the balance is: $" + balance);
  }
}
