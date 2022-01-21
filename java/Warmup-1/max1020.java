/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or 
return 0 if neither is in that range.
*/

public int max1020(int a, int b) {
  int max = 0;
  boolean aBounds = a >= 10 && a <= 20;
  boolean bBounds = b >= 10 && b <= 20;
  if(aBounds && bBounds){
    if(a >= b){
      max = a;
    }
    else{
      max = b;
    }
  }
  else if(aBounds){
    max = a;
  }
  else if(bBounds){
    max = b;
  }
  return max;
}
