class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){ 
            if(val==nums[i]){ 
                nums[i]=-1;
            }
            else{ 
                j++;
            }
        }
        int k=0;
        for(int i=0;i<nums.length;i++){ 
            if(nums[i]!=-1){ 
                nums[k]=nums[i]; 
                k++;
            }
        }
        return k;
    }
}