class Solution {
    public int maxScore(int[] card, int k) {
        int s=0;
        for(int i=0;i<k;i++)
        {
            s+=card[i];
        }
        int len=card.length;
        int maxS=s;
        int i=0;
        while(i<k)
        {
            s=s-card[k-i-1]+card[len-1-i];
            maxS=Math.max(maxS, s);
            i++;
        }
        return maxS;    
    }
}