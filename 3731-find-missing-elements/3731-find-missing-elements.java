class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int min = 100;
        int max = 0;
        for(int i = 0;i<nums.length ;i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int[] arr = new int[max-min + 1];
        for(int i = 0;i<nums.length;i++){
            int store = nums[i]- min;
            arr[store]=1;
        }
        for(int j = 0; j<arr.length;j++){
            if(arr[j]==0){
                ans.add(j+min);
            }
        }
        return ans;
    }
}