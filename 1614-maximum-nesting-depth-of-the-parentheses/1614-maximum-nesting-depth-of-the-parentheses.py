class Solution:
    def maxDepth(self, s: str) -> int:
        count=0
        maxcnt=0
        for i in range(len(s)):
            if s[i]=="(":
                count+=1
                maxcnt=max(maxcnt,count)

            elif s[i]==")":
                count-=1
        return maxcnt
        