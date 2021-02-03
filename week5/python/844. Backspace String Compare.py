class Solution:
    def backspaceCompare(self, S: str, T: str) -> bool:
        return self.getFinalString(S) == self.getFinalString(T)
    
    def getFinalString(self, S):
        result = ''
        bs_count = 0
        for i in range(len(S)-1, -1, -1):
            if S[i] == '#':
                bs_count += 1
            else:
                if bs_count > 0:
                    bs_count -= 1
                else:
                    result += S[i]
        return result
