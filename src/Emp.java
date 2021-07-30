public class Emp {
  int id;
  String name;
  //Instance initialization block
  static int count;
  {
    count++;
    System.out.println("inside the instance block ");
  }

  // it is a class level one time execution block
  static
  {

  }

  // jdbc
  // connection object


 public Emp()
  {
   // count++;
    id = 10;
    name = "abc";
    System.out.println("inside no argument constructor");
  }

  public Emp(int id, String name) {
  //count++;
    this.id = id;
    this.name = name;
    System.out.println("inside argument constructor ");
  }
}
// default constructor
class EmpMain
{
  public static void main(String[] args) {
    Emp obj2 = new Emp();
    Emp obj1 = new Emp(11,"AAA");
    System.out.println(Emp.count);


  }
}

// int a = 10
// a = 20
