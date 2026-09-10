class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,res=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){ 
            int sum=0;
            for(int j=r;j<nums.length;j++){ 
                sum+=nums[j]; 
                if(sum>=target){ 
                    res=Math.min(res,j-r+1);
                    break;
                    
                }
                
            }
            
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}