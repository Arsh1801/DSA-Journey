class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] output = new String[score.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        int flag = 0;
        
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < score.length; i++) {
            maxHeap.add(score[i]);
        }
        for (int i = 0; i < score.length; i++) {
            int topElement = maxHeap.peek();
            flag++;            
            int originalIndex = map.get(topElement); 
            
            if (flag == 1) {
                output[originalIndex] = "Gold Medal";
            } else if (flag == 2) {
                output[originalIndex] = "Silver Medal";
            } else if (flag == 3) {
                output[originalIndex] = "Bronze Medal";
            } else {
                output[originalIndex] = String.valueOf(flag);
            }
            maxHeap.poll();
        }
        return output;
    }
}
