class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> output = new ArrayList<>();
        for(int i = 0; i<=rowIndex ; i++){
            output.add(new ArrayList<>());
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    output.get(i).add(1);
                }else{
                    output.get(i).add(output.get(i-1).get(j-1)+output.get(i-1).get(j));
                }
            }
        }
        return output.get(rowIndex);
    }
}