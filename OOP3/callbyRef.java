public class callbyRef {
  public static void modifyPerson(Person p) {
    p.setName("Murad");
    System.out.println("Inside method: " + p.getName());
  }

  static class Person {
    private String name;

    public Person(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  public static void main(String[] args) {
    Person person = new Person("Hossain");
    System.out.println("Before method call: " + person.getName());

    modifyPerson(person);

    System.out.println("After method call: " + person.getName());
  }

}
