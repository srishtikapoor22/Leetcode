class Solution:
    def searchMatrix(self, matrix: list[list[int]], target: int) -> bool:
        low=0
        high=len(matrix)-1
        while(low<=high):
            mid=low+(high-low)//2
            if target==matrix[mid][0]:
                return True
            elif target<matrix[mid][0]:
                high=mid-1
            else:
                low=mid+1
        row=high
        if row<0:
            return False
        internallow=0
        internalhigh=len(matrix[0])-1
        while(internallow<=internalhigh):
            internalmid=internallow+(internalhigh-internallow)//2
            if target==matrix[row][internalmid]:
                return True
            elif target<=matrix[row][internalmid]:
                internalhigh=internalmid-1
            else:
                internallow=internalmid+1
        return False
