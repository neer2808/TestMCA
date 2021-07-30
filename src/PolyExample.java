class First
{
  int rollno;
  First()
  {
    rollno = 10;
  }
}
class Second extends First
{
  int rollno;
  Second()
  {
    rollno = 20;
  }
}
public class PolyExample {
  public static void main(String[] args) {
    First obj = new Second();
    obj.rollno = 60;
    System.out.println(obj.rollno);

  }
}

