class Solution {
    public int smallestNumber(int n, int t) {
        int ans = n;
        while (n <= 100) {
            int temp = n;
            int product = 1;
            while (temp > 0) {
                product = product * (temp % 10);
                temp = temp/10;
            }
            if (product % t == 0) {
                ans = n;
                break;
            }else n++;
        }
        return ans;
    }
}