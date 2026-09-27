class Solution {
    public int mySqrt(int x) {
        int f = 1, l = x;
        while (f <= l) {
            int m = f + (l - f) / 2;
            if (m == x / m) return m;
            if (m < x / m) f = m + 1;
            else l = m - 1;
        }
        return l;

    }
}