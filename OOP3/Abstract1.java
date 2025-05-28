abstract class Bank {
  abstract int getInterestRate();
}

class SBI extends Bank {
  int getInterestRate() {
    return 7;
  }
}

class PNB extends Bank {
  int getInterestRate() {
    return 8;
  }
}

class Abstract1 {
  public static void main(String[] args) {
    Bank sbi = new SBI();
    Bank pnb = new PNB();

    System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
    System.out.println("PNB Interest Rate: " + pnb.getInterestRate() + "%");
  }
}
