class Solution:
    def minDays(self, bloomDay: list[int], m: int, k: int) -> int:
        if(len(bloomDay)<m*k):
            return -1
        
        low=min(bloomDay)
        high=max(bloomDay)
        while(low<=high):
            mid=low+(high-low)//2
            bqt=0
            flower=0
            for day in bloomDay:
                if day<=mid:
                    flower+=1
                else:
                    bqt+=flower//k
                    flower=0
            bqt+=flower//k
            if bqt>=m:
                high=mid-1
            else:
                low=mid+1
        return low
