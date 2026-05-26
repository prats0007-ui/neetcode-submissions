class Solution {
    public boolean isAnagram(String s, String t) {
        int ar[]=new int[126];

        if(s.length() != t.length())
         return false;
        for(int i=0;i<s.length();i++){ 
            ar[s.charAt(i)]++;
            ar[t.charAt(i)]--;
        }

        for(int num:ar){ 
            if(num!=0){ 
                return false;
            }
        }

        

        return true;
    }
}
