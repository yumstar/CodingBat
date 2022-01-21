/*
Given a non-empty string and an int N, return the string made starting with char 0, and 
then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
*/

public String everyNth(String str, int n) {
  String nString = str.substring(0, 1);
  int nCount = n;
  while(nCount < str.length()){
    nString = nString + str.charAt(nCount);
    nCount += n;
  }
  return nString;
}