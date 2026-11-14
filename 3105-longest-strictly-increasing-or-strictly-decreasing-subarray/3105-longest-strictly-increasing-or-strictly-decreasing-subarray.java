class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1, dec = 1;
        int curr_inc = 1, curr_dec = 1; 
        int temp = nums[0];
        if(nums.length == 1)return 1;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>temp){
                curr_inc++;
                inc = Math.max(curr_inc,inc);
                curr_dec = 1;
                temp = nums[i];
            }else if(nums[i]<temp){
                curr_dec++;
                dec = Math.max(curr_dec,dec);
                curr_inc = 1;
                temp = nums[i];
            }else {
                temp = nums[i];
                curr_inc = 1;
                curr_dec = 1;
            }
        }
        return Math.max(inc,dec);
    }
}