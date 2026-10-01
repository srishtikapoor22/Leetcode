class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int highest=0;
        for(int i=0;i<piles.length;i++){
            highest=Math.max(highest,piles[i]);
        }
        int low=1;
        int high=highest;
        while(low<=high){
            int mid=low+(high-low)/2;
            long sum=0;
            for(int i=0;i<piles.length;i++){
                sum+=(mid+piles[i]-1)/mid;
            }
            if(sum>h){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
        
        
    }
}