class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        result = [0]*(len(nums))
        l = 0
        r = len(nums)-1
        for i in range(len(nums)-1, -1, -1):
            if l == r:
                result[i] = nums[r]**2
            if nums[l]**2 > nums[r]**2:
                result[i]=nums[l]**2
                l += 1      
            else:
                result[i] = nums[r]**2      
                r -= 1          
        return result
