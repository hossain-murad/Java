class Person {
  private String name;

  Person(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}

class Student extends Person {
  private String studentId;

  Student(String name, String studentId) {
    super(name);
    this.studentId = studentId;
  }

  void display() {
    System.out.println(getName() + " " + studentId);
  }

}

public class InheritanceExample2 {
  public static void main(String[] args) {
    Student student = new Student("John", "S123");
    student.display();
  }
}
