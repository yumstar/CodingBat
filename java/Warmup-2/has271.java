/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the 
value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" 
differs by 2 or less from the correct value.
*/

public boolean has271(int[] nums) {
  boolean twoSevenOne = false;
  for(int i = 0 ; i < nums.length-2 &&!twoSevenOne;i++){
   twoSevenOne = (nums[i+1] == nums[i] + 5) && (nums[i+2] >= ((nums[i] - 1) - 2)) && (nums[i+2] <= ((nums[i] - 1) + 2));
  }
  return twoSevenOne;
}