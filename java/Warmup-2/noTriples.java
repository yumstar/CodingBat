/*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
*/

public boolean noTriples(int[] nums) {
  boolean triples = false;
  for(int i  = 0; i < nums.length-2 && !triples; i++){
    triples = nums[i] == nums[i+1] && nums[i] == nums[i+2] && nums[i+2] == nums[i+1];
  }
  return !triples;
}