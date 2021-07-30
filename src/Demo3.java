public class Demo3 {
  int arr[];  // declaration
  public Demo3()
  {
    arr= new int[10];// creation
    for (int i = 0; i <arr.length ; i++)  // initialization
      {
        arr[i] = i;
      }
      for (int j = 0; j <arr.length ; j++) {
        System.out.println(arr[j]);
      }
    }


  public static void main(String[] args) {
    Demo3  obj = new Demo3();

  }


}
