class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int p=0;                                    //row index
        int q=0;                                    //coloumn index
        
        while(p<m && q<n)
        {           
            for(int i=q; i<n; i++)                  //printing unprinted elements
                ans.add(matrix[p][i]);        //print topmost row
            p++;                                        
            
            for(int i=p; i<m; i++)
                ans.add(matrix[i][n-1]);         //print rightmost column
            n--;                                         
            
            if(p<m){
                for(int i=n-1; i>=q; i--)           
                ans.add(matrix[m-1][i]);         //print bottommost row
            m--;
            }
            
            if(q<n){
                for(int i=m-1; i>=p; i--)               
                ans.add(matrix[i][q]);        //print farleft coloumn
            q++;                                         
            }
            
            
        }
        return ans;
        
    }
}