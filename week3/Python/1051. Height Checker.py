class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        surya = sorted(heights)
        count = 0
        for i in range(len(heights)):
            if(surya[i]!=heights[i]):
                count+=1
        return count
