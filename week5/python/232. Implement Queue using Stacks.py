class MyQueue:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.s1 = []
        self.s2 = []

    def push(self, x: int) -> None:
        """
        Push element x to the back of queue.
        """
        if self.s1 == []:self.front = x
        self.s1.append(x)
        

    def pop(self) -> int:
        """
        Removes the element from in front of queue and returns that element.
        """
        if self.s2 == []:
            while self.s1 != []:self.s2.append(self.s1.pop())
        return self.s2.pop()
                
        
        

    def peek(self) -> int:
        """
        Get the front element.
        """
        if self.s2 != []:return self.s2[-1]
        return self.front
        

    def empty(self) -> bool:
        """
        Returns whether the queue is empty.
        """
        return self.s1 == self.s2 == []
