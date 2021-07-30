public abstract class Demo7 {
  // instance variables
  public int val1;
  public int val2;
  Demo7(int a, int b)
  {
    val1 = a;
    val2 = b;
  }
}
class Demo8 extends Demo7
{
  public int val3;
  public int val4;
  public Demo8(int a, int b, int c, int d)
  {
   super(a,b);
    val3 = c;
    val4 = d;
  }
}
class Demo9 extends Demo7
{
  public int val5;
  public int val6;
  public Demo9(int a, int b,int c, int d)
  {
   super(a,b);
    val5 = c;
    val6 = d;

  }
}

