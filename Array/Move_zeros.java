class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        if(n==0 || n==1)
            return;
        
        int l=0,r=0,t;
        while(r<n)
        {
            if(nums[r]==0)
                r++;
            else
            {
                t=nums[l];
                nums[l]=nums[r];
                nums[r]=t;
                l++;
                r++;
            }
        }
        
        
    }
}