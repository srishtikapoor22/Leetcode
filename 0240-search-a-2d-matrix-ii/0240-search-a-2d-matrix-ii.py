class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #binary search
        # n=len(matrix)
        # m=len(matrix[0])
        # for i in range(m):
        #     low=0
        #     high=n-1
        #     while(high>=low):
        #         mid=low+(high-low)//2
        #         if target==matrix[i][mid]:
        #             return True
        #         elif target<matrix[i][mid]:
        #             high=mid-1
        #         else:
        #             low=mid+1
        # return False

        row=0
        col=len(matrix[0])-1
        while row<len(matrix) and col>=0:
            if target==matrix[row][col]:
                return True
            elif target<matrix[row][col]:
                col-=1
            else:
                row+=1
        return False


        
        