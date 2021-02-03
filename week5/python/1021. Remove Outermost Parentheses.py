class Solution:
    def removeOuterParentheses(self, S: str) -> str:
        stack=[];o=0
        for i in S:
            if i=='(' and o>0:
                stack.append(i)
            if i==')' and o>1:
                stack.append(')')
            if i=='(':
                o+=1 
            else:
                o-=1
        return ''.join(stack)
    
