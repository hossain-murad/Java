import java.util.*;
import java.text.NumberFormat;

public class Mortgage {
  public static void main(String[] args) {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    int principal = 0;
    float monthlyInterestRate = 0;
    int numberOfPayments = 0;

    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.print("Principal (1K-1M): ");
      principal = scan.nextInt();
      if (principal >= 1000 && principal <= 1_000_000) {
        break;
      }
      System.out.println("Enter a number between 1,000 and 1,000,000");
    }
    while (true) {
      System.out.print("Annual Interest Rate: ");
      float annualInterestRate = scan.nextFloat();
      if (annualInterestRate >= 1 && annualInterestRate <= 30) {
        monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        break;
      }
      System.out.println("Enter a number between 1 and 30");
    }

    while (true) {
      System.out.print("Period (Years): ");
      byte period = scan.nextByte();
      if (period >= 1 && period <= 30) {
        numberOfPayments = period * MONTHS_IN_YEAR;
        break;
      }
      System.out.println("Enter a number between 1 and 30");
    }

    double mortgage = principal
        * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
        / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1);

    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("Mortgage: " + mortgageFormatted);

    scan.close();
  }
}
