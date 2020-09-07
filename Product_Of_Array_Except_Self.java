public class MyClass {
    
    public static int[] Product_Of_Array(int[]arr)
    {   int product=1;
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            product*=arr[i];
        }
        int[] ans=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            ans[i]=product/arr[i];
        }
        return ans;
        
    }
    public static void main(String args[]) {
     int[] arr={1,2,3,4,5};
     int[] result=Product_Of_Array(arr);
     
     for(int i=0;i<result.length;i++)
     {
         System.out.print(result[i]+" ");
     }
     
    }
}
