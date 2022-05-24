class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans=0;
        HashMap<Integer, Integer> mp=new HashMap<>();
        mp.put(0,1);
        int s=0,r=0;
        for(int i=0;i<nums.length;i++)
        {
            s+=nums[i];
            r=s%k;
            if(r<0)
            {
                r+=k;
            }
            if(mp.containsKey(r))
            {
                ans+=mp.get(r);
                mp.put(r,mp.get(r)+1);
            }
            else
            {
                mp.put(r,1);
            }
        }
        return ans;
    }
}