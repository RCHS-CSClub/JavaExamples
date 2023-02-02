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