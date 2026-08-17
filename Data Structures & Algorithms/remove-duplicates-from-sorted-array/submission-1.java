class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new TreeSet<>(); 
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){ 
            set.add(nums[i]);
        }

        for(int num:set){ 
            list.add(num);
        }

        for(int i=0;i<list.size();i++){ 
            nums[i]=list.get(i);
        }
        return list.size();
    }
}