class Product {
  int id;
  String name;

  // Constructor
  Product(int id, String name) {
    this.id = id;
    this.name = name;
  }

  // Display method
  void display() {
    System.out.println("ID: " + id + ", Name: " + name);
  }
}

public class ArrOfObject {
  public static void main(String[] args) {
    Product[] obj = new Product[2];
    obj[0] = new Product(23907, "Dell Laptop");
    obj[1] = new Product(91240, "HP 630");

    System.out.println("Product Object 1:");
    obj[0].display();
    System.out.println("Product Object 2:");
    obj[1].display();

  }
}
