import java.util.*;

class Main {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of row: ");
    int rowNumbers = sc.nextInt();
    for (int i = 0; i < rowNumbers; i++){
      for (int j = 0; j < i+1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}