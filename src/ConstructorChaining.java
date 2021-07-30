
public class ConstructorChaining{
  ConstructorChaining()
  {
     // constructor chaining
    this(12);
    System.out.println("no argument constructor");
  }
  ConstructorChaining(int a)
  {
    System.out.println("argumeent constructor ");
  }
}
class Test123
{
  public static void main(String[] args) {
    ConstructorChaining obj = new ConstructorChaining();

  }
}
