public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int res[]=new int[nums.length-k+1]; 
        int l=0,r=0; 
        int n=nums.length; 
        Deque<Integer> q=new LinkedList<>();

        while(r<n){
            while(!q.isEmpty() && nums[r]>nums[q.getLast()]){ 
                q.removeLast();
            }
            q.addLast(r);

            if(l>q.getFirst()){ 
                q.removeFirst();
            }
            if((r+1)>=k){ 
                res[l]=nums[q.getFirst()];
                l++;
            }
            r++;
        }
        return res;
    }
}