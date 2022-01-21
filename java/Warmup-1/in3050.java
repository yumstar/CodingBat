/*
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are 
both in the range 40..50 inclusive.
*/

public boolean in3050(int a, int b) {
  boolean aLowerRange = a >= 30 && a <= 40;
  boolean bLowerRange = b >= 30 && b <= 40;
  boolean aHigherRange = a >= 40 && a <= 50;
  boolean bHigherRange = b >= 40 && b <= 50;
  return aLowerRange && bLowerRange || aHigherRange && bHigherRange;
}