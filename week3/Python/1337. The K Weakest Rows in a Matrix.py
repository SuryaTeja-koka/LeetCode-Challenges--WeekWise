class Solution:
    def kWeakestRows(self, mat: List[List[int]], k: int) -> List[int]:
        out = []
        for i,arr in enumerate(mat):
            score = self.getScore(arr)
            out.append([score, i])
        out.sort(key=lambda x: x[0])
        return [out[i][1] for i in range(k)]
    
    
    def getScore(self, arr):
        start, end = 0, len(arr)
        while start < end:
            mid = (start + end) // 2
            if arr[mid] == 1:
                start = mid + 1
            else:
                end = mid
        return start
        
