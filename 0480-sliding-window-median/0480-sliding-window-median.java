import java.util.*;

class Solution {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        double[] result = new double[n - k + 1];
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        Map<Integer, Integer> invalidCount = new HashMap<>();
        
        for (int i = 0; i < k; i++) {
            maxHeap.add(nums[i]);
        }
        for (int i = 0; i < k / 2; i++) {
            minHeap.add(maxHeap.poll());
        }
        
        int balance = 0;
        result[0] = getMedian(maxHeap, minHeap, k);
        
        for (int i = k; i < n; i++) {
            int outNum = nums[i - k];
            int inNum = nums[i];
            
            invalidCount.put(outNum, invalidCount.getOrDefault(outNum, 0) + 1);
            
            if (!maxHeap.isEmpty() && outNum <= maxHeap.peek()) {
                balance--;
            } else {
                balance++;
            }
            
            if (!maxHeap.isEmpty() && inNum <= maxHeap.peek()) {
                maxHeap.add(inNum);
                balance++;
            } else {
                minHeap.add(inNum);
                balance--;
            }
            
            if (balance < 0) {
                maxHeap.add(minHeap.poll());
                balance += 2;
            } else if (balance > 0) {
                minHeap.add(maxHeap.poll());
                balance -= 2;
            }
            
            prune(maxHeap, invalidCount);
            prune(minHeap, invalidCount);
            
            result[i - k + 1] = getMedian(maxHeap, minHeap, k);
        }
        
        return result;
    }
    
    private double getMedian(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap, int k) {
        if (k % 2 == 1) {
            return (double) maxHeap.peek();
        } else {
            return ((double) maxHeap.peek() + minHeap.peek()) * 0.5;
        }
    }
    
    private void prune(PriorityQueue<Integer> heap, Map<Integer, Integer> invalidCount) {
        while (!heap.isEmpty() && invalidCount.containsKey(heap.peek())) {
            int num = heap.peek();
            int count = invalidCount.get(num);
            if (count == 1) {
                invalidCount.remove(num);
            } else {
                invalidCount.put(num, count - 1);
            }
            heap.poll();
        }
    }
}
