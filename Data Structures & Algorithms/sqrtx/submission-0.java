class Solution {
    public int mySqrt(int x) {
        int l=0,r=x; 
        int res=0;
        while(l<=r){ 
            int mid=l+(r-l)/2;
            
            
            if((long)mid*mid==x){ 
                return mid;
            }
            else if((long)mid*mid<x){ 
                l=mid+1;
                res=mid;
            }
            else{
                r=mid-1;
            }
        }
        return res;
    }
}