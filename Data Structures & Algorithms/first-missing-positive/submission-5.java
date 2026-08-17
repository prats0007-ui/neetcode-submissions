class Solution {
    public int firstMissingPositive(int[] nums) {
        // step 1: mark all the negative numbers to zero 
        int n=nums.length;
        for(int i=0;i<n;i++){ 
            if(nums[i]<0) { 
                nums[i]=0;
            }
        }

        //step 2: 
        //      1. mark all numbers > 0, negative 
        //      2. mark the zero values as -(n+1) value as 0*-1 is 0 
        //      3. this negative marking algo is only applicable for range [1,n]
        //      4. check for num[val-1] lies within range then check if its greater or equal to 0 

        for(int i=0;i<n;i++){
            int val=Math.abs(nums[i]);
            if(val>=1 && val<=n){ 
                if(nums[val-1]>0){ 
                    nums[val-1]*=-1;
                }
                else if(nums[val-1]==0){ 
                    nums[val-1]=-1*(n+1);
                }
            }
        }

        // step 3: iterate from 1 to n and check if the value is positive still and return its index 
        
        for(int i=1;i<=n;i++){ 
            if(nums[i-1]>=0) { 
                return i; 
            }
        }

        return n+1;
        
    }
}