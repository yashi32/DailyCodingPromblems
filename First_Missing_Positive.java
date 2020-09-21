class Solution {
    public int firstMissingPositive(int[] nums) {
        int correctPos=0;
        int n=nums.length;
        int x=0;
        for(int i=0;i<n;i++)
        {   
            correctPos=nums[i]-1;
            while(((nums[i]>=1) && (nums[i]<=n)) && (nums[i]!=nums[correctPos]) )
            {
                x=nums[i];
                nums[i]=nums[correctPos];
                nums[correctPos]=x;
                correctPos=nums[i]-1;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(i+1!=nums[i])
            {
                return i+1;
                
            }
        }
        return n+1;
    }
}
