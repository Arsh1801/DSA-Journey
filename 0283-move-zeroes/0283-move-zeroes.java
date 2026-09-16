class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        for(j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
        }
        for(int k = i; k<nums.length;k++){
                nums[k]=0;
            }
        }
    }