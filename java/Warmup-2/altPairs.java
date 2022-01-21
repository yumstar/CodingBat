/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" 
yields "kien".
*/

public String altPairs(String str) {
  String alt = "";
  for(int i = 0; i < str.length();i++){
    if(i % 4 == 0 || i % 4 == 1){
      alt += str.charAt(i);
    }
  }
  return alt;
}