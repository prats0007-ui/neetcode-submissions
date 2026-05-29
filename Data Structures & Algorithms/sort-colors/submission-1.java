class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,r=nums.length; 
        while(m<r){ 
            if(nums[m]==0){
                swap(l,m,nums); 
                l++;
            }
            else if(nums[m]==2){ 
                swap(m,r-1,nums);
                r--;
                m--;
            }
            m++;
        }
    }

    public void swap(int l,int r,int[] nums){
        while(l<=r){
            int temp=nums[l]; 
            nums[l]=nums[r]; 
            nums[r]=temp;
            l++; 
            r--;
        }
    }
}