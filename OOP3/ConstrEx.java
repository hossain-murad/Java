public class ConstrEx {
  int id;
  String name;

  ConstrEx(int i, String n) {
    id = i;
    name = n;
  }

  void setValues(int i, String n) {
    this.id = i;
    this.name = n;
  }

  void display() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
  }

  public static void main(String[] args) {
    ConstrEx s1 = new ConstrEx(101, "Hossain");
    ConstrEx s2 = new ConstrEx(102, "Murad");

    s1.setValues(100, "Shakib");

    s1.display();
    s2.display();

  }
}
