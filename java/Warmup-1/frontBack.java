/*
Given a string, return a new string where the first and last chars have been exchanged.
*/

public String frontBack(String str) {
  if(str.length() > 1){
  return str.substring(str.length()-1,str.length()) + str.substring(1,str.length()-1) + str.substring(0,1);
  }
  else{
    return str;
  }
}