class Solution:
    def findPeakGrid(self, mat: list[list[int]]) -> list[int]:
        row=len(mat)
        col=len(mat[0])
        low=0
        high=len(mat)-1
        while(low<high):
            mid=low+(high-low)//2
            highcol=0
            for i in range(1,col):
                if mat[mid][i]>mat[mid][highcol]:
                    highcol=i
            if mat[mid][highcol]>mat[mid+1][highcol]:
                high=mid
            else:
                low=mid+1
        highcol=0
        for i in range(0,col):
            if mat[low][highcol]<mat[low][i]:
                highcol=i
        return [low,highcol]

         

        