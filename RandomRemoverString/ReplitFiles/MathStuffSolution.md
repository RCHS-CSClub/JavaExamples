for(int j = (int)Math.pow(10,places);j>1;j/=10){
      System.out.println(j);
      nums[h]=(a/j)%10;
      h++;
       System.out.println(nums[h]);
    }