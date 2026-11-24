class Solution:
    def romanToInt(self, s: str) -> int:
        romanlist: dict[str,int]={
            "I":1,
            "V":5,
            "X":10,
            "L":50,
            "C":100,
            "D":500,
            "M":1000
        }
        ans=0
        for i in range(len(s)):
            value=romanlist[s[i]]
            if (i+1<len(s) and value<romanlist[s[i+1]]):
                ans-=value
            else:
                ans+=value
        return ans

        