class Solution:
    def canMakeArithmeticProgression(self, arr: List[int]) -> bool:
        surya = sorted(arr)
        d= surya[1]-surya[0]
        d1=0
        for i in range(2,len(surya)):
            d1 = surya[i] - surya [i-1]
            if(d1 != d):
                return False
        return True
        1502. Can Make Arithmetic Progression From Sequence 
