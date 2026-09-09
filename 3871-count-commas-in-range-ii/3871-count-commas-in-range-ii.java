class Solution {
    public long countCommas(long n) {
        long total = 0;
        if (n >= 1000) total += (n - 999);
        if (n >= 1000000) total += (n - 999999);
        if (n >= 1000000000L) total += (n - 999999999L);
        if (n >= 1000000000000L) total += (n - 999999999999L);
        if (n >= 1000000000000000L) total += (n - 999999999999999L);
        return total;    }
}