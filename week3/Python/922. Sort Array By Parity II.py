class Solution:
    def sortArrayByParityII(self, a: List[int]) -> List[int]:
        j=1
        for i in range(0,len(a),2):
            if a[i] % 2:
                while a[j] % 2:
                    j+=2
                a[i],a[j]=a[j],a[i]
        return a
