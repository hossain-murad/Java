class Example {
  public static String display() {
    return "method in Example class";
  }

  public void print() {
    System.out.println("method in Example class");
  }
}

public class staticEX {
  public static void main(String args[]) {
    System.out.println(Example.display());
  }
}
