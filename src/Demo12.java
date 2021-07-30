class Stu1
{

  int arr[];
  Stu1() // constructor
  {
    arr = new int[10];
  }
}
public class Demo12 {

  public static void main(String[] args) {
    Stu1 obj = new Stu1();
    System.out.println(obj.arr);

  }
}
