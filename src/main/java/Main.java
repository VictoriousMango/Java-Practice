class Main {
  public static void main(String args[]){
    int rowNumbers = 4;
    for (int i = 0; i < rowNumbers; i++){
      for (int j = 0; j < i+1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}