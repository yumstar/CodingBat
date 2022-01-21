/*
Given 2 strings, a and b, return the number of the positions where they contain the same 
length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" 
substrings appear in the same place in both strings.
*/

public int stringMatch(String a, String b) {
  int matches = 0;
  int matchLength = 0;
  if(a.length() < b.length()) {
    matchLength = a.length();
  }
  else {
    matchLength = b.length();
  }
  
  for(int i = 0; i < matchLength - 1; i++){
    if(a.charAt(i) == b.charAt(i) && a.charAt(i+1) == b.charAt(i+1)){
      matches++;
    }
  }
  return matches;
}