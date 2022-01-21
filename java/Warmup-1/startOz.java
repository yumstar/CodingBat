/*
Given a string, return a string made of the first 2 chars (if present), however include first 
char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
*/

public String startOz(String str) {
  String start = "";
  if(str.length() > 0 &&str.charAt(0) == 'o'){
    start += "o";
  }
  if(str.length() > 1 && str.charAt(1) == 'z'){
    start += "z";
  }
  return start;
}