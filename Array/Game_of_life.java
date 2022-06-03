class Solution {
    private int[][] directions = new int[][] {{0,1},{1,0},{-1,0},{0,-1},{-1,-1},{-1,1},{1,-1},{1,1}};
    public void gameOfLife(int[][] b) {
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                if(b[i][j]==1)
                {
                    int active=getActive(b, i, j);
                    if(active<2 || active>3)
                        b[i][j]=-2;
                }
                else if(b[i][j]==0)
                {
                    int active=getActive(b, i, j);
                    if(active==3)
                        b[i][j]=3;
                }
            }
        }
        updateboard(b);
        return;
    }
    private void updateboard(int[][] b)
    {
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[0].length;j++)
            {
                if(b[i][j]==-2) b[i][j]=0;
                if(b[i][j]==3) b[i][j]=1;
            }
        }
    }
    private int getActive(int[][] b, int r, int c)
    {
        int a=0;
        for(int[] d: directions)
        {
            int newR=r+d[0];
            int newC=c+d[1];
            if(newR>=0 && newR<b.length && newC>=0 && newC<b[0].length && (b[newR][newC]==1 || b[newR][newC]==-2))
                a++;
        }
        return a;
    }
}