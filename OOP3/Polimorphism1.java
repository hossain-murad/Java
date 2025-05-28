class ABC {
  public void myMethod() {
    System.out.println("This is my method from class ABC");
  }
}

public class Polimorphism1 extends ABC {
  public void myMethod() {
    System.out.println("This is my method from class XYZ");
  }

  public static void main(String[] args) {
    ABC obj = new Polimorphism1();
    obj.myMethod(); // This will call the method from class XYZ

  }
}
