class F1
{
  public void show()
  {
    System.out.println("F1 class show method  ");
  }
}
class F2 extends F1
{
  public void show()
  {
    System.out.println("f2 class show method ");
  }
}


public class PolyExample2 {
  public static void main(String[] args) {
    F1 obj = new F2();
    obj.show();
  }
}
