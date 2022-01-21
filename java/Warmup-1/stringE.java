/*
Return true if the given string contains between 1 and 3 'e' chars.
*/

public boolean stringE(String str) {
  int noe = 0;
  for(int i = 0; i < str.length(); i++){
    if(str.charAt(i) == 'e'){
      noe++;
    }
  }
  if(noe >= 1 && noe <=3){
    return true;
  }
  else{
    return false;
  }
}
