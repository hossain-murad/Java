import java.math.BigDecimal;

class Product {
  private BigDecimal price;;

  public void setprice(BigDecimal price) {
    this.price = price;
  }

  public BigDecimal getprice() {
    return price;
  }
}

public class BigDecimalEX {
  public static void main(String[] args) {
    BigDecimal A;
    Product p1 = new Product();
    p1.setprice(new BigDecimal("13.9"));
    A = BigDecimal.valueOf(3.09);
    System.out.println("Product price: " + p1.getprice());
  }
}
