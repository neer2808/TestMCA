
public class Test1 {
  final int a;
  static int b;
  //int b;
  {
    a =60;
  }
  void show()
  {
    b = 50;
  }
  Test1(int b)
  {

   // static int abc= 30;
  this.b = b;
  }
}
class Test1Main
{
  public static void main(String[] args) {
    Test1 obj = new Test1(10);
    Test1 obj2 = new Test1(30);

    System.out.println(obj.a+ "    "+obj.b);
    System.out.println(obj2.a +"     "+ obj2.b);

  }
}
// final

