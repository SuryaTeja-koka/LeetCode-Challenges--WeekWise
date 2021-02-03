class Solution:
       def calPoints(self, ops):
        """
        :type ops: List[str]
        :rtype: int
        """
        stack = []
        
        for i in range(len(ops)):
            if ops[i] == "C":
                stack.pop()
            elif ops[i] == "+":
                stackLen = len(stack)
                sumI = stack[stackLen-1] + stack[stackLen-2]
                stack.append(sumI)
            elif ops[i] == "D":
                d = stack[len(stack)-1] * 2
                stack.append(d)
            else:
                stack.append(int(ops[i]))
                
        return sum(stack)
