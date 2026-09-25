class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            long firstelem=1;
            temp.add((int)firstelem);
            for(int j=1;j<=i;j++){
                firstelem=firstelem*(i-j+1);
                firstelem=firstelem/j;
                temp.add((int)firstelem);
            }
            ans.add(temp);
        }   
        return ans;     
    }
}