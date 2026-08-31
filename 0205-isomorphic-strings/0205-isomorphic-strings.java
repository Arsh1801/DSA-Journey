class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character,Character> mapOne = new HashMap<>();
        Map<Character,Character> mapTwo = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapOne.containsKey(charS)) {
                if (mapOne.get(charS) != charT) {
                    return false; 
                }
            } else {
                mapOne.put(charS, charT); 
            }
            if (mapTwo.containsKey(charT)) {
                if (mapTwo.get(charT) != charS) {
                    return false; 
                }
            } else {
                mapTwo.put(charT, charS); 
            }
        }
        return true; 
    }
}