/*
Given 3 int values, a b c, return their sum. However, if one of the values is the same as 
another of the values, it does not count towards the sum.
*/

public int loneSum(int a, int b, int c) {
  return (a != b && a != c? a : 0) + (b != a && b != c? b : 0) + (c != a && c != b? c : 0);
}