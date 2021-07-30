import java.util.Scanner;
public class Demo4 {
  int rollno;
  String name;
  public Demo4(int rollno, String name) {
    this.rollno = rollno;
    this.name = name;
  }
}

class Demo4Main
{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Demo4 arr[] = new Demo4[5];
    for (int i = 0; i <arr.length ; i++) {
      arr[i] = new Demo4(s.nextInt(),s.next());
    }
    for (int i = 0; i <arr.length ; i++) {
      System.out.println(arr[i].name + "    "+ arr[i].rollno);
    }

  }
}
