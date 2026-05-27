class Solution {
    public int removeElement(int[] nums, int val) {
        int slow=0; 
        for(int num:nums){ 
            if(num!=val){ 
                nums[slow]=num;
                slow++;
            }
        }
        return slow;
    }
}