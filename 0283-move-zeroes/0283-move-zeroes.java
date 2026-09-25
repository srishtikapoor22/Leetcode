class Solution {
    public void moveZeroes(int[] nums) {
        int j=-1;
        for(int a=0;a<nums.length;a++){
            if(nums[a]==0){
                j=a;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }

        
    }
}