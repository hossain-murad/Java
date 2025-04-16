class Employee {
  private int regno;
  private String name;

  Employee(int regno, String name) {
    this.regno = regno;
    this.name = name;
  }

  public int getRegno() {
    return regno;
  }

  public void setRegno(int regno) {
    this.regno = regno;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

public class HashCodeEx {
  public static void main(String[] args) {
    Employee empl = new Employee(999, "Murad");
    Employee emp2 = new Employee(999, "Murad");

    int a = empl.hashCode();
    int b = emp2.hashCode();

    System.out.println("hashcode of emp1 = " + a);
    System.out.println("hashcode of emp2 = " + b);
    System.out.println("Comparing objects empl and emp2 = " + empl.equals(emp2));
  }
}
