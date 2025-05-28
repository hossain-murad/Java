class Superclass {
  int i = 20;

  void display() {
    System.out.println("Superclass display method");
  }
}

class Subclass extends Superclass {
  int i = 30;

  void display() {
    super.display(); // Call the superclass method
    System.out.println("Subclass display method");
    System.out.println("Subclass i value: " + i);
    System.out.println("Superclass i value: " + super.i);
  }
}

public class InheritanceExample7 {
  public static void main(String[] args) {
    Subclass obj = new Subclass();
    obj.display();
  }
}
