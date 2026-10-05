class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=Arrays.stream(weights).max().getAsInt();
        int r=Arrays.stream(weights).sum();
        int res=r;
        while(l<=r){ 
            int mid=l+(r-l)/2; 
            if(canShip(mid,weights,days)){ 
                res=mid; 
                r=mid-1;
            }
            else{ 
                l=mid+1;
            }
        }
        return res;
    }

    private boolean canShip(int cap, int[] weights , int days){ 
        int ships=1; int currCap=cap; 

        for(int w:weights){ 
            if(currCap-w<0){ 
                ships++; 
                if(ships>days)
                {
                    return false;
                } 
                currCap=cap;
            }
            currCap-=w;
        }
        return true;
    }
}