class MyStack:

    def __init__(self):
        
        self.stack = [] #creating an empty list(stack)

    def push(self, x: int) -> None:
        
        self.x = x
        self.stack.append(self.x) #adding an element using append

    def pop(self) -> int:
        
        return self.stack.pop()  #removing the last Element Using pop

    def top(self) -> int:
        
        return self.stack[-1]

    def empty(self) -> bool:
        
        return len(self.stack) == 0 #if stack is empty


