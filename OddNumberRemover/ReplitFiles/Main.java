import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Enter number");
    
    int passNumber = myObj.nextInt(); 
    MathStuff number = new MathStuff(passNumber);
    
    int finalnum = number.RemoveNumber();
    System.out.print(finalnum);
    
  }
}