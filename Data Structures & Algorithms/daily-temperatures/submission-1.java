class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int arr[] =new int[temperatures.length];
        int r=0,cnt=0;
        for(int i=0;i<temperatures.length;i++){
            r=i;
            cnt=0;
            while(r<temperatures.length){ 
                if(temperatures[i]<temperatures[r]) { 
                arr[i]=cnt;
                break;
                }
            else{
                cnt++;
                r++;
            }
        }

            
            
        }
        return arr;
    }
}
