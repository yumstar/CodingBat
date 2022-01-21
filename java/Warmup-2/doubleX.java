/*
Given a string, return true if the first instance of "x" in the string is immediately followed 
by another "x".
*/

boolean doubleX(String str) {
  boolean doubleX = false;
  if(str.length() > 1 && str.indexOf("x") >=0 && str.indexOf("x") < str.length() - 1 ){
    doubleX = str.charAt(str.indexOf("x")) == 'x' && str.charAt(str.indexOf("x") + 1) == 'x';
  }
  return doubleX;
}
