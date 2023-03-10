import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter String");
    
    String passString = myObj.nextLine(); 
    StringStuff myString = new StringStuff(passString);

    boolean isValid = false;
    int numRemoves = 0;
    while (!isValid) {
      System.out.println("Enter NumIndexes to Remove");
      numRemoves = myObj.nextInt();
      if (numRemoves < myString.GetLength()){
        break;
      }
      else {
        System.out.println("Invalid Input. Input is larger than string length.");
      }
    }
    myString.SetIndexes(numRemoves);
    myString.RemoveRandom();
    System.out.print(myString.GetString());
  }
}