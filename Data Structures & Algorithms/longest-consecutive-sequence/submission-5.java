public class Solution {
    public int longestConsecutive(int[] nums) { 
        int cnt=1,max=1;
        //sorting first then converting into hashset doesnt work
        //bcz hashset is unordered
        HashSet<Integer> set=new HashSet<>(); 
        for(int i=0;i<nums.length;i++){ 
            set.add(nums[i]);
           
        }
         System.out.println(set);
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        if(list.isEmpty()){ 
            return 0;
        }
        if(list.size()==1){ 
            return 1;
        }
        for(int i=1;i<list.size();i++){ 
            
            if(list.get(i)-list.get(i-1)==1){ 
                cnt++;
                max=Math.max(max,cnt);
            }
            else{ 
                cnt=1;
            }
        }

        return max;
    }
}