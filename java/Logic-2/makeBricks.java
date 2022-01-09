/*
We want to make a row of bricks that is goal inches long. We have a number of small 
bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to 
make the goal by choosing from the given bricks. This is a little harder than it looks 
and can be done without any loops.
*/

/*
We want to make a row of bricks that is goal inches long. We have a number of small 
bricks (1 inch each) and big bricks (5 inches each). Return true if it is possible to make 
the goal by choosing from the given bricks. This is a little harder than it looks and can be 
done without any loops.
*/

public boolean makeBricks(int small, int big, int goal) {
  int bigNeeded =  goal / 5;
  if (bigNeeded <= big){
    return goal <= bigNeeded * 5 + small;
  }
  else {
    return goal <= big * 5 + small;
  }
}