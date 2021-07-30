public class InheritanceExampl {
}
interface i111
{
  public void display(); // public abstract

}

class child1 implements i111{
  @Override
  public void display() {
  }
}

abstract class Main
{
  abstract  void show();
}
class child extends  Main
{

  @Override
  public void show() {
    System.out.println("welcome");
  }
}

//abstract and private modifier
//
//abstract and final modifier
//
//static and abstract

//------------>
//lower --------> higher

//private--> default--> protected--> public

// type conversion //automatic type casting


