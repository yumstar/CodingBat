/*
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" 
return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all 
other cases, return the string unchanged. 
*/

public String fizzString(String str) {
  String fizzString = "";
  if(str.charAt(0) == 'f') {
    fizzString += "Fizz";
  }
  if(str.charAt(str.length() - 1) == 'b') {
    fizzString += "Buzz";
  }
  if(fizzString.length() > 0) return fizzString;
  else return str;
}
