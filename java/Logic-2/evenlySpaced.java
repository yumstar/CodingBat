/*
Given three ints, a b c, one of them is small, one is medium and one is large. Return true 
if the three values are evenly spaced, so the difference between small and medium is the 
same as the difference between medium and large.
*/

public boolean evenlySpaced(int a, int b, int c) {
  int small = 0;
  int medium = 0;
  int large = 0;
  
  if(a < b) {
    small = a;
    large = b;
  }
  else {
    small = b;
    large = a;
  }
  
  if (small < c) {
    if(large < c) {
      medium = large;
      large = c;
    }
    else {
      medium = c;
    }
  }
  else {
    medium = small;
    small = c;
  }
  
  return large - medium == medium - small;
}