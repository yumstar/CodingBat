/*
Given a string, return a new string made of every other char starting with the first, so 
"Hello" yields "Hlo".
*/

public String stringBits(String str) {
  String other = "";
  if (str.length() > 1){
    for(int i  = 0; i < str.length(); i++){
      if(i % 2 == 0){
        other += str.charAt(i);
      }
    }
  }
  return other;
}
