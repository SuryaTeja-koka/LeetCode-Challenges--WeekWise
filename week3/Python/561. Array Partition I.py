class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        s = 0
        nums.sort()
        for i in range(len(nums)):
            if(i%2==0):
                s = s+nums[i]
                
        return s
