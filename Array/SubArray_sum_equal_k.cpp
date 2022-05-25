class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            int rsum=s-k;
            if(mp.containsKey(rsum))
            {
                ans+=mp.get(rsum);
            }
            mp.put(s, mp.getOrDefault(s,0)+1);
        }
        return ans;
    }
}