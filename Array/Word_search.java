class Solution {
   
    public boolean exist(char[][] b, String w) {
        for(int i=0;i<b.length;i++)
            for(int j=0;j<b[0].length;j++)
                if(b[i][j]==w.charAt(0) && dfs(b,i,j,0,w))
                    return true;
        return false;     
    }
     private boolean dfs(char[][] b, int i, int j, int c, String w)
    {
        if(c==w.length())
            return true;
        if(i<0 || j<0 || i>=b.length || j>=b[0].length || b[i][j]!=w.charAt(c))
            return false;
        char t=b[i][j];
        b[i][j]='@';
        boolean found = dfs(b,i+1,j,c+1,w) ||  dfs(b,i-1,j,c+1,w) ||  dfs(b,i,j+1,c+1,w) ||  dfs(b,i,j-1,c+1,w);
        b[i][j]=t;
        return found;
    }
}