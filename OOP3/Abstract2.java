abstract class Bike {

  Bike() {
    System.out.println("Bike constructor called");
  }

  abstract void run();

  void changeGear() {
    System.out.println("Gear changed");
  }
}

class Honda extends Bike {

  void run() {
    System.out.println("Running safely");
  }
}

public class Abstract2 {
  public static void main(String[] args) {
    Bike bike = new Honda();
    bike.run();
    bike.changeGear();
  }
}
