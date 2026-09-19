class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int k = j;
        int[] square = new int[nums.length];
        while(i<=j){
            if((nums[i]*nums[i]) <= (nums[j]*nums[j])){
                square[k] = (nums[j]*nums[j]);
                k--;
                j--;
            }else{
                square[k] = (nums[i]*nums[i]);
                k--;
                i++;
            }
        }
        return square;
    }
}