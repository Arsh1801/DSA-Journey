import java.util.HashSet;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num); 
            }
        }
        
        int[] sol = new int[intersectionSet.size()];
        int idx = 0;
        for (int num : intersectionSet) {
            sol[idx++] = num;
        }
        return sol;
    }
}
