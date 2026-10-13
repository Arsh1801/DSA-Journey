class Solution {
    public int longestSubstring(String s, int k) {
        return helper(s, 0, s.length(), k);
    }
    private int helper(String s, int start, int end, int k) {
        if (end - start < k) return 0;
        int[] counts = new int[26];
        for (int i = start; i < end; i++) {
            counts[s.charAt(i) - 'a']++;
        }
        for (int i = start; i < end; i++) {
            if (counts[s.charAt(i) - 'a'] < k) {
                int nextStart = i + 1;
                while (nextStart < end && counts[s.charAt(nextStart) - 'a'] < k) {
                    nextStart++;
                }
                return Math.max(helper(s, start, i, k), helper(s, nextStart, end, k));
            }
        }
        return end - start;
    }
}
