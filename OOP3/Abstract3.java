interface A {
  void a();

  void b();

  void c();

  void d();
}

abstract class B implements A {
  public void a() {
    System.out.println("I am a");
  }
}

class C extends B {
  public void b() {
    System.out.println("I am b");
  }

  public void c() {
    System.out.println("I am c");
  }

  public void d() {
    System.out.println("I am d");
  }
}

public class Abstract3 {

  public static void main(String[] args) {

    A obj = new C();
    obj.a();
    obj.b();
    obj.c();
    obj.d();
  }
}
