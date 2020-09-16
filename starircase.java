public class HelloWorld{
    
    public static int CountWays(int n)
{
  int dp[]=new int[n+1];
  dp[0]=1;
  dp[1]=1;
  dp[2]=1;
  for(int i=3;i<=n;i++)
  {
    dp[i]=dp[i-1]+dp[i-2];
    
  }
  return dp[n];
}
     public static void main(String []args){
         
         int n =CountWays(5);
         System.out.println(n);

        
     }
}
