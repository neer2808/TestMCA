class Student extends Object
{
  int rollno;
  String name;

  public Student(int rollno, String name) {
    super();
    this.rollno = rollno;
    this.name = name;
  }

//  @Override
//  public String toString() {
//    return rollno + "   " + name;
//  }
}
public class Test101 {
  public static void main(String[] args) {
    Student obj = new Student(10,"neeraj");
    Student obj2 = new Student(20,"Ajay");
    System.out.println(obj);
    System.out.println(obj2);

    String s = new String("GLA University");
    System.out.println(s);
  }
}

// Object class
//toString() method
