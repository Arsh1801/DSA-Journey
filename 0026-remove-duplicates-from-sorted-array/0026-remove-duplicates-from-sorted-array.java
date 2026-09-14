class Solution {
    public int removeDuplicates(int[] nums) {
        int unique=1,i=0,j=0;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                unique++;
            }
        }
        return unique;
    }
}