class Person {
  private String name;
  private int age;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

class Student extends Person {
  private String studentId;

  public String getStudentId() {
    return studentId;
  }

  public void setStudentId(String studentId) {
    this.studentId = studentId;
  }
}

class Teacher extends Person {
  private String teacherId;

  public String getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(String teacherId) {
    this.teacherId = teacherId;
  }
}

public class InheritanceExample6 {
  public static void main(String[] args) {
    Student s = new Student();
    s.setName("Murad");
    s.setAge(23);
    s.setStudentId("S123");

    System.out.println("Student Name: " + s.getName());
    System.out.println("Student Age: " + s.getAge());
    System.out.println("Student ID: " + s.getStudentId());

    Teacher t = new Teacher();
    t.setName("Dr.Preethi Ananthachari");
    t.setAge(30);
    t.setTeacherId("T456");

    System.out.println("Teacher Name: " + t.getName());
    System.out.println("Teacher Age: " + t.getAge());
    System.out.println("Teacher ID: " + t.getTeacherId());
  }
}
