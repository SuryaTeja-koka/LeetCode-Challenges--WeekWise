class Solution:
    def removeDuplicates(self, S: str) -> str:
        stack = []
        # stack anaedhi oka empty stack manaki
        
        for i in S: # aah input string lo iterative avutunnam
            if stack == [] or stack[-1] != i:      # okavaela stack empty or the last element and iterative var equal kaakapothae ahappudu push chaestunnam
                stack.append(i)
            else:
                stack.pop()
        return ''.join(stack)   # returning the stack as a string
