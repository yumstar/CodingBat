/*
We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple 
of 11. Return true if the given non-negative number is special. Use the % "mod" operator
*/

public boolean specialEleven(int n) {
  return n % 11 <= 1;
}