import java.io.FileNotFoundException;

public class TextA {

  public static void m1()  {

    System.out.println(10/0);




    // System.out.println(10/0);
  }
  public static void main(String[] args) throws InterruptedException {
    System.out.println("inside main method");

    m1();

    System.out.println("end of the main method");
  }
}
