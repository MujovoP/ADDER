import java.util.ArrayList;
import java.util.Scanner;

class MainClass {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    ArrayList<Integer> num = new ArrayList<>();
10
    int size;
    System.out.println("values");
    size = kb.nextInt();

    System.out.println("numbers");
      for(int i=0;i<size;i++) {
      num.add(kb.nextInt());
      }
    for(int value:num) {
      System.out.println(value);
    }
  }
}