class Solution {
    public void reverse(int[] nums,int l, int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
            }
    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        // int l=0;
        // int r=nums.length-1;
        // //array reversal
        // while(l<r){
        //     int temp=nums[l];
        //     nums[l]=nums[r];
        //     nums[r]=temp;
        //     l++;
        //     r--;
        // }

        // l=0;
        // r=k-1;
        // //left side reversal
        // while(l<r){
        //     int temp=nums[l];
        //     nums[l]=nums[r];
        //     nums[r]=temp;
        //     l++;
        //     r--;
        // }

        // l=k;
        // r=nums.length-1;
        // //right side reversal
        // while(l<r){
        //     int temp=nums[l];
        //     nums[l]=nums[r];
        //     nums[r]=temp;
        //     l++;
        //     r--;
        // }


    }
}