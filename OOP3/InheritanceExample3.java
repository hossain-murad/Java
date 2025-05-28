class Vehicle {
  void run() {
    System.out.println("Vehicle is running");
  }
}

public class InheritanceExample3 extends Vehicle {
  void run() {
    super.run(); // calling parent class method
    System.out.println("Bike is running safely with 60kmph");
  }

  public static void main(String args[]) {
    InheritanceExample3 obj = new InheritanceExample3(); // creating object
    obj.run(); // calling method
  }
}
