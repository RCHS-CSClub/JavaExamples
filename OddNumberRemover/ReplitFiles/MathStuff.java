class MathStuff{
  public int a;
  public int b;

  MathStuff(int number){
    a = number;
  }
  public int GetPlaces2(){
    int i = 1, g=0;
    if(a<=1){
      return(0);
    }
    while(i<a){
      i*=10;
      g+=1;
    }
    return(g);
  }
  
  int RemoveNumber(){
    int places = GetPlaces2();
    int[] nums = new int[places];
    int h=0;
    for(int j=1;j<Math.pow(10,places);j*=10){
      nums[h]=(a/j)%10;
      h++;
    }
    for(int i=0;i<places;i++){
      if(nums[i]%2 != 0){
        nums[i]=0;
      }
    }
    h=0;
    int finalnum = 0;
    for(int g=1;g<Math.pow(10,places);g*=10){
      finalnum = finalnum + nums[h]*g;
      h++;
    }
    return(finalnum);
  }
}