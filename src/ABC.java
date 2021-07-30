public class ABC {

 int a;

  public static void main(String args[])
  {
    mytest obj = new mytest();
    obj.m1();
  }
}


interface i41
{
  default public void m1()
  {
    System.out.println("hello");
  }

}
interface i42
{
  default public void m1()
  {
    System.out.println("hi");
  }
}

class mytest implements  i41,i42
{
  @Override
  public void m1() {

  }
}