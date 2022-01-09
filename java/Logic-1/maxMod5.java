/*
Given two int values, return whichever value is larger. However if the two values 
have the same remainder when divided by 5, then the return the smaller value. 
However, in all cases, if the two values are the same, return 0. Note: the % "mod" 
operator computes the remainder, e.g. 7 % 5 is 2.
*/

public int maxMod5(int a, int b) {
  if(a == b) return 0;
  if(a % 5 == b % 5) return a < b? a : b;
  else return a < b? b : a;
}