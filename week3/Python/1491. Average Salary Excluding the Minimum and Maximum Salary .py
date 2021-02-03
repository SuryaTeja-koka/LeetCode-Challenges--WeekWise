class Solution:
    def average(self, salary: List[int]) -> float:
        surya = sorted(salary)
        avg = 0
        n= len(surya)
        s=0
        for i in range(len(surya)):
            s = s+surya[i]
        s = s- (surya[0]+surya[n-1])
        avg =s/(n-2)
        return avg
