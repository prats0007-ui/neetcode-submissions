class Solution {
    public int majorityElement(int[] nums) {
        int k=0,max=0,index=0; 
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){ 
            if(nums[i]==nums[i+1]){ 
                k++;
                if(k>=max){ 
                    max=k;
                    index=i;
                }
            }
            else{ 
                k=0;
            }
        }
        return nums[index];
    }
}