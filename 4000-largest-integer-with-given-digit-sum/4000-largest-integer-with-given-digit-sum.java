class Solution {
    public int largestInteger(int n, int s) {
        int output = 0;
        if(s>9*n){
            return -1;
        }
        for(int i = 0; i<n; i++){
            if(s>=9){
                output = (output * 10) + 9;
                s = s-9;
            }else if(s<9){
                output = (output * 10) + s;
                s = s - s;
            }
        }
        return output;
    }
}