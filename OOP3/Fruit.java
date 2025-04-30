public class Fruit {
  private String fr_name;
  private double fr_price;
  private int Fr_quantity;

  void setName(String name) {
    this.fr_name = name;
  }

  void setPrice(double price) {
    this.fr_price = price;
  }

  void setQuantity(int quantity) {
    this.Fr_quantity = quantity;
  }

  void showInfo() {
    System.out.println("Fruit Name: " + fr_name);
    System.out.println("Fruit Price: " + fr_price);
    System.out.println("Fruit Quantity: " + Fr_quantity);
  }

  public static void main(String[] args) {
    Fruit f1 = new Fruit();
    f1.setName("Apple");
    f1.setPrice(50.0);
    f1.setQuantity(10);

    Fruit f2 = new Fruit();
    f2.setName("Banana");
    f2.setPrice(30.0);
    f2.setQuantity(20);

    f1.showInfo();
    System.out.println("-------------------");
    f2.showInfo();

  }
}
