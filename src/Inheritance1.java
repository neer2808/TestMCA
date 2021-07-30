class parent
{
  public int val1;
}

class child12 extends parent
{
  public int val1;
}

// dynamic method dispatch
public class Inheritance1 {
  public static void main(String[] args) {

    parent obj2 = new child12();
    obj2.val1=10;
    obj2 = new parent();
    obj2.val1= 30;




  }
}

