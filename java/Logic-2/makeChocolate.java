/*
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and 
big bars (5 kilos each). Return the number of small bars to use, assuming we always use 
big bars before small bars. Return -1 if it can't be done.
*/

public int makeChocolate(int small, int big, int goal) {
  int bigNeeded = goal / 5;
  if(bigNeeded <= big){
    if(goal - bigNeeded * 5 <= small){
      return goal - bigNeeded * 5;
    }
    else {
      return -1;
    }
  }
  else {
    if(goal - big * 5 <= small) {
      return goal - big * 5;
    }
    else {
      return -1;
    }
  }
}

// Alternative Version

public int makeChocolate(int small, int big, int goal) {
  int bigNeeded = goal / 5;
  int bigToUse = bigNeeded <= big? bigNeeded : big;
  int smallToUse = goal - bigToUse* 5;
  return smallToUse <= small? smallToUse : -1; 
}