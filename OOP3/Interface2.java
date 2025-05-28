interface Bank {
  float rateOfInterest();
}

class Hana implements Bank {
  public float rateOfInterest() {
    return 7.5f;
  }
}

class Woori implements Bank {
  public float rateOfInterest() {
    return 8.5f;
  }
}

public class Interface2 {
  public static void main(String[] args) {
    Bank b1 = new Hana();
    System.out.println("Hana Bank Rate of Interest: " + b1.rateOfInterest());

    Bank b2 = new Woori();
    System.out.println("Woori Bank Rate of In :terest: " + b2.rateOfInterest());
  }
}
