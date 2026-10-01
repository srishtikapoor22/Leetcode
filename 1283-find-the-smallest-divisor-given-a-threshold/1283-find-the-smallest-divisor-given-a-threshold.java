class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int highest=0;
        for(int i=0;i<nums.length;i++){
            highest=Math.max(highest,nums[i]);
        }
        int low=1;
        int high=highest;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=(mid+nums[i]-1)/mid;
            }
            if(sum>threshold){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
        
    }
}