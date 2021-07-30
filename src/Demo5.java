public abstract class Demo5 {
  public abstract void method1();
  public void show()  // concrete method
  {
    System.out.println("in show method");
  }
  public static void m12()
  {

  }
  static {

  }
  {

  }
  Demo5()
  {
    System.out.println("inside constructor");
  }

}
class  Demo6 extends Demo5
{
  // empty definition
  public void method1(){
    System.out.println("in demo6 class method1");
  }
}
class Demo5main
{
  public static void main(String[] args) {
    Demo6 obj = new Demo6();
    obj.method1();
    obj.show();

  }
}
// 0% abstraction
