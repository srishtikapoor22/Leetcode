class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos=0;
        int neg=1;
        int[] finalarr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                finalarr[pos]=nums[i];
                pos+=2;
            }
            else{
                finalarr[neg]=nums[i];
                neg+=2;
            }
        }
        return finalarr;
        
    }
}