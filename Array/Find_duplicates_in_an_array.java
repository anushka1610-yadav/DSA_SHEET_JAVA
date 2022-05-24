class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int ind=Math.abs(nums[i])-1;
            int val=nums[ind];
            
            if(val<0)
            {
                ans.add(ind+1);
            }
            else {
                nums[ind] *= -1;
            }
        }
        return ans;
    }
}