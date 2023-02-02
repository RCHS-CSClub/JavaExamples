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

class StringStuff{
  public String a;
  public int indexRemove;

  StringStuff(String passString){
    a = passString;
  }

  void SetIndexes(int numRemoves){
    indexRemove = numRemoves;
  }
  
  int GetLength(){
    return(a.length());
  }

  void SetString(String u){
    a = u;
  }

  String GetString(){
    return(a);
  }
  
 void RemoveRandom(){
    for (int i=0; i<indexRemove; i++){
      String s1 = a; 
      int x = (int)(Math.random() * GetLength());
      String s2 = s1.substring(0,x) + s1.substring((x+1));
      SetString(s2);
    }
  }
}