class Solution {
    public int subarraySum(int[] nums, int k) {
        // either 0 or k must be the sum
        //the key is the sum and we are counting 
        //so that when we subtract say [2,-1,1,2]
        //[0,1] - > intially 
        //[2,1] cnt=1 cuz sum-k=0
        //[1,1] 
        //[2,2] sum-k is 0, so here retrieve the value of key 0 that is 1 and update the to cnt+=1 => 2
        //[4,1] here if you see sum-k is 2 and retireve value of the key 2 that is 2 and uupdate cnt=2+2 => 4

        Map<Integer,Integer> mp=new HashMap<>(); 
        int sum=0,cnt=0;
        mp.put(0,1);
        for(int num:nums){ 
            sum+=num;
            if(mp.containsKey(sum-k)) { 
                cnt+=mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}