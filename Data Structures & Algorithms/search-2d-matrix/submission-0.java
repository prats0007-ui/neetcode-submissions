class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows=matrix.length,cols=matrix[0].length; 
        int top=0, bot=rows-1;
        while(top<=bot){ 
            int mid=top+(bot-top)/2;
            if(matrix[mid][cols-1]<target){ 
                top=mid+1;
            }
            else if(matrix[mid][0]>target){ 
                bot=mid-1;
            }
            else{ 
                break;
            }
        }

        if(!(top<=bot)){ 
            return false;
        }

        int l=0, r=cols-1;
        int res=(top+bot)/2;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(matrix[res][mid]<target){ 
                l=mid+1;
            }
            else if(matrix[res][mid]>target){ 
                r=mid-1;
            }
            else{ 
                return true;
            }
        }

        return false;
    }
}
