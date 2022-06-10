long long maxSubarraySum(int arr[], int n){
        
        // Your code here
        int curr =0;
        int sum=arr[0];
        for(int i=0;i<n;i++)
        {
            curr+=arr[i];
            if(sum<curr)
            {
                sum = curr;
            }
              if(curr<0)
            {
                 curr=0;
            }
        }
        return sum;
    }
};