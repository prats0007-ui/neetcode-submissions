class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=n;
        while(j>0){ 
            nums1[nums1.length-j]=nums2[i];
            j--;
            i++;
        }
        Arrays.sort(nums1); 

    }
}