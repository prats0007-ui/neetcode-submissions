class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str=new StringBuilder();
        int k=0,j=0; 
        int min=Math.min(word1.length(),word2.length()) ;

        for(int i=0;i<min;i++){ 
            str.append(word1.charAt(k)); 
            str.append(word2.charAt(j));
            k++;
            j++;
        }
        while(k<word1.length()) 
        { 
            str.append(word1.charAt(k)); 
            k++;  
        }

        while(j<word2.length()){ 
            str.append(word2.charAt(j)); 
            j++; 
        } 

        return str.toString();
    }
}