class Person {
  private String name;
  private int age;

  public void setName(String newname) {
    this.name = newname;
  }

  public void setAge(int newage) {
    this.age = newage;
  }

  public void print() {
    System.out.println(this.name + " is " + this.age + " years old");
  }
}

public class PersonTest {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setName("John");
    p1.setAge(25);
    p1.print();

    Person p2 = new Person();
    p2.setName("Jane");
    p2.setAge(30);
    p2.print();
  }
}
