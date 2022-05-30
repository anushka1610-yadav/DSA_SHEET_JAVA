class Solution {
    public boolean canJump(int[] nums) {
        int r=0;
        for(int i=0;i<=r;i++)
        {
            r=Math.max(r, i+nums[i]);
            if(r>=nums.length-1)
                return true;
        }
        return false;
    }
}