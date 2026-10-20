class Solution:
    def splitArray(self, nums: list[int], k: int) -> int:
        low=max(nums)
        high=sum(nums)
        while(low<=high):
            mid=low+(high-low)//2
            calc=0
            cnt=1
            for add in nums:
                if(calc+add<=mid):
                    calc+=add
                else:
                    calc=add
                    cnt+=1
            if (cnt<=k):
                high=mid-1
            else:
                low=mid+1
        return low
        