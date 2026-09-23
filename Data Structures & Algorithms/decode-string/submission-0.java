class Solution {
    public String decodeString(String s) {
        Deque<Integer> counts = new ArrayDeque<>();   
    Deque<StringBuilder> strs = new ArrayDeque<>(); 
    StringBuilder cur = new StringBuilder();       
    int k = 0;                                       
    for (char c : s.toCharArray()) {
        if (Character.isDigit(c)) {
            k = k * 10 + (c - '0');       
        } else if (c == '[') {
            counts.push(k);               // save the multiplier for this level
            strs.push(cur);               // save whatever we'd built so far at the outer level
            cur = new StringBuilder();    // start fresh — everything inside this bracket builds into a NEW buffer
            k = 0;                        // reset k for the next number we might read
        } else if (c == ']') {
            StringBuilder prev = strs.pop();     // get back the outer level's buffer
            int n = counts.pop();                // get back this bracket's multiplier
            prev.append(String.valueOf(cur).repeat(n)); // repeat cur n times, tack onto outer buffer
            cur = prev;                          // now "cur" IS the outer buffer again
        } else {
            cur.append(c);   // ordinary letter — just add it to whatever buffer we're currently filling
        }
    }
    return cur.toString();
    }
}