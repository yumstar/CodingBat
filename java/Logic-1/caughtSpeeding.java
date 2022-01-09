/*
You are driving a little too fast, and a police officer stops you. Write code to compute 
he result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed 
is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. 
If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your 
speed can be 5 higher in all cases
*/

public int caughtSpeeding(int speed, boolean isBirthday) {
  if((speed <= 60) || (speed <= 65 && isBirthday)) return 0;
  else if((61 <= speed && speed <= 80) || (61 <= speed && speed <= 85 && isBirthday)) return 1;
  else if((speed >=81) || (speed >= 86 && isBirthday)) return 2;
  return 0;
}