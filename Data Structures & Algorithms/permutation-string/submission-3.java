public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> mp1 = new HashMap<>();

        for (char s:s1.toCharArray()) {
            mp1.put(s,mp1.getOrDefault(s, 0) + 1);
        }
        int need = mp1.size();
        for (int i = 0; i < s2.length(); i++) {
            Map<Character, Integer> mp2 = new HashMap<>();
            int count = 0;
            for (int j = i; j < s2.length(); j++) {
                mp2.put(s2.charAt(j),mp2.getOrDefault(s2.charAt(j), 0) + 1);
                if ( mp1.getOrDefault(s2.charAt(j),0) <mp2.get(s2.charAt(j)) ) {
                    break;
                }
                if (mp2.get(s2.charAt(j)) == mp1.getOrDefault(s2.charAt(j),0)) {
                    count++;
                }
                
                if (count == need) {
                    return true;
                }
            }
        }
        return false;
    }
}