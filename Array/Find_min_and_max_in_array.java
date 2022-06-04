// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            pair product = obj.getMinMax(a, n); 
            System.out.println(product.first+" "+product.second);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

/*
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        //Write your code here
        pair pair = new pair(a[0],a[0]);
        int i;
        if(n%2==0)
        {
            if(a[0]>a[1])
            {
                pair.first=a[1];
                pair.second=a[0];
            }
            else
            {
                pair.first=a[0];
                pair.second=a[1];
            }
            i=2;
        }
        else
        {
            pair.first=a[0];
            pair.second=a[0];
            i=1;
        }
        
        while(i<n-1)
        {
            if(a[i]<=a[i+1])
            {
                if(a[i+1]>pair.second)
                {
                    pair.second=a[i+1];
                }
                if(a[i]<pair.first)
                {
                    pair.first=a[i];
                }
            }
            else
            {
                if(a[i]>a[i+1])
                {
                    if(a[i]>pair.second)
                    {
                        pair.second=a[i];
                    }
                    if(a[i+1]<pair.first)
                    {
                        pair.first=a[i+1];
                    }
                }
            }
            i=i+2;
        }
        return pair;
        
    }
}
