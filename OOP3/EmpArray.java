public class EmpArray {
  int empId;
  String empName;

  EmpArray(int empId, String empName) {
    this.empId = empId;
    this.empName = empName;
  }

  void setData(int empId, String empName) {
    this.empId = empId;
    this.empName = empName;
  }

  void showdata() {
    System.out.println("Employee ID: " + empId + "->" + "Employee Name: " + empName);
  }

  public static void main(String[] args) {
    EmpArray[] emp = new EmpArray[2];
    emp[0] = new EmpArray(101, "Hossain");
    emp[1] = new EmpArray(102, "Murad");

    System.out.println("Accessing Employee Array through constractor:");
    emp[0].showdata();
    emp[1].showdata();

    System.out.println();

    emp[0].setData(101, "Maysha");
    emp[1].setData(104, "Tasmira");

    System.out.println("Accessing Employee Array through setData:");
    emp[0].showdata();
    emp[1].showdata();
  }
}
