class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0;
        
        while(i<j)
        {
            int w=j-i;
            int h=Math.min(height[i], height[j]);
            ans=Math.max(ans, h*w);
            
            if(height[i]<height[j])
            {
                i++;
            }
            else {
                j--;
            }
        }
        return ans;
    }
}