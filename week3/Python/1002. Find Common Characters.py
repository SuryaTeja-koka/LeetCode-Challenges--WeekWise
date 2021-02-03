class Solution:
    def commonChars(self, A: List[str]) -> List[str]:
        chars = set(A[0])
        result = []
        for c in chars:
            m = min(word.count(c) for word in A)
            result += [c] * m
        return result
