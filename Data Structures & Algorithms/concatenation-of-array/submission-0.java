class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*nums.length]; 
        for(int i=0;i<ans.length;i++){ 
            int k=0;
            k=nums[i%nums.length];
            ans[i]=k;
            
        }
        return ans;
    }
}