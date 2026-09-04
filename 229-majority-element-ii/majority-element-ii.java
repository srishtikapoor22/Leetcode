class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0;
        int cnt2=0;
        int elem1=Integer.MIN_VALUE;
        int elem2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(cnt1==0 && nums[i]!=elem2){
                elem1=nums[i];
                cnt1++;
            }
            else if(cnt2==0 &&nums[i]!=elem1){
                elem2=nums[i];
                cnt2++;
            }
            else if(elem1==nums[i]){
                cnt1++;
            }
            else if(elem2==nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
            }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(elem1==nums[i]){
                cnt1++;
            }
            if(elem2==nums[i]){
                cnt2++;
            }
        }
        int min=nums.length/3;
        ArrayList<Integer> res= new ArrayList<>();
        if(cnt1>min){res.add(elem1);}
        if(cnt2>min){res.add(elem2);}
        return res;

        
    }
}