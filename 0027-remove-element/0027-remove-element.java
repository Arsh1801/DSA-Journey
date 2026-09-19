class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]== val){
                count++;
            }
        }
        int fin = nums.length-count;
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]== val){
                count--;
            }else{
                nums[i]=nums[j];
                i++;
            }
        }
        return fin;
    }
}