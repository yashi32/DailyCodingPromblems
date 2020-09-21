
/* Largest Sum of Non-Adjacent number*/

public int findMaximumNonAdjacentSum(int arr[]) {
  int len = arr.length;
  if(len == 0 ) {
    return 0;
  }
  
  if(len ==1 ) {
    return arr[0];
  }
  
  int[] sum = new int[len];
  sum[len-1] = arr[len-1];
  sum[len-2] = Math.max(arr[len-1], arr[len-2]);
  
  for(int i=len-3;i>=0;i--) {
    sum[i] = Math.max(arr[i] + sum[i+2], sum[i+1]);
  }
  
  return sum[0];
}
