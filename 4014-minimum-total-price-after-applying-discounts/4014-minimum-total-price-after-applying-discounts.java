class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double minprice = 0;
        double discount = 0;
        int j = prices.length-1;
        for(int i = discounts.length-1;i>=0;i--){
            if(j>=0){
            minprice += ((prices[j] * (100 - discounts[i])) / 100.0);
            j--;
            }
        }
        while (j >= 0) {
            minprice += prices[j];
            j--;
        }
        return minprice;
    }
}