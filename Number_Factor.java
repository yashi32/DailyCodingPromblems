/*Given a number ‘n’, implement a method to count how many possible ways there are to express ‘n’ as the sum of 1, 3, or 4.*/

class ExpressNumber {

  public int CountWays(int n) {
    if( n == 0)
      return 1; 
    if(n == 1)
      return 1; 

    if(n == 2)
      return 1; 

    if(n == 3)
      return 2; 
      
    // if we subtract 1, we are left with 'n-1'
    int subtract1 = CountWays(n-1);
    // if we subtract 3, we are left with 'n-3'
    int subtract3 = CountWays(n-3);
    // if we subtract 4, we are left with 'n-4'
    int subtract4 = CountWays(n-4);

    return subtract1 + subtract3 + subtract4;
  }

  public static void main(String[] args) {
    ExpressNumber en = new ExpressNumber();
    System.out.println(en.CountWays(4));
    System.out.println(en.CountWays(5));
    System.out.println(en.CountWays(6));
  }
}

