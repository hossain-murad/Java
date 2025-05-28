interface Printable {
  default void print() {
    System.out.println("Hello");
  };

}

interface Showable {
  void show();
}

public class Interface3 implements Printable, Showable {

  public void show() {
    System.out.println("World");
  }

  public static void main(String[] args) {
    Interface3 obj = new Interface3();
    obj.print();
    obj.show();
  }

}
