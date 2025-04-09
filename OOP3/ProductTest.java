class Product {
  private String name;

  public void setname(String name) {
    this.name = name;
  }

  public String getname() {
    return name;
  }
}

public class ProductTest {
  public static void main(String[] args) {
    Product p1 = new Product();
    p1.setname("Laptop");
    System.out.println("Product name: " + p1.getname());
  }
}
