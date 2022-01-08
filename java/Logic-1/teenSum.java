/*
Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 
inclusive, are extra lucky. So if either value is a teen, just return 19. 
*/

public int teenSum(int a, int b) {
  return (13 <= a && a <= 19) ||  (13 <= b && b <= 19)? 19 : a + b; 
}