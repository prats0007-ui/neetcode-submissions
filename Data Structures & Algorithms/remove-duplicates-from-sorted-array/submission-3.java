class Solution {
    public int removeDuplicates(int[] nums) {
        // uses fast and slow pointers
        int k=1; 

        for(int i=1;i<nums.length;i++){ 
            if(nums[i]!=nums[i-1]){ 
                nums[k++]=nums[i];
                
            }
        }
        return k;
    }
}