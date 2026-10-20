class Solution:
    def shipWithinDays(self, weights: list[int], days: int) -> int:
        low=max(weights)
        high=sum(weights)
        while(low<=high):
            mid=low+(high-low)//2
            day=1
            calcweight=0
            for weight in weights:
                if (calcweight+weight<=mid):
                    calcweight+=weight
                else:
                    calcweight=weight
                    day+=1
            if day<=days:
                high=mid-1
            else:
                low=mid+1
        return low